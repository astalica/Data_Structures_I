package queue;

public class QueueTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayListQueue<String> sq = new ArrayListQueue<String>();
		sq.insert("124345");
		sq.insert("123abc");
		sq.insert("abc123");
		sq.insert("askmehow");
		sq.insert("abc");
		sq.printQueue();
		sq.delete();
		sq.delete();
		sq.printQueue();
		sq.insert("AlmostDone");
		sq.insert("happyBirthday");
		sq.printQueue();
	}

}
