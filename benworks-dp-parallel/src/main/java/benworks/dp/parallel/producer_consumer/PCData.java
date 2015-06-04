package benworks.dp.parallel.producer_consumer;

public class PCData {
	private final int intData;

	public int getData() {
		return intData;
	}

	public PCData(int intData) {
		this.intData = intData;
	}

	public PCData(String intData) {
		this.intData = Integer.valueOf(intData);
	}

	@Override
	public String toString() {
		return "PCData [intData=" + intData + "]";
	}

}
