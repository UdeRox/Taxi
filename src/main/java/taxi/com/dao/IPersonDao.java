/*
 * FILENAME
 *     IPersonDao.java
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

package taxi.com.dao;

import java.io.Serializable;

import taxi.com.model.Person;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * <p>
 * Handle Common Database operation such as Create,Delete,Update,Find
 * </p>
 * 
 * @author UdeRox
 * 
 * @version $Id$
 **/
public interface IPersonDao extends IGenericDao<Person, Serializable>
{
}
