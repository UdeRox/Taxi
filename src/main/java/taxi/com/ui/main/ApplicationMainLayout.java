/*
 * FILENAME
 *     ApplicationMainLayout.java
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

package taxi.com.ui.main;

import com.vaadin.Application;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.themes.BaseTheme;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * <p>
 * This class act as a base UI layout for the application.
 * </p>
 * @author UdeRox
 *
 * @version $Id$
 **/
public class ApplicationMainLayout extends VerticalLayout
{
    private static final long serialVersionUID = 7634787781022205693L;
    
    private HorizontalSplitPanel hSplitPanel = new HorizontalSplitPanel();
    private VerticalLayout vMainLayout = new VerticalLayout();
    private static final String UPPER_BANNER_HEIGHT = "50px";
    private static final String UPPER_BANNER_WIDHT = "100%";

//    public ApplicationMainLayout(final Application app)
    public ApplicationMainLayout()
    {
        setSizeFull();
        vMainLayout.setSizeFull();
        VerticalLayout upperMenuSeperator = new VerticalLayout();

        HorizontalLayout upperBannerLayout = new HorizontalLayout();
        upperBannerLayout.addStyleName("desktop");
        Button logoutButton = new NativeButton("Logout");
        logoutButton.setStyleName(BaseTheme.BUTTON_LINK);
//        logoutButton.addListener(new ClickListener()
//        {
//            private static final long serialVersionUID = 4710758400819556120L;
//
//            /**
//             * {@inheritedDoc}
//             */
//            @Override
//            public void buttonClick(ClickEvent inEvent)
//            {
//                String context = app.getURL().getPath();
//                context = context.substring(0, context.lastIndexOf("/reps"));
//                app.getMainWindow().open(new ExternalResource(context + "/j_spring_security_logout"));
//            }
//        });
        upperBannerLayout.addComponent(logoutButton);
        upperMenuSeperator.addComponent(upperBannerLayout);
        upperMenuSeperator.addComponent(createToolbar());

        addComponent(upperMenuSeperator);

        upperBannerLayout.setWidth(UPPER_BANNER_WIDHT);
        upperBannerLayout.setHeight(UPPER_BANNER_HEIGHT);

        // vMainLayout.setSplitPosition(450, HorizontalSplitPanel.UNITS_PIXELS);
        // vMainLayout.setLocked(true);
//        hSplitPanel.setFirstComponent(new LeftVerticalLayout(this));
        hSplitPanel.setSecondComponent(vMainLayout);

        addComponent(hSplitPanel);
        setExpandRatio(hSplitPanel, 2);
        hSplitPanel.setSplitPosition(250, HorizontalSplitPanel.UNITS_PIXELS);
        hSplitPanel.setLocked(true);
    }

    private HorizontalLayout createToolbar()
    {
        HorizontalLayout hLayout = new HorizontalLayout();
        hLayout.setWidth("100%");
//        hLayout.addComponent(new MenuTabSheet(this));

        return hLayout;
    }

    /**
     * <p>
     * Set the main component of the window.
     * </p>
     * 
     * @param inSetComponent
     */
    public void setApplicationMainComponet(Component inSetComponent)
    {
        vMainLayout.removeAllComponents();
        vMainLayout.addComponent(inSetComponent);
    }
}
