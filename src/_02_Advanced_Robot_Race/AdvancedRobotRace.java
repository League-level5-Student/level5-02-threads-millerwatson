package _02_Advanced_Robot_Race;

import java.util.Iterator;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot robot1 = new Robot(50, 400);
		robot1.setAngle(0);
		Robot robot2 = new Robot(150, 400);
		robot2.setAngle(0);
		Robot robot3 = new Robot(250, 400);
		robot3.setAngle(0);
		Robot robot4 = new Robot(350, 400);
		robot4.setAngle(0);
		Robot robot5 = new Robot(450, 400);
		robot5.setAngle(0);
		Random r = new Random();
		boolean reachedTop = false;
		Thread r1 = new Thread(() -> {
			
			while (robot1.getY() >= 0) {
				robot1.move(new Random().nextInt(40));
			}
			System.out.println("Robot 1 Wins!");
			System.exit(0);
		});
		Thread r2 = new Thread(() -> {
			
			while (robot2.getY() >= 0) {
				robot2.move(new Random().nextInt(40));
			}
			System.out.println("Robot 2 Wins!");
			System.exit(0);
		});
		Thread r3 = new Thread(() -> {
			
			while (robot3.getY() >= 0) {
				robot3.move(new Random().nextInt(40));
			}
			System.out.println("Robot 3 Wins!");
			System.exit(0);
		});
		Thread r4 = new Thread(() -> {
			
			while (robot4.getY() >= 0) {
				robot4.move(new Random().nextInt(40));
			}
			System.out.println("Robot 4 Wins!");
			System.exit(0);
		});
		Thread r5 = new Thread(() -> {
			
			while (robot5.getY() >= 0) {
				robot5.move(new Random().nextInt(40));
			}
			System.out.println("Robot 5 Wins!");
			System.exit(0);
		});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	
		
	}

	
}
