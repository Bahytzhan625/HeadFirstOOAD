package head.first.OOAD.chapter01.RicksGuitarV04;

public class Guitar {
	private String serialNumber;
	private double price;
	GuitarSpec spec;

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the spec
	 */
	public GuitarSpec getSpec() {
		return spec;
	}

}
