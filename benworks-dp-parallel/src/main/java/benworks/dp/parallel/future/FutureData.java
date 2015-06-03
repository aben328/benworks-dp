package benworks.dp.parallel.future;

/**
 * FutureData实现了一个快速返回的RealData包装。它只是一个包装，或者说是一个RealData的虚拟实现。因此，它可以很快被构造并返回。<br>
 * 当使用FutureData的getResult()方法时，程序会阻塞，等待RealData被注入到程序中，才使用RealData的getResult()方法返回。<br>
 * 注意：FutureData是Future模式的关键，它实际上是真实数据RealData的代理，封装了获取RealData的等待过程。
 * @author Ben
 */
public class FutureData implements Data {

	protected RealData realdata = null;// FutureData实现了一个快速返回的RealData包装

	protected boolean isReady = false;

	public synchronized void setRealData(RealData realdata) {
		if (isReady) {
			return;
		}

		this.realdata = realdata;

		isReady = true;

		notifyAll(); // RealData已经被注入，通知getResult()
	}

	@Override
	public synchronized String getResult() {// 会等待RealData构造完成
		if (!isReady) {
			try {
				wait();// 一直等待，直到RealData被注入。
			} catch (InterruptedException e) {
			}
		}
		return realdata.result;// RealData实现
	}

}
