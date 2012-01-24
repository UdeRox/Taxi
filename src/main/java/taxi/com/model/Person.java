/**
 * 
 */
package taxi.com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author UdeRox
 * 
 */
@Entity
public class Person implements Serializable
{
    private static final long serialVersionUID = -2260823915784764652L;
    public static final String TIME_LOGIN = "login";
    public static final String TIME_LOG_OUT = "logout";
    public static final String BARCODE = "barCode";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String barCode;

    @Column(unique = true, nullable = false)
    private String barCodeNDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date login;

    @Temporal(TemporalType.TIMESTAMP)
    private Date logout;

    /**
     * <p>
     * Getter method for id
     * </p>
     * 
     * @return the id
     */
    public long getId()
    {
        return id;
    }

    /**
     * <p>
     * Setter method for inId
     * </p>
     * 
     * @param inId
     *            the id to set
     */
    public void setId(final long inId)
    {
        id = inId;
    }

    /**
     * <p>
     * Getter method for barCode
     * </p>
     * 
     * @return the barCode
     */
    public String getBarCode()
    {
        return barCode;
    }

    /**
     * <p>
     * Setter method for inBarCode
     * </p>
     * 
     * @param inBarCode
     *            the barCode to set
     */
    public void setBarCode(final String inBarCode)
    {
        barCode = inBarCode;
    }

    /**
     * <p>
     * Getter method for login
     * </p>
     * 
     * @return the login
     */
    public Date getLogin()
    {
        return login;
    }

    /**
     * <p>
     * Setter method for inLogin
     * </p>
     * 
     * @param inLogin
     *            the login to set
     */
    public void setLogin(final Date inLogin)
    {
        login = inLogin;
    }

    /**
     * <p>
     * Getter method for logout
     * </p>
     * 
     * @return the logout
     */
    public Date getLogout()
    {
        return logout;
    }

    /**
     * <p>
     * Setter method for inLogout.
     * </p>
     * 
     * @param inLogout
     *            the logout to set
     */
    public void setLogout(final Date inLogout)
    {
        logout = inLogout;
    }

    /**
     * <p>
     * Setter method for barCodeNDate
     * </p>
     * 
     * @param barCodeNDate
     *            the barCodeNDate to set
     */
    public void setBarCodeNDate(final String barCodeNDate)
    {
        this.barCodeNDate = barCodeNDate;
    }

    /**
     * <p>
     * Getter method for barCodeNDate
     * </p>
     * 
     * @return the barCodeNDate
     */
    public String getBarCodeNDate()
    {
        return barCodeNDate;
    }
}
