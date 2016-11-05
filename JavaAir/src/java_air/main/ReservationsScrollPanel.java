package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: ReservationsScrollPanel.java
 * Author: Amy Erxleben
 * Creation: 2016-11-02
 * 
 * Changelog:
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReservationsScrollPanel extends JPanel{
    
    private JScrollPane scrollPane;
    private JPanel panel;
    
    public ReservationsScrollPanel() {
        this.setOpaque(false);
        BoxLayout layout = new BoxLayout(this,BoxLayout.Y_AXIS); 
        this.setLayout(layout);
        
        for(int i=1;i<5;i++){
        ReservationInfoPanel aReservationInfoPanel = new ReservationInfoPanel();
        add(aReservationInfoPanel);
        }
    }
}