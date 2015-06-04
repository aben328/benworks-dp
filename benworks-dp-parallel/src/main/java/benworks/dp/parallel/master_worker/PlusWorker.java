/**
 * 
 */
package benworks.dp.parallel.master_worker;

/**
 * 求立方各
 * @author Ben
 */
public class PlusWorker extends Worker {

	public Object handle(Object input) {
		Integer i = (Integer) input;
		return i * i * i;
	}
}
