
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "Decmber 1st";
		String dadsBirthday = "Death Day";
		String myBirthday = "November 18th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String bday = JOptionPane.showInputDialog(
				"Whos birthday do you want to know(No Brother or sisters allowed mom or dad only you can do me!)");

		// 3. Print out what the user typed
		System.out.println(bday);
		// 4. if user asked for "mom"
		if (bday.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		} // print mom's birthday
		// 5. if user asked for "dad"
		else if (bday.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		} // print dad's birthday
		// 6. if user asked for your name
		else if (bday.equalsIgnoreCase("me")) {
			System.out.println(myBirthday);
		}
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Don't try to get your birthday");
		}
	}
}
