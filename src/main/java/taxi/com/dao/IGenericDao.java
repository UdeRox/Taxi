package taxi.com.dao;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Common Database operation such as Create,Delete,Update,Find
 * </p>
 * 
 * @author UdeRox
 * 
 */
public interface IGenericDao<E, PK extends Serializable>
{

    /**
     * <p>
     * Persists the newInstance entity into database.
     * </p>
     * 
     * @param newInstance
     *            Entity to be saved
     */
    public void create(E newInstance);

    /**
     * <p>
     * Updates the given inTransientObject.
     * </p>
     * 
     * @param inTransientObject
     *            Entity to be updated
     * @return the updated inTransientObject
     */
    public E update(final E inTransientObject);

    /**
     * Removes an entity from persistent storage in the database.
     * 
     * @param persistentObject
     *            the object to be deleted
     */
    public void delete(E persistentObject);

    /**
     * Retrieves an entity that was previously persisted to the database using the indicated id as primary key.
     * 
     * @param id
     *            the entity id
     * @return the entity with the given id
     * 
     */
    public E findById(PK id);

    /**
     * <p>
     * Returns all entities from type <code>E</code> from the database.
     * </p>
     * 
     * @return A list of found entities
     */
    public List<E> findAll();
}
