package extra;

import javax.swing.JOptionPane;

public class k {

	public static void main(String[] args) {

		String Happy = JOptionPane.showInputDialog("Do You Want To Be HAPPY");

		if (Happy.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Then Just keep Doing What You Are Doing");
		}
		if (Happy.equalsIgnoreCase("no")) {
			String happy2 = JOptionPane.showInputDialog("Do You Want To Be Happy");
			if (happy2.equalsIgnoreCase("yes")) { JOptionPane.showMessageDialog(null,"Then Change Somthing");
			}
if(happy2 .equalsIgnoreCase("No")) {JOptionPane.showMessageDialog(null,"Then Keep Doing What You Doing"); }
		}
	}
}