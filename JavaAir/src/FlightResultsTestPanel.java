
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/** This lays out components in a column that is constrained to the
top of an area, like the entries in a list or table.  It uses a GridLayout
for the main components, thus ensuring they are each of the same size.
For variable height components, a BoxLayout would be better. */
class FlightResultsTestPanel extends JPanel{
    private Image background;
    
    FlightResultsTestPanel() {
        JPanel gui = (JPanel)this;
        
        background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
        
        this.setLayout(new BorderLayout(5,5));
        this.setBorder(new EmptyBorder(3,3,3,3));

        FlightSearchPanel panelSearch = new FlightSearchPanel();
        this.add(panelSearch, BorderLayout.WEST);
        
        JPanel scrollPanel = new JPanel(new BorderLayout(2,2));
        scrollPanel.setBackground(Color.green);
        //scrollPanel.add(new JLabel("Center"), BorderLayout.CENTER);
        this.add(new JScrollPane(scrollPanel), BorderLayout.CENTER);
        //this.add(new JScrollPane(scrollPanel), BorderLayout.EAST);

        final JPanel componentPanel = new JPanel(new GridLayout(0,1,3,3));
        componentPanel.setBackground(Color.orange);
        scrollPanel.add(componentPanel, BorderLayout.NORTH);

        JButton add = new JButton("Add Flights");
        this.add(add, BorderLayout.NORTH);
        add.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //componentPanel.add(new JTextField());
                componentPanel.add(new FlightInfoTestPanel());
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
}