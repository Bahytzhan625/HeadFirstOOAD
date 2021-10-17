package head.first.OOAD.chapter01.RicksGuitarV03;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	/**
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
					  Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	/**
	 * @return the builder
	 */
	public Builder getBuilder() {
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
	public Type getType() {
		return type;
	}
	/**
	 * @return the backWood
	 */
	public Wood getBackWood() {
		return backWood;
	}
	/**
	 * @return the topWood
	 */
	public Wood getTopWood() {
		return topWood;
	}

}
