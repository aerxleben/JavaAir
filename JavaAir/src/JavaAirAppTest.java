
import java.awt.*;
import javax.swing.*;


public class JavaAirAppTest extends JFrame{
    Container pane;
    CardLayout cardLayout;
    
    public JavaAirAppTest(){
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);
        
        pane = this.getContentPane();
        
        JMenuBar menuBar = new JMenuBar();
        JMenuItem menuItemHome = new JMenuItem("Home");
        JMenuItem menuItemReservation = new JMenuItem("Reservation");
        JMenuItem menuItemAccount = new JMenuItem("Account");
        JMenuItem menuItemHelp = new JMenuItem("Help");
        JMenuItem menuItemAbout = new JMenuItem("About");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        
        Font menuItemFont = new Font("Times", Font.BOLD, 20);
        menuItemHome.setFont(menuItemFont);
        menuItemHome.setBackground(Color.RED);
        menuItemReservation.setFont(menuItemFont);
    }//end JavaAirAppTest()
}
