import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	public static void main(String[] args) {
		Random height = new Random();
		Robot houses = new Robot(100, 500);
		houses.setWindowColor(Color.black);
		houses.miniaturize();
		houses.moveTo(30, 600);
		houses.penDown();
		houses.setSpeed(10);
		houses.turn(90);
		for (int i = 0; i < 10; i++) {
			int randomNum = height.nextInt(400) + 100;
			houses.setPenColor(4, 145, 0);
			houses.move(20);
			houses.turn(-90);
			houses.setRandomPenColor();
			houses.move(randomNum);
			houses.turn(90);
			houses.move(40);
			houses.turn(90);
			houses.move(randomNum);
			houses.turn(-90);
			
			
		}
	}
}
