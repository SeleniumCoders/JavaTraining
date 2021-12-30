import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextBox extends JFrame {
	JTextField planeText;
	JTextField withText;
	JTextField disabledText ;
	JPasswordField password;
	
	public TextBox() {
		super("Title");
		
		setLayout(new FlowLayout());
		
		
		
		planeText = new JTextField(20);
		planeText.setEditable(true);
		add(planeText);
		
		withText = new JTextField("Editable", 20);
		withText.setEditable(true);
		add(withText);
		
		disabledText = new JTextField("Non Editable", 20);
		disabledText.setEditable(false);
		add(disabledText);
		
		password = new JPasswordField(40);
		add(password);
		
		
		Handler handler = new Handler();
		planeText.addActionListener(handler);
		withText.addActionListener(handler);
		disabledText.addActionListener(handler);
		password.addActionListener(handler);
		
		
		
		
	}
	
	//ActionListener  - USed to listen Action
	
	private class Handler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) {
			String str = "";
			//Get source returns element from where action received
			if(event.getSource()==planeText)
				str = String.format("Field 1 : %s", event.getActionCommand()); //getActionCommand - Receives value entered in field
			else if(event.getSource()==withText)
				str = String.format("Field 2 : %s", event.getActionCommand()); //getActionCommand - Receives value entered in field
			else if(event.getSource()==disabledText)
				str = String.format("Field 3 : %s", event.getActionCommand()); //getActionCommand - Receives value entered in field
			else if(event.getSource()==password)
				str = String.format("Field 4 : %s", event.getActionCommand()); //getActionCommand - Receives value entered in field
		
			JOptionPane.showMessageDialog(null	, str);
		}
		
		
		
		
	}
	
}
