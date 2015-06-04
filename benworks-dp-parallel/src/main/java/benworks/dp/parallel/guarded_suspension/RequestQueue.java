package benworks.dp.parallel.guarded_suspension;

import java.util.LinkedList;

/**
 * @author Ben
 */
public class RequestQueue {

	private LinkedList<Request> queue = new LinkedList<Request>();

	public synchronized Request getRequest() {
		while (queue.size() == 0) {
			try {
				wait();// 等待直到有新的Request加入
			} catch (InterruptedException e) {
			}
		}

		return (Request) queue.remove();// 返回Request队列中的第一个请求
	}

	public synchronized void addRequest(Request request) {
		queue.add(request);
		notifyAll();
	}

}
