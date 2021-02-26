package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {

	private ConcurrentLinkedQueue<Task> taskQueue;
	
	public Worker(ConcurrentLinkedQueue<Task> taskQ) {
		taskQueue = taskQ;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!taskQueue.isEmpty()) {
			taskQueue.remove().perform();
		}
	}
	
	

}
