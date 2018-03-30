
public class ThreadSum {
	public static void main(String[] args) {
		// upper limit of numbers to add/subtract to Counter
		final int LIMIT = 10000000;
		// The counter that accumulates a total.
		Counter counter = new AtomicCounter();
		runThreads(counter, LIMIT);
	}

	public static void runThreads(Counter counter, final int limit) {
		// two tasks that add and subtract values using same Counter
		AddTask addtask = new AddTask(counter, limit);
		SubtractTask subtask = new SubtractTask(counter, limit);
		// threads to run the tasks
		Thread thread1 = new Thread(addtask);
		Thread thread2 = new Thread(subtask);
//		Thread thread3 = new Thread(addtask);
//		Thread thread4 = new Thread(subtask);
//		Thread thread5 = new Thread(addtask);
//		Thread thread6 = new Thread(subtask);
//		Thread thread7 = new Thread(addtask);
//		Thread thread8 = new Thread(subtask);
//		Thread thread9 = new Thread(addtask);
//		Thread thread10 = new Thread(subtask);
		// start the tasks
		System.out.println("Starting threads");
		long startTime = System.nanoTime();
		thread1.start();
		thread2.start();
//		thread3.start();
//		thread4.start();
//		thread5.start();
//		thread6.start();
//		thread7.start();
//		thread8.start();
//		thread9.start();
//		thread10.start();
		// wait for threads to finish
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println("Threads interrupted");
		}
		double elapsed = 1.0E-9 * (System.nanoTime() - startTime);
		System.out.printf("Count 1 to %,d in %.6f sec\n", limit, elapsed);
		// the sum should be 0. Is it?
		System.out.printf("Counter total is %d\n", counter.get());
	}

}
