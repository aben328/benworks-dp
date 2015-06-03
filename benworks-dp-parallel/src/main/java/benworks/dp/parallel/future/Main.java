package benworks.dp.parallel.future;


/**
 * Future模式<br>
 * 系统启动，调用Client发出的请求
 * @author Ben
 */
public class Main {

	public static void main(String[] args) {
		Client client = new Client();

		// 这里会立即返回，因为得到的是FutureData 而不是RealData.
		Data data = client.request("name");

		System.err.println("请求完毕");

		try {
			// 这里可以用一个sleep代替对其它业务逻辑的处理
			// 在处理这些业务逻辑的过程中，RealData 被创建，从而充分利用了等待时间

			Thread.sleep(2000);

		} catch (InterruptedException e) {
		}

		// 使用真实的数据
		System.out.println("数据 = " + data.getResult());

	}
}
