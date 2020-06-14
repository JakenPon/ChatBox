import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class WelcomeWindow extends JFrame {
	private JLabel welcomeTextLabel;
	private JButton signInButton;
	private JButton signUpButton;
	private JLabel usernameLabel;
	private JTextField usernameField;
	private JLabel passwordLabel;
	private JTextField passwordField;
	private JButton submitButton;
	
	
	public WelcomeWindow() {
		super();
	}
	
	public void setView() {	
		this.setResizable(false);
		this.setSize(new Dimension(700, 350));
		this.setTitle("ChatBox");
		this.setBackground(Color.PINK);
		this.setLocationRelativeTo(null);
		
		Border blackline = BorderFactory.createLineBorder(Color.BLACK);
		
		JPanel pan = new JPanel();
		this.setContentPane(pan);
		pan.setBackground(Color.PINK);
		pan.setBorder(blackline);
		
		this.setLayout(new BoxLayout(pan, BoxLayout.Y_AXIS));
		
		this.welcomeTextLabel = new JLabel("Bienvenue!");
		welcomeTextLabel.setBorder(blackline);
		pan.add(welcomeTextLabel);
		
		JPanel signPanel = new JPanel();
		signPanel.setLayout(new BoxLayout(signPanel, BoxLayout.X_AXIS));
		signPanel.setBackground(Color.PINK);
		signPanel.setBorder(blackline);
		this.signInButton = createButton("SignIn", Color.BLUE, Color.WHITE);
		this.signUpButton = createButton("SignUp", Color.RED, Color.WHITE);
		signPanel.add(signInButton);
		signPanel.add(signUpButton);
		pan.add(signPanel);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.X_AXIS));
		loginPanel.setBackground(Color.PINK);
		loginPanel.setBorder(blackline);
		
		this.usernameLabel = new JLabel("Username", SwingConstants.RIGHT);
		this.usernameField = new JTextField();
		loginPanel.add(usernameLabel);
		loginPanel.add(usernameField);
		pan.add(loginPanel);
		
		JPanel passwordPanel = new JPanel();
		passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.X_AXIS));
		passwordPanel.setBackground(Color.PINK);
		this.passwordLabel = new JLabel("Password", SwingConstants.RIGHT);
		this.passwordField = new JTextField();
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordField);
		pan.add(passwordPanel);
		
		this.submitButton = createButton("CONNEXION", Color.BLACK, Color.WHITE);
		pan.add(submitButton);
	
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		
	public void clearScreen() {
		// Rendre la page complétement blanche pour passer à la prochaine page
	}
	
	public JButton createButton(String name, Color color, Color textColor) {
		JButton b = new JButton(name);
		b.setBackground(color);
		b.setOpaque(true);
		b.setBorderPainted(false);
		b.setForeground(textColor);
		return b;
	}
	
	
}
