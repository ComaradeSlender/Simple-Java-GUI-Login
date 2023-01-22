import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class gui implements ActionListener {
	
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JLabel failed;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(500 , 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
        
		panel.setLayout(null); 
		
		userlabel = new JLabel("User Name");
		userlabel.setBounds(10 , 2 , 80 , 10);
		panel.add(userlabel);
		
		userText = new JTextField(20);
		userText.setBounds(100 , 2 , 165 , 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new gui());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10 , 110 , 300 , 25);
		panel.add(success);
		
		failed = new JLabel("");
		failed.setBounds(10 , 110 , 300 , 25);
		panel.add(failed);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + " , " + password);
		
		if(user.equals("Comarade") && password.equals("ihateblackpeople")) {
			success.setText("Login Successful");
		}
		else { 
		failed.setText("User Name Or The Password IS Wrong ");	}

	}
}
