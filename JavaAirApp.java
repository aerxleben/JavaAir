import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class JavaAirApp extends JFrame{
	private HomePanel aHomeView;
	
	public JavaAirApp(){
		this.setTitle("Welcome to Java Air!");
		
		/********************* The View ****************************/
		aHomeView = new HomePanel();
		add(aHomeView);
		

		//Set frame to close when exit is clicked and default frame size
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1300, 600);
	}
	
	//main method
	public static void main(String args[]){
		JFrame frame = new JavaAirApp();
		new JavaAirApp().setVisible(true);
	}
	
}