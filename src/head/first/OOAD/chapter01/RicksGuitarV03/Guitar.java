package head.first.OOAD.chapter01.RicksGuitarV03;

public class Guitar {
	private String serialNumber;
	private double price;
	GuitarSpec spec;
	/**
	 * @param serialNumber
	 * @param price
	 * // @param spec
	 */
	public Guitar(String serialNumber, double price,
				  Builder builder, String model, Type type,
				  Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = new GuitarSpec(builder, model, type, backWood, topWood);
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
