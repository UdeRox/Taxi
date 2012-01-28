/*
 * FILENAME
 *     Cutomer.java
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

import taxi.com.model.enums.PaymentMethod;
import taxi.com.model.enums.Rank;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * <p>
 * Customer details class
 * </p>
 * 
 * @author UdeRox
 * 
 * @version $Id$
 **/
@Entity
public class Customer extends Person
{
    private static final long serialVersionUID = 3661759323335060224L;

    @Enumerated
    private Rank rank;
    @Enumerated
    private PaymentMethod paymentMethod;
    private boolean isCreditCustomer;
    /**
     * <p>
     * Getter for rank.
     * </p>
     * 
     * @return the rank
     */
    public Rank getRank()
    {
        return rank;
    }
    /**
     * <p>
     * Setting value for rank.
     * </p>
     * 
     * @param rank the rank to set
     */
    public void setRank(Rank rank)
    {
        this.rank = rank;
    }
    /**
     * <p>
     * Getter for paymentMethod.
     * </p>
     * 
     * @return the paymentMethod
     */
    public PaymentMethod getPaymentMethod()
    {
        return paymentMethod;
    }
    /**
     * <p>
     * Setting value for paymentMethod.
     * </p>
     * 
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(PaymentMethod paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }
    /**
     * <p>
     * Getter for isCreditCustomer.
     * </p>
     * 
     * @return the isCreditCustomer
     */
    public boolean isCreditCustomer()
    {
        return isCreditCustomer;
    }
    /**
     * <p>
     * Setting value for isCreditCustomer.
     * </p>
     * 
     * @param isCreditCustomer the isCreditCustomer to set
     */
    public void setCreditCustomer(boolean isCreditCustomer)
    {
        this.isCreditCustomer = isCreditCustomer;
    }
}
