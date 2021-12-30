import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowFrame extends JFrame{

	private JLabel it1;
	public WindowFrame()
	{
		//Set title for window
		super("The Title");
		
		//Set Layout for window
		setLayout(new FlowLayout());
		
		//Window message and tool tip
		it1 = new JLabel("Label...");
		it1.setToolTipText("Tool Tips Message");
		
		add(it1);
	}
	
	public static void main(String[] args) {
		WindowFrame wf = new WindowFrame();
		wf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wf.setSize(275,500);
		wf.setVisible(true);

	}

}
