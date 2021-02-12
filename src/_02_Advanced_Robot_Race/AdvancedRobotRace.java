package _02_Advanced_Robot_Race;

import java.util.Iterator;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Random r = new Random();
		boolean reachedTop = false;
		Thread r1 = new Thread(() -> {
			Robot robot1 = new Robot(50, 400);
			robot1.setAngle(0);
			while (robot1.getY() >= 0) {
				robot1.move(r.nextInt(40));
			}
		});
		Thread r2 = new Thread(() -> {
			Robot robot2 = new Robot(50, 400);
			robot2.setAngle(0);
			while (robot2.getY() >= 0) {
				robot2.move(r.nextInt(40));
			}
		});
		Thread r3 = new Thread(() -> {
			Robot robot3 = new Robot(50, 400);
			robot3.setAngle(0);
			while (robot3.getY() >= 0) {
				robot3.move(r.nextInt(40));
			}
		});
		Thread r4 = new Thread(() -> {
			Robot robot4 = new Robot(50, 400);
			robot4.setAngle(0);
			while (robot4.getY() >= 0) {
				robot4.move(r.nextInt(40));
			}
		});
		Thread r5 = new Thread(() -> {
			Robot robot5 = new Robot(50, 400);
			robot5.setAngle(0);
			while (robot5.getY() >= 0) {
				robot5.move(r.nextInt(40));
			}
		});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	
		
	}
	
}
