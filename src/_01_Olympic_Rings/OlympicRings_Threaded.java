package _01_Olympic_Rings;

import java.awt.Color;
import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {

		Thread r = new Thread(() ->{
			Robot red = new Robot(600, 300);
			red.setPenColor(Color.red);
			red.penDown();
			for (int i = 0; i < 30; i++) {
				red.turn(12);
				red.move(20);
			}
		});
		
			Robot black = new Robot(400, 300);
			black.setPenColor(Color.black);
			black.penDown();
			for (int i = 0; i < 30; i++) {
				black.turn(12);
				black.move(20);
			}
		});
		
		Thread bl = new Thread(() ->{
			Robot blue = new Robot(200, 300);
			blue.setPenColor(Color.blue);
			blue.penDown();
			for (int i = 0; i < 30; i++) {
				blue.turn(12);
				blue.move(20);
			}
		});
		
		Thread gr = new Thread(() ->{
			Robot green = new Robot(500, 400);
			green.setPenColor(Color.green);
			green.penDown();
			for (int i = 0; i < 30; i++) {
				green.turn(12);
				green.move(20);
			}
		});
		
		Thread ye = new Thread(() ->{
			Robot yellow = new Robot(300, 400);
			yellow.setPenColor(Color.yellow);
			yellow.penDown();
			for (int i = 0; i < 30; i++) {
				yellow.turn(12);
				yellow.move(20);
			}
		});
		
		r.start();
		bk.start();
		bl.start();
		gr.start();
		ye.start();
	}

	
}

