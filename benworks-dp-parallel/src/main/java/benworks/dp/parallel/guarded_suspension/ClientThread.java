package benworks.dp.parallel.guarded_suspension;

/**
 * @author Ben
 */
public class ClientThread extends Thread {

	private RequestQueue requestQueue;

	/**
	 * @param group
	 * @param target
	 */
	public ClientThread(RequestQueue requestQueue, String name) {
		super(name);
		this.requestQueue = requestQueue;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			Request request = new Request("RequestId: " + i + " Thread_Name " + Thread.currentThread().getName());

			System.out.println(Thread.currentThread().getName() + " requests " + request);

			requestQueue.addRequest(request);

			try {

				Thread.sleep(10);	// 模拟请求处理耗时

			} catch (Exception e) {
				e.printStackTrace();
			}

			System.err.println("ClientThread Name is: " + Thread.currentThread().getName());

		}

		System.out.println(Thread.currentThread().getName() + " request end ");

	}

}
