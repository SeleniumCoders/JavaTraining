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

public class ButtonEx extends JFrame {
	
	JButton regButton,disButton,customImageButton, customImageButton2;
	
	
	public ButtonEx() {
		super("Title");
		
		setLayout(new FlowLayout());
		
		
		
		
		regButton = new JButton("Submit");
		regButton.setEnabled(true);
		add(regButton);
		
		
		disButton = new JButton();
		disButton.setEnabled(false);
		add(disButton);
		
		customImageButton = new JButton();
		customImageButton.setEnabled(true);
		Icon i = new ImageIcon("F:\\CoreJava\\Programs\\JavaTraining\\12_JOptionPanel\\btn.png");
		customImageButton.setIcon(i);
		add(customImageButton);
		
		Icon x = new ImageIcon("F:\\CoreJava\\Programs\\JavaTraining\\12_JOptionPanel\\btn.png");
		Icon y = new ImageIcon("F:\\CoreJava\\Programs\\JavaTraining\\12_JOptionPanel\\x.png");
		
		customImageButton2 = new JButton("Image Update on Curser Move",y);
		customImageButton2.setRolloverIcon(x);
		add(customImageButton2);
	
		Handler handler = new Handler();
	
		regButton.addActionListener(handler);
		disButton.addActionListener(handler);
		customImageButton.addActionListener(handler);
		customImageButton2.addActionListener(handler);
		
	
		
		
	}
	
	//ActionListener  - USed to listen Action
	
	private class Handler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) {
			String str = "";
			//Get source returns element from where action received
			if(event.getSource()==disButton)
				str = String.format("%s", event.getActionCommand()); //getActionCommand - Receives value entered in field
			
			else if(event.getSource()==regButton)
				str = String.format("%s", event.getActionCommand()); //getActionCommand - Receives value entered in field
			
			else if(event.getSource()==customImageButton)
				str = String.format("%s", event.getActionCommand()); //getActionCommand - Receives value entered in field
			
			else if(event.getSource()==customImageButton2)
				str = String.format("%s", event.getActionCommand()); //getActionCommand - Receives value entered in field
			
			
			JOptionPane.showMessageDialog(null	, str);
		}
		
		
		
		
	}
	
}
