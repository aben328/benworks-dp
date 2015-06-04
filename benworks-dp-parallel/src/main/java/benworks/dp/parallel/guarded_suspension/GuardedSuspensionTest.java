package benworks.dp.parallel.guarded_suspension;

/**
 * @author Ben
 */
public class GuardedSuspensionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RequestQueue requestQueue = new RequestQueue();

		for (int i = 0; i < 10; i++) {
			new ServerThread(requestQueue, "ServerThread" + i).start();
		}

		for (int i = 0; i < 10; i++) {
			new ClientThread(requestQueue, "ClientThread" + i).start();
		}

	}

}
