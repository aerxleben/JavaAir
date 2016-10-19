/*
 *This file "Panel Test" is designed to be a simple frame in wich to
 * open test panels.
 *
 * Created 10/19/16 Erxleben
 *
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PanelTest extends JFrame{
	
	private RegistrationPanel aRegistrationPanel;
	
	public PanelTest(){
		aRegistrationPanel = new RegistrationPanel();
		add(aRegistrationPanel);
		
		//Set frame to close when exit is clicked and default frame size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1300, 800);
	}
	
	public static void main(String args[]){
		JFrame frame = new PanelTest();
		new PanelTest().setVisible(true);
	}
}
	