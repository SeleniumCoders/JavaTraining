import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ComboBox extends JFrame {
	JComboBox cbox;
	JComboBox cbox2;
	JLabel picture;
	Icon icon[] = new Icon[3];
	public ComboBox()
	{
		super("Title");
		icon[0] =  new ImageIcon("F:\\CoreJava\\Programs\\JavaTraining\\12_JOptionPanel\\btn.png");
		icon[1] = new ImageIcon("F:\\CoreJava\\Programs\\JavaTraining\\12_JOptionPanel\\x.png");
		icon[2] =  new ImageIcon("F:\\CoreJava\\Programs\\JavaTraining\\12_JOptionPanel\\btn.png");
		
		
		setLayout(new FlowLayout());
		String[] items = {"a","b","c"};
		Icon y = new ImageIcon("F:\\CoreJava\\Programs\\JavaTraining\\12_JOptionPanel\\x.png");
		cbox = new JComboBox(items);
		
		cbox2 = new JComboBox();
		cbox2.setVisible(false);
		picture= new JLabel();
		add(picture);
		
		add(cbox);
		add(cbox2);
		cbox.addItemListener(new handlerClass());
	}
	
	private class handlerClass implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(cbox.getSelectedItem()=="b")
				cbox2.setVisible(true);
			else
				cbox2.setVisible(false);
			
			
			if(e.getStateChange() == ItemEvent.SELECTED)
				picture.setIcon(icon[cbox.getSelectedIndex()]);
			
		
		}
		
	}
}
