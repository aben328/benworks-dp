package benworks.dp.parallel.producer_consumer;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * @author Ben
 */
public class Consumer implements Runnable {
	private BlockingQueue<PCData> queue;// 内存缓冲区

	private static final int SLEEPTIME = 1000;

	public Consumer(BlockingQueue<PCData> queue) {
		this.queue = queue;
	}

	/* (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run() */
	@Override
	public void run() {
		System.out.println("start comsumer id= " + Thread.currentThread().getId());

		Random r = new Random();

		try {
			while (true) {
				PCData data = queue.take();
				if (null != data) {
					int re = data.getData() * data.getData(); // 计算平方
					System.out
							.println(MessageFormat.format("{0} * {1} = {2}", data.getData(), data.getData(), re));
				}

				Thread.sleep(r.nextInt(SLEEPTIME));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}

	}

}
