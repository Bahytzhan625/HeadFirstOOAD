package head.first.OOAD.chapter01.RicksGuitarV01;

public class Guitar {
	private String serialNumber, builder, model, type, backWood, topWood;
	private double price;

	public Guitar(String serialNumber,
				  double price,
				  String builder,
				  String model,
				  String type,
				  String backWood,
				  String topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @return the builder
	 */
	public String getBuilder() {
		return builder;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the backWood
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * @return the topWood
	 */
	public String getTopWood() {
		return topWood;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

}
