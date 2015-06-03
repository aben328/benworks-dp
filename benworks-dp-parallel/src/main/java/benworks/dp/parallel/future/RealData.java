package benworks.dp.parallel.future;

/**
 * @author Ben
 */
public class RealData implements Data {

	protected final String result;

	public RealData(String para) {
		// RealData 的构造可能很慢，需要用户等很久，这里使用Sleep模拟
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < 10; i++) {
			sb.append(para);
			try {
				// 这里使用sleep,代替一个很慢的操作过程。

				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		result = sb.toString();
	}

	@Override
	public String getResult() {
		return result;
	}

}
