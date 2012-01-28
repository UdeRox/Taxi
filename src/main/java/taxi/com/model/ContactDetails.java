package taxi.com.model;

import javax.persistence.Embeddable;

/**
 * <p>
 * Contact details Embeddable Class.
 * </p>
 * 
 * @author UdeRox
 */
@Embeddable
public class ContactDetails
{
    public static final String CONTACT_NO_1 = "contactNo1";
    public static final String CONTACT_NO_2 = "contactNo2";
    public static final String CONTACT_NO_3 = "contactNo2";
    public static final String CONTACT_NO_4 = "conatactNo4";
    public static final String ADDRESS_NO_1 = "addressNo1";
    public static final String STREET_NO_1 = "street1";
    public static final String CITY_1 = "city1";
    public static final String ADDRESS_NO_2 = "addressNo2";
    public static final String STREET_NO_2 = "street2";
    public static final String CITY_2 = "city2";
    
    private String contactNo1;
    private String contactNo2;
    private String contactNo3;
    private String contactNo4;
    
    private String addressNo1;
    private String street1;
    private String city1;

    private String addressNo2;
    private String street2;
    private String ciry2;
    /**
     * <p>
     * Getter for contactNo1.
     * </p>
     * 
     * @return the contactNo1
     */
    public String getContactNo1()
    {
        return contactNo1;
    }
    /**
     * <p>
     * Setting value for contactNo1.
     * </p>
     * 
     * @param contactNo1 the contactNo1 to set
     */
    public void setContactNo1(String contactNo1)
    {
        this.contactNo1 = contactNo1;
    }
    /**
     * <p>
     * Getter for contactNo2.
     * </p>
     * 
     * @return the contactNo2
     */
    public String getContactNo2()
    {
        return contactNo2;
    }
    /**
     * <p>
     * Setting value for contactNo2.
     * </p>
     * 
     * @param contactNo2 the contactNo2 to set
     */
    public void setContactNo2(String contactNo2)
    {
        this.contactNo2 = contactNo2;
    }
    /**
     * <p>
     * Getter for contactNo3.
     * </p>
     * 
     * @return the contactNo3
     */
    public String getContactNo3()
    {
        return contactNo3;
    }
    /**
     * <p>
     * Setting value for contactNo3.
     * </p>
     * 
     * @param contactNo3 the contactNo3 to set
     */
    public void setContactNo3(String contactNo3)
    {
        this.contactNo3 = contactNo3;
    }
    /**
     * <p>
     * Getter for contactNo4.
     * </p>
     * 
     * @return the contactNo4
     */
    public String getContactNo4()
    {
        return contactNo4;
    }
    /**
     * <p>
     * Setting value for contactNo4.
     * </p>
     * 
     * @param contactNo4 the contactNo4 to set
     */
    public void setContactNo4(String contactNo4)
    {
        this.contactNo4 = contactNo4;
    }
    /**
     * <p>
     * Getter for addressNo1.
     * </p>
     * 
     * @return the addressNo1
     */
    public String getAddressNo1()
    {
        return addressNo1;
    }
    /**
     * <p>
     * Setting value for addressNo1.
     * </p>
     * 
     * @param addressNo1 the addressNo1 to set
     */
    public void setAddressNo1(String addressNo1)
    {
        this.addressNo1 = addressNo1;
    }
    /**
     * <p>
     * Getter for street1.
     * </p>
     * 
     * @return the street1
     */
    public String getStreet1()
    {
        return street1;
    }
    /**
     * <p>
     * Setting value for street1.
     * </p>
     * 
     * @param street1 the street1 to set
     */
    public void setStreet1(String street1)
    {
        this.street1 = street1;
    }
    /**
     * <p>
     * Getter for city1.
     * </p>
     * 
     * @return the city1
     */
    public String getCity1()
    {
        return city1;
    }
    /**
     * <p>
     * Setting value for city1.
     * </p>
     * 
     * @param city1 the city1 to set
     */
    public void setCity1(String city1)
    {
        this.city1 = city1;
    }
    /**
     * <p>
     * Getter for addressNo2.
     * </p>
     * 
     * @return the addressNo2
     */
    public String getAddressNo2()
    {
        return addressNo2;
    }
    /**
     * <p>
     * Setting value for addressNo2.
     * </p>
     * 
     * @param addressNo2 the addressNo2 to set
     */
    public void setAddressNo2(String addressNo2)
    {
        this.addressNo2 = addressNo2;
    }
    /**
     * <p>
     * Getter for street2.
     * </p>
     * 
     * @return the street2
     */
    public String getStreet2()
    {
        return street2;
    }
    /**
     * <p>
     * Setting value for street2.
     * </p>
     * 
     * @param street2 the street2 to set
     */
    public void setStreet2(String street2)
    {
        this.street2 = street2;
    }
    /**
     * <p>
     * Getter for ciry2.
     * </p>
     * 
     * @return the ciry2
     */
    public String getCiry2()
    {
        return ciry2;
    }
    /**
     * <p>
     * Setting value for ciry2.
     * </p>
     * 
     * @param ciry2 the ciry2 to set
     */
    public void setCiry2(String ciry2)
    {
        this.ciry2 = ciry2;
    }
}
