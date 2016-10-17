import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel{

	private JButton loginButton;
	private JButton homeButton;
	private JButton reservationButton;
	private JButton accountButton;
	private JButton helpButton;
	private JButton aboutButton;
	private JButton flightStatusButton;
	private JButton checkInButton;
	private JButton employeeLoginButton;
	private FlightSearchPanel aFlightSearchPanel;

	private Image background;

	public JButton getLoginButton(){return loginButton;}
	public JButton getHomeButton(){return homeButton;}
	public JButton getReservationButton(){return reservationButton;}
	public JButton getAccountButton(){return accountButton;}
	public JButton getHelpButton(){return helpButton;}
	public JButton getAboutButton(){return aboutButton;}
	public JButton getFlightStatusButton(){return flightStatusButton;}
	public JButton getCheckInButton(){return checkInButton;}
	public JButton getEmployeeLoginButton(){return employeeLoginButton;}
	public FlightSearchPanel getFlightSearchPanel(){return aFlightSearchPanel;}

	public HomePanel(){
		//this.setBackground(new Color(WHITE));

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		setLayout(layout);

		background = Toolkit.getDefaultToolkit().createImage("heart.jpg");

		this.setBackground(Color.WHITE);

		Color buttonColor = new Color(100,76,55);

		JLabel javaAirLabel = new JLabel("Java Air");
          javaAirLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 128));
          javaAirLabel.setIcon(new ImageIcon("plane.jpg"));
          javaAirLabel.setHorizontalAlignment(JLabel.LEFT);
          javaAirLabel.setForeground(buttonColor);
          javaAirLabel.setBackground(Color.WHITE);
          javaAirLabel.setOpaque(true);
          constraints.gridx = 0;
          constraints.gridy = 0;
          constraints.gridwidth = 7;
          constraints.gridheight = 2;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12,12,3,3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(javaAirLabel, constraints);
          add(javaAirLabel);

        loginButton = new JButton("LOGIN");
          loginButton.setFont(new Font("Times",Font.PLAIN, 30));
          loginButton.setBackground(buttonColor);
          loginButton.setForeground(Color.WHITE);
          constraints.gridx = 6;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(loginButton, constraints);
          add(loginButton);

		homeButton = new JButton("HOME");
          homeButton.setFont(new Font("Times",Font.PLAIN, 30));
          homeButton.setBackground(buttonColor);
          homeButton.setForeground(Color.WHITE);
          constraints.gridx = 0;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(homeButton, constraints);
          add(homeButton);

        reservationButton = new JButton("RESERVATIONS");
          reservationButton.setFont(new Font("Times",Font.PLAIN, 30));
          reservationButton.setBackground(buttonColor);
          reservationButton.setForeground(Color.WHITE);
          constraints.gridx = 1;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
        //  constraints.insets = new Insets(12,12,3,3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(reservationButton, constraints);
          add(reservationButton);

        accountButton = new JButton("ACCOUNT");
          accountButton.setFont(new Font("Times",Font.PLAIN, 30));
          accountButton.setBackground(buttonColor);
          accountButton.setForeground(Color.WHITE);
          constraints.gridx = 2;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(accountButton, constraints);
          add(accountButton);

       	helpButton = new JButton("HELP");
  		  helpButton.setFont(new Font("Times",Font.PLAIN, 30));
  		  helpButton.setBackground(buttonColor);
  		  helpButton.setForeground(Color.WHITE);
          constraints.gridx = 3;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
//          constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(helpButton, constraints);
          add(helpButton);

        aboutButton = new JButton("ABOUT");
          aboutButton.setFont(new Font("Times",Font.PLAIN, 30));
          aboutButton.setBackground(buttonColor);
          aboutButton.setForeground(Color.WHITE);
          constraints.gridx = 4;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(aboutButton, constraints);
          add(aboutButton);

        JButton annonymousButton = new JButton("");
          annonymousButton.setFont(new Font("Times",Font.PLAIN, 30));
          annonymousButton.setBackground(buttonColor);
          constraints.gridx = 5;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(annonymousButton, constraints);
          add(annonymousButton);

        JLabel welcomeLabel = new JLabel("Welcome");
          welcomeLabel.setFont(new Font("Serif", Font.ITALIC, 72));
          welcomeLabel.setHorizontalAlignment(JLabel.LEFT);
          welcomeLabel.setForeground(buttonColor);
          constraints.gridx = 0;
          constraints.gridy = 3;
          constraints.gridwidth = 2;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12,12,3,3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(welcomeLabel, constraints);
          add(welcomeLabel);

        aFlightSearchPanel = new FlightSearchPanel();
          constraints.gridx = 1;
          constraints.gridy = 4;
          constraints.gridwidth = 3;
          constraints.gridheight = 2;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(aFlightSearchPanel, constraints);
          add(aFlightSearchPanel);

        flightStatusButton = new JButton("FLIGHT STATUS");
          flightStatusButton.setFont(new Font("Times",Font.PLAIN, 30));
          flightStatusButton.setBackground(buttonColor);
          flightStatusButton.setForeground(Color.WHITE);
          constraints.gridx = 4;
          constraints.gridy = 4;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(0, 12, 0, 0);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(flightStatusButton, constraints);
          add(flightStatusButton);

       checkInButton = new JButton("CHECK IN");
          checkInButton.setFont(new Font("Times",Font.PLAIN, 30));
          checkInButton.setBackground(buttonColor);
          checkInButton.setForeground(Color.WHITE);
          constraints.gridx = 4;
          constraints.gridy = 5;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(0, 12, 0, 0);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(checkInButton, constraints);
          add(checkInButton);

        employeeLoginButton = new JButton("<html>" + "EMPLOYEE" + "<br>" + "LOGIN" + "</html>");
          employeeLoginButton.setFont(new Font("Times",Font.PLAIN, 20));
          employeeLoginButton.setHorizontalAlignment(JButton.CENTER);
          employeeLoginButton.setBackground(Color.WHITE);
          constraints.gridx = 6;
          constraints.gridy = 6;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(employeeLoginButton, constraints);
          add(employeeLoginButton);

	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(background,0,0,null);
	}
}