/*
 * FILENAME
 *     TestPersonService.java
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

package taxi.com.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import taxi.com.model.Person;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * <p>
 * Test classes for the {@link PersonServiceImpl}.
 * </p>
 * 
 * @author UdeRox
 * 
 * @version $Id$
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath*:*/applicationContext.xml"
})
public class TestPersonService
{
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PersonServiceImpl personService;


    /**
     * <p>
     * Test the method in {@link PersonServiceImpl#create(taxi.com.model.Person)}.
     * </p>
     */
    @Test
    @Transactional
    public void createPersonTest()
    {
                personService.create(new Person());
    }

    /**
     * <p>
     * Getter for personService.
     * </p>
     * 
     * @return the personService
     */
    public PersonServiceImpl getPersonService()
    {
        return personService;
    }

    /**
     * <p>
     * Setting value for personService.
     * </p>
     * 
     * @param personService the personService to set
     */
    public void setPersonService(PersonServiceImpl personService)
    {
        this.personService = personService;
    }
}
