import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioEx extends JFrame {

	JRadioButton r1;
	JRadioButton r2;
	JRadioButton r3;
	ButtonGroup group;
	
	public RadioEx() {
		super("Title");
		setLayout(new FlowLayout());
		
		r1 = new JRadioButton("Male",true);
		r2 = new JRadioButton("Female");
		r3 = new JRadioButton("Other");
		add(r1);
		add(r2);
		add(r3);
		group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
	}
}
