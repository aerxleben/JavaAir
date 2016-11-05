package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: FlightResultsPanel.java
 * Author: Steve Jia
 * Creation: 2016-10-25
 * 
 * Changelog:
 * 
 */
import java_air.panel.flight.FlightInfoPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class FlightResultsPanel extends JPanel{
    private Image background;
    
    private FlightSearchPanel panelSearch;
    private JPanel scrollPanel;
    private final JPanel componentPanel;
    
    public FlightResultsPanel() {
        JPanel gui = (JPanel)this;
        
        background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
        
        this.setLayout(new BorderLayout(5,5));
        this.setBorder(new EmptyBorder(3,3,3,3));

        panelSearch = new FlightSearchPanel();
        this.add(panelSearch, BorderLayout.WEST);
        
        scrollPanel = new JPanel(new BorderLayout(2,2));
        scrollPanel.setBackground(Color.green);
        //scrollPanel.add(new JLabel("Center"), BorderLayout.CENTER);
        this.add(new JScrollPane(scrollPanel), BorderLayout.CENTER);
        //this.add(new JScrollPane(scrollPanel), BorderLayout.EAST);

        componentPanel = new JPanel(new GridLayout(0,1,3,3));
        componentPanel.setBackground(Color.orange);
        scrollPanel.add(componentPanel, BorderLayout.NORTH);

        JButton add = new JButton("Add Flights");
        this.add(add, BorderLayout.NORTH);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //componentPanel.add(new JTextField());
                componentPanel.add(new FlightInfoPanel());
                gui.validate();
            }
        });

        Dimension d = this.getPreferredSize();
        d = new Dimension(d.width, d.height+100);
        this.setPreferredSize(d);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background,0,0,null);
    }
    
    public FlightResultsPanel getFlightResultsPanel(){ 
        return this; 
    }
    
    public FlightSearchPanel getFlightSearchPanel(){
        return panelSearch; 
    }
    
    public JPanel getScrollPanel(){
        return scrollPanel; 
    }
    
    public JPanel getComponentPanel(){
        return componentPanel; 
    }
    
    public void setFlightSearchPanel(FlightSearchPanel newSearchPanel){
        if(newSearchPanel != null){
            this.panelSearch = newSearchPanel;
        }
    }
}