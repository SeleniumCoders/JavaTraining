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

public class CheckBox extends JFrame {
	JTextField withText;
	
	JCheckBox regchk;
	
	public CheckBox() {
		super("Title");
		
		setLayout(new FlowLayout());
		
		
		
		withText = new JTextField("Editable", 20);
		withText.setEditable(true);
		add(withText);
		
	
		
		regchk = new JCheckBox("Bold");
		add(regchk);
		
		Handler handler = new Handler();
		withText.addActionListener(handler);
		
		CustStateHandler stateHandler = new CustStateHandler();
		regchk.addActionListener(handler);
		regchk.addItemListener(stateHandler);
		
		
		
	}
	
	//ActionListener  - USed to listen Action
	
	private class Handler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) {
			String str = "";
			//Get source returns element from where action received
			if(event.getSource()==withText)
				str = String.format("Field 2 : %s", event.getActionCommand()); //getActionCommand - Receives value entered in field
			
			else if(event.getSource()==regchk)
				str = String.format("Making 2nd textbox to bold %s", event.getActionCommand()); //getActionCommand - Receives value entered in field
			
			JOptionPane.showMessageDialog(null	, str);
		}
		
		
		
		
	}
	
	//ItemListener - Used to update ele based on event
	private class CustStateHandler implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(regchk.isSelected())
			{
				withText.setFont(new Font("Serif",Font.BOLD, 14));
			}
			
		}
		
	}
}
