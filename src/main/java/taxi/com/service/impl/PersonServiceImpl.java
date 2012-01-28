/*
 * FILENAME
 *     PersonServiceImpl.java
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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import taxi.com.dao.IPersonDao;
import taxi.com.model.Person;
import taxt.com.service.IPersonService;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * <p>
 * Implementation of {@link IPersonService}.
 * 
 * @author UdeRox
 * 
 * @version $Id$
 **/
@Service
@Transactional
public class PersonServiceImpl implements IPersonService
{

    @Autowired
    private IPersonDao personDao;

    /**
     * {@inheritDoc}
     * 
     * @see taxt.com.service.IPersonService#create(taxi.com.model.Person)
     */
    @Override
    public void create(Person person)
    {
        personDao.create(person);
    }

    /**
     * {@inheritDoc}
     * 
     * @see taxt.com.service.IPersonService#update(taxi.com.model.Person)
     */
    @Override
    public void update(Person person)
    {
        personDao.update(person);
    }

    /**
     * {@inheritDoc}
     * 
     * @see taxt.com.service.IPersonService#findById(java.lang.Long)
     */
    @Override
    public Person findById(Long id)
    {
        return personDao.findById(id);
    }

    /**
     * {@inheritDoc}
     * 
     * @see taxt.com.service.IPersonService#findAll()
     */
    @Override
    public List<Person> findAll()
    {
        return personDao.findAll();
    }
}
