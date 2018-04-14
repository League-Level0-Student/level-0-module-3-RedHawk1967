//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.beans.PersistenceDelegate;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot bob = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do you like");
		// 5. Use an if/else statement to set the pen color that the user requested
		for(int i=0; i<10;i++) {
		bob.setPenWidth(10);
		if (color.equalsIgnoreCase("red")) {
			bob.penDown();
			bob.setPenColor(255, 000, 000);
		} else if (color.equalsIgnoreCase("blue")) {
			bob.penDown();
			bob.setPenColor(000, 000, 255);
		} else if (color.equalsIgnoreCase("green")) {
			bob.penDown();
			bob.setPenColor(000, 255, 000);
		} else {
			bob.penDown();
			bob.setRandomPenColor();
		}
		}
	bob.setSpeed(100);

		// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10

		// 2. Make the robot draw a shape (this will take more than one line of code)
bob.move(200); bob.turn(-90);bob.move(200); bob.turn(-90); bob.move(200);bob.turn(-90);bob.move(200);
	}
}
