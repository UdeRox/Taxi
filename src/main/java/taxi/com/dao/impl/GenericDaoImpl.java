package taxi.com.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import taxi.com.dao.IGenericDao;

/**
 * <p>
 * Implementation of {@link IGenericDao} and this is abstract class.
 * </p>
 * 
 * @author UdeRox
 */
public abstract class GenericDaoImpl<T, PK extends Serializable> implements
		IGenericDao<T, PK> {

	protected EntityManager entityManager;

	private final Class<T> persistentClass;

	/**
	 * <p>
	 * Default constructor.
	 * </p>
	 **/
	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	/**
	 * <p>
	 * Setter for entityManager.use spring to set the {@link EntityManager}.
	 * </p>
	 * 
	 * @param anEntityManager
	 *            the entity manager for this Dao.
	 **/
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	public void setEntityManager(final EntityManager anEntityManager) {
		this.entityManager = anEntityManager;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create(final T inNewInstance) {
		entityManager.persist(inNewInstance);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void delete(final T inPersistentObject) {
		T obj = entityManager.merge(inPersistentObject);
		entityManager.remove(obj);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T findById(final PK inId) {
		return entityManager.find(persistentClass, inId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T update(final T inTransientObject) {
		return entityManager.merge(inTransientObject);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Query query = entityManager.createQuery("SELECT obj FROM "
				+ persistentClass.getSimpleName() + " obj");
		return query.getResultList();
	}
}
