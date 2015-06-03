package benworks.dp.parallel.future;

/**
 * Client主要实现 了获取 Future Data,开启了构造 RealData 的线程，并在接受请求之后，快速 返回FutureData...
 * @author Ben
 */
public class Client {

	public Data request(final String queryStr) {

		final FutureData future = new FutureData();

		new Thread() {
			public void run() {
				// RealData 的构建很慢
				// 所以在单独的线程中进行
				RealData realdata = new RealData(queryStr);
				future.setRealData(realdata);
			}
		}.start();

		return future;
	}
}
