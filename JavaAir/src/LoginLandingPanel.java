/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: LoginLandingPanel.java
 * Author: Steve Jia
 * Creation: 2016-10-22
 * 
 * Changelog:
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginLandingPanel extends JPanel{
    private MenuBannerPanel aMenuBannerPanel;
    
    public LoginLandingPanel(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);

        aMenuBannerPanel = new MenuBannerPanel();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 9;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
            //constraints.insets = new Insets(12,12,3,3);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(aMenuBannerPanel, constraints);
        add(aMenuBannerPanel);
    }
}
