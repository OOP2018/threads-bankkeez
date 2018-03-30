/**
 * SubtractTask subtracts number 1 ... limit to the counter, then exits.
 */
public class SubtractTask implements Runnable {
	private Counter counter;
	private int limit;

	public SubtractTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	@Override
	public void run() {
		for (int i = 1; i <= limit; i++) {
			counter.add(-i);
			// System.out.println("Done " + Thread.currentThread().getName());
		}
	}
}
