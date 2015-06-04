/**
 * 
 */
package benworks.dp.parallel.master_worker;

import java.util.Map;
import java.util.Set;

/**
 * @author Ben
 */
public class MasterWorkTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Master m = new Master(new PlusWorker(), 5); // 固定使用5个Worker，并指定Worker

		for (int i = 0; i < 100; i++) {
			m.submit(i);	// 提交100个任务
		}
		m.execute();
		int re = 0;
		Map<String, Object> resultMap = m.getResultMap();

		while (resultMap.size() > 0 || !m.isComplete()) {
			// 不需要等待所有Worker都执行完，即可开始计算最终结果
			Set<String> keys = resultMap.keySet();
			String key = null;

			for (String k : keys) {
				key = k;
				break;
			}

			Integer i = null;

			if (key != null) {
				i = (Integer) resultMap.get(key);
			}

			if (i != null) {
				re += i; // 最终结果 
			}

			if (key != null) {
				resultMap.remove(key); // 移除已经被计算过的项。
			}

		}

		System.out.println(re);
	}

}
