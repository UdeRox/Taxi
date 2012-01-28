/*
 * FILENAME
 *     Driver.java
 *
 * FILE LOCATION
 *     $Source$
 *
 * VERSION
 *     $Id$
 *         @version       $Revision$
 *         Check-Out Tag: $Name$
 *         Locked By:     $Lockers$
 *
 * FORMATTING NOTES
 *     * Lines should be limited to 78 characters.
 *     * Files should contain no tabs.
 *     * Indent code using four-character increments.
 *
 * COPYRIGHT
 *     Copyright (C) 2007 Genix Ventures Pty. Ltd. All rights reserved.
 *     This software is the confidential and proprietary information of
 *     Genix Ventures ("Confidential Information"). You shall not
 *     disclose such Confidential Information and shall use it only in
 *     accordance with the terms of the licence agreement you entered into
 *     with Genix Ventures.
 */

package taxi.com.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

import taxi.com.model.enums.Category;
import taxi.com.model.enums.VehicleType;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * <p>
 * Driver details class
 * </p>
 * 
 * @author UdeRox
 * 
 * @version $Id$
 **/
@Entity
public class Driver extends Person
{
    private static final long serialVersionUID = -7549914127203615559L;

    private String vehicleNo;
    private String driverCode; 
    
    @Enumerated
    private VehicleType vehicleType;
    @Enumerated
    private Category category;
    /**
     * <p>
     * Getter for vehicleNo.
     * </p>
     * 
     * @return the vehicleNo
     */
    public String getVehicleNo()
    {
        return vehicleNo;
    }
    /**
     * <p>
     * Setting value for vehicleNo.
     * </p>
     * 
     * @param vehicleNo the vehicleNo to set
     */
    public void setVehicleNo(String vehicleNo)
    {
        this.vehicleNo = vehicleNo;
    }
    /**
     * <p>
     * Getter for driverCode.
     * </p>
     * 
     * @return the driverCode
     */
    public String getDriverCode()
    {
        return driverCode;
    }
    /**
     * <p>
     * Setting value for driverCode.
     * </p>
     * 
     * @param driverCode the driverCode to set
     */
    public void setDriverCode(String driverCode)
    {
        this.driverCode = driverCode;
    }
    /**
     * <p>
     * Getter for vehicleType.
     * </p>
     * 
     * @return the vehicleType
     */
    public VehicleType getVehicleType()
    {
        return vehicleType;
    }
    /**
     * <p>
     * Setting value for vehicleType.
     * </p>
     * 
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(VehicleType vehicleType)
    {
        this.vehicleType = vehicleType;
    }
    /**
     * <p>
     * Getter for category.
     * </p>
     * 
     * @return the category
     */
    public Category getCategory()
    {
        return category;
    }
    /**
     * <p>
     * Setting value for category.
     * </p>
     * 
     * @param category the category to set
     */
    public void setCategory(Category category)
    {
        this.category = category;
    }
}
