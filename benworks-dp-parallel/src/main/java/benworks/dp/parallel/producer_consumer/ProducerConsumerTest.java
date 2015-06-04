package benworks.dp.parallel.producer_consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author Ben
 */
public class ProducerConsumerTest {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<PCData> queue = new LinkedBlockingDeque<PCData>(10);

		Producer producer1 = new Producer(queue); // 建立生产者
		Producer producer2 = new Producer(queue);
		Producer producer3 = new Producer(queue);
		Producer producer4 = new Producer(queue);
		Producer producer5 = new Producer(queue);

		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(producer1);
		service.execute(producer2);
		service.execute(producer3);
		service.execute(producer4);
		service.execute(producer5);

		Thread.sleep(10 * 1000);
		producer1.stop();
		producer2.stop();
		producer3.stop();
		producer4.stop();
		producer5.stop();

		Thread.sleep(3000);

		service.shutdown();
	}

}
