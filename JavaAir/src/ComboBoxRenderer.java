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
    
    /*
    * This method finds the image and text corresponding
    * to the selected value and returns the label, set up
    * to display the text and image.
    */
    public Component getListCellRendererComponent(
                                       JList list,
                                       Object value,
                                       int index,
                                       boolean isSelected,
                                       boolean cellHasFocus) {
        //Get the selected index. (The index param isn't
        //always valid, so just use the value.)
        int selectedIndex = index;
        
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
 
        //Set the icon and text.  If icon was null, say so.
        String airport = Global.airportList[selectedIndex];
        setText(airport);
        setFont(list.getFont());

        return this;
    }
 
    //Set the font and text when no image was found.
    protected void setUhOhText(String uhOhText, Font normalFont) {
        if (uhOhFont == null) { //lazily create this font
            uhOhFont = normalFont.deriveFont(Font.ITALIC);
        }
        setFont(uhOhFont);
        setText(uhOhText);
    }

}//end class: ComboBoxRenderer