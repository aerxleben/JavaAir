package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: ComboBoxRenderer.java
 * Author: Steve Jia
 * Creation: 2016-10-22
 * 
 * Changelog:
 * 
 */
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import static javax.swing.SwingConstants.CENTER;

public class ComboBoxRenderer extends JLabel
                       implements ListCellRenderer{
    private Font uhOhFont;
    
    public ComboBoxRenderer(){
        setOpaque(true);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
    }
    
    @Override
    public Component getListCellRendererComponent(
                                       JList list,
                                       Object value,
                                       int index,
                                       boolean isSelected,
                                       boolean cellHasFocus) {
        setText(value.toString());
        setFont(Global.boldFont);

        return this;
    }

}//end class: ComboBoxRenderer