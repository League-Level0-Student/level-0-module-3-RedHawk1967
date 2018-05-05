import javax.swing.JOptionPane;

public class horescope {

	public static void main(String[] args) {

		String horescope = JOptionPane.showInputDialog("What is Your Star Sign");

		if (horescope.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null,
					"Your Zodiac Sign Is Aries, You Are Full Of Energy And Is Very Friendly");
		} else if (horescope.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "You Are A Crazy One And Goes To Partys And Your Are Relaxed");
		} else if (horescope.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, " You Love To Work With Others And Your Great A Small Talk");
		} else if (horescope.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null,
					"you Are A Very Cancerous Little Fellow Who Rages At Every Thing And Your Menltly retarded ");
		} else if (horescope.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "You Are A Little Brat Who Needs To Be Noticed Or You Will Have A Fit");
		} else if (horescope.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "You Are One Who Stays Quiet But Is Full Of Thinking");
		} else if (horescope.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "You Are One Who Lives In Balance");
		} else if (horescope.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null,
					"You Are One Who Is a Kinda Secertive Person And Gets Down To The Bottom");
		} else if (horescope.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "You Are One Who Loves Exploring and Meeting new People");
		} else if (horescope.equalsIgnoreCase("Capricon")) {
			JOptionPane.showMessageDialog(null, " You Are One Who Only Wants To Make Progess");
		} else if (horescope.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You Are One who Cares Much For oThers And is Very Social");
		} else if (horescope.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "You Are Like A little Girl WHo Cries Randomly");
		} else {JOptionPane.showMessageDialog(null,"Very Funny");}
	}
}
