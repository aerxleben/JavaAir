
package java_air.main;

import java.util.ArrayList;
import java_air.database.DataClient;
import java_air.panel.flight.FlightInfoPanel;
import javax.swing.JOptionPane;

public class FlightStatusPanel extends javax.swing.JPanel {

    /**
     * Creates new form FlightStatusPanel
     */
    public FlightStatusPanel() {
        initComponents();
    }
    
    public void loadFlightStatus(){
        //get a list of flights that have landed
        String queryLandedFlights = "SELECT * " +
                    "FROM FLIGHTS F " +
                    "WHERE F.SCHEDULEDARRIVETIME < TIME('NOW', 'LOCALTIME')";
        getFlightStatus(queryLandedFlights, 1);

        //get a list of flights that are in air
        String queryInFlights = "SELECT * " +
                    "FROM FLIGHTS F " +
                    "WHERE F.SCHEDULEDDEPARTURETIME < TIME('NOW', 'LOCALTIME') " +
                    "AND F.SCHEDULEDARRIVETIME > TIME('NOW', 'LOCALTIME')";
        getFlightStatus(queryInFlights, 2);
        
        //Get a list of lights that have not departed yet
        String queryFutureFlights = "SELECT * " +
                    "FROM Flights F " +
                    "WHERE F.ScheduledDepartureTime > TIME('NOW', 'LOCALTIME')";
        getFlightStatus(queryFutureFlights, 3);

    }//end loadFlightStatus()
    
    private void getFlightStatus(String flightQuery, int queryType){
        try{
            ArrayList<Flight> flightList = new DataClient().getFlightData(flightQuery);
            for(Flight f : flightList){
                FlightInfoPanel infoPanel = new FlightInfoPanel(f);
                infoPanel.changePriceButtonToStatus(queryType == 1 ? "Landed" 
                        : queryType == 2 ? "In-Flight" : "On Time");
                this.panelStatus.add(infoPanel);
            }//end for-loop
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                    , x.getMessage()
                    , "Load Flights Status Error"
                    , JOptionPane.ERROR_MESSAGE);
        }//end try-catch
    }//end getFlightStatus()
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelStatusTitle = new javax.swing.JLabel();
        scrollPaneStatus = new javax.swing.JScrollPane();
        panelInsideScrollPane = new javax.swing.JPanel();
        panelStatus = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        labelStatusTitle.setFont(Global.boldFont);
        labelStatusTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatusTitle.setText("Java Air Flight Status");
        labelStatusTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelStatusTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(labelStatusTitle, java.awt.BorderLayout.NORTH);

        panelInsideScrollPane.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 102)));
        panelInsideScrollPane.setLayout(new java.awt.BorderLayout());

        panelStatus.setLayout(new java.awt.GridLayout(3, 1, 0, 2));
        panelInsideScrollPane.add(panelStatus, java.awt.BorderLayout.CENTER);

        scrollPaneStatus.setViewportView(panelInsideScrollPane);

        add(scrollPaneStatus, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelStatusTitle;
    private javax.swing.JPanel panelInsideScrollPane;
    private javax.swing.JPanel panelStatus;
    private javax.swing.JScrollPane scrollPaneStatus;
    // End of variables declaration//GEN-END:variables
}
