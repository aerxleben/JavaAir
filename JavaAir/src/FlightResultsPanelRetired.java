/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: FlightResultsPanel.java
 * Author: Amy Erxleben
 * Creation: 2016-10-23
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlightResultsPanelRetired extends JPanel{
    //private MenuBannerPanel aMenuBannerPanel;
    
    private FlightSearchPanel aFlightSearchPanel;
    
    private FlightInfoPanel aFlight;
    private FlightInfoPanel anotherFlight;
    
    private Image background;
    
    //public MenuBannerPanel getMenuBannerPanel(){return aMenuBannerPanel;}
    public FlightSearchPanel getFlightSearchPanel(){return aFlightSearchPanel;}
    public FlightInfoPanel getResultPanel1(){return aFlight;}
    public FlightInfoPanel getResultPanel2(){return anotherFlight;}

    public FlightResultsPanelRetired(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);
        
      //get image for panel background
      background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
   

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);
        Color backgroundColor = new Color(255,255,255,150);

        /*aMenuBannerPanel = new MenuBannerPanel();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
            //constraints.insets = new Insets(12,12,3,3);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(aMenuBannerPanel, constraints);
        add(aMenuBannerPanel);*/
        
        aFlightSearchPanel = new FlightSearchPanel();
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 4;
        constraints.fill = GridBagConstraints.BOTH;
        //  constraints.insets = new Insets(0, 150, 100, 0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(aFlightSearchPanel, constraints);
        add(aFlightSearchPanel);
        
        /*aFlight = new FlightInfoPanel(true);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(0, 150, 100, 0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(aFlight, constraints);
        add(aFlight);
        
        anotherFlight = new FlightInfoPanel(false);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //  constraints.insets = new Insets(0, 150, 100, 0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(anotherFlight, constraints);
        add(anotherFlight);*/
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
  
}