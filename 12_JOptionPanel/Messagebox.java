import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.text.IconView;

import sun.awt.IconInfo;

public class Messagebox {

	public static void main(String[] args) {
		
		String fn = JOptionPane.showInputDialog("Enter 1st Number");
		String sn = JOptionPane.showInputDialog("Enter 2nd Number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "Sum of 2 number = " + sum);
		JOptionPane.showMessageDialog(null, "Sum of 2 number = " + sum, "Result", 1);
		JOptionPane.showMessageDialog(null, "Sum of 2 number = " + sum, "Result", JOptionPane.PLAIN_MESSAGE);
		
	}

}


