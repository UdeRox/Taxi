/*
 * FILENAME
 *     Rank.java
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

package taxi.com.model.enums;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * <p>
 * Rank enum
 * </p>
 * 
 * @author UdeRox
 * 
 * @version $Id$
 **/
public enum Rank
{
    GOLD("Gold"),
    BRONCE("Bronce");

    private String description;

    private Rank(final String desc)
    {
        this.description = desc;
    }

    /**
     * {@inheritedDoc}
     */
    @Override
    public String toString()
    {
        return this.description;
    }
}
