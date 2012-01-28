/*
 * FILENAME
 *     PersonService.java
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

package taxt.com.service;

import java.util.List;

import taxi.com.model.Person;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * <p>
 * Handle Business logics related to person details.
 * </p>
 * 
 * @author UdeRox
 * 
 * @version $Id$
 **/
public interface IPersonService
{
    /**
     * <p>
     * Create a new {@link Person} object.
     * </p>
     * 
     * @param person
     *            {@link Person}
     */
    void create(Person person);

    /**
     * <p>
     * Update existing {@link Person}.
     * </p>
     * 
     * @param person
     *            updated {@link Person}.
     */
    void update(Person person);

    /**
     * <p>
     * Finds the {@link Person} entity for given key.
     * </p>
     * 
     * @param id
     * @return {@link Person}
     */
    Person findById(Long id);

    /**
     * <p>
     * Get all persons from the database.
     * </p>
     * 
     * @return list of {@link Person}
     * 
     */
    List<Person> findAll();
}
