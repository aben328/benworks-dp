package benworks.dp.parallel.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Future模式<br>
 * 系统启动，调用Client发出的请求
 * @author Ben
 */
public class Main2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// 构造FutureTask
		FutureTask<String> future = new FutureTask<String>(new RealData2("a"));

		ExecutorService executor = Executors.newFixedThreadPool(1);

		// 执行 FutureTask，相当于上例中的client.request("a") 发送请求。
		// 在这里开启线程进行RealData的call()执行。
		executor.submit(future);

		System.err.println("请求完毕");

		try {
			// 这里可以用一个sleep代替对其它业务逻辑的处理
			// 在处理这些业务逻辑的过程中，RealData 被创建，从而充分利用了等待时间
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		// 使用真实的数据
		System.out.println("数据 = " + future.get());
	}
}
