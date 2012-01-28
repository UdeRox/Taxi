/**
 * 
 */
package taxi.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Person entity class.
 * </p>
 * 
 * @author UdeRox
 */
@Entity
public class Person implements Serializable
{
    private static final long serialVersionUID = -2260823915784764652L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String firstName;
    private String lastName;
    private String nicNo;
    
    @Embedded
    private ContactDetails contactDetails;
    /**
     * <p>
     * Getter for id.
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
     * Setting value for id.
     * </p>
     * 
     * @param id
     *            the id to set
     */
    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * <p>
     * Getter for firstName.
     * </p>
     * 
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * <p>
     * Setting value for firstName.
     * </p>
     * 
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * <p>
     * Getter for lastName.
     * </p>
     * 
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * <p>
     * Setting value for lastName.
     * </p>
     * 
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * <p>
     * Getter for nicNo.
     * </p>
     * 
     * @return the nicNo
     */
    public String getNicNo()
    {
        return nicNo;
    }

    /**
     * <p>
     * Setting value for nicNo.
     * </p>
     * 
     * @param nicNo
     *            the nicNo to set
     */
    public void setNicNo(String nicNo)
    {
        this.nicNo = nicNo;
    }

    /**
     * <p>
     * Getter for contactDetails.
     * </p>
     * 
     * @return the contactDetails
     */
    public ContactDetails getContactDetails()
    {
        return contactDetails;
    }

    /**
     * <p>
     * Setting value for contactDetails.
     * </p>
     * 
     * @param contactDetails the contactDetails to set
     */
    public void setContactDetails(ContactDetails contactDetails)
    {
        this.contactDetails = contactDetails;
    }
}
