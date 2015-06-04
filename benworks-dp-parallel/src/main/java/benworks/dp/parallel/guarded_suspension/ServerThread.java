/**
 * 
 */
package benworks.dp.parallel.guarded_suspension;

/**
 * @author Ben
 */
public class ServerThread extends Thread {

	private RequestQueue requestQueue;// 请求队列

	/**
	 * @param group
	 * @param target
	 */
	public ServerThread(RequestQueue requestQueue, String name) {
		super(name);
		this.requestQueue = requestQueue;
	}

	public void run() {
		while (true) {
			final Request request = requestQueue.getRequest();	// 得到请求

			try {
				Thread.sleep(100);	// 模拟请求处理耗时

			} catch (Exception e) {
				e.printStackTrace();
			}

			System.err.println(Thread.currentThread().getName() + " handles " + request);
		}
	}

}
