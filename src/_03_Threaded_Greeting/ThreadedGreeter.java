package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{
	int num;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread " + num);
		
		if (num < 50) {
			Thread t = new Thread(new ThreadedGreeter(num + 1));
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public ThreadedGreeter (int number) {
		this.num = number;
	}
}
