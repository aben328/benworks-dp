package benworks.dp.parallel.future;

import java.util.concurrent.Callable;

/**
 * 可以使用JDK内置的Future模式实现本小节的程序功能，首先，需要实现Callable接口，实现具体的业务逻辑。 在本例中，依然使用RealData来实现这个接口。
 * @author Ben
 */
public class RealData2 implements Callable<String> {

	private String para;

	public RealData2(String para) {
		this.para = para;
	}

	@Override
	public String call() throws Exception {
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
		return sb.toString();
	}

}
