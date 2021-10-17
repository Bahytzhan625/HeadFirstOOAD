package head.first.OOAD.chapter01.RicksGuitarV04;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;
	/**
	 * @param builder
	 * @param model
	 * @param type
	 * @param numStrings
	 * @param backWood
	 * @param topWood
	 */
	public GuitarSpec(Builder builder, String model, Type type,
					  int numStrings, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
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
	 * @return the numStrings
	 */
	public int getNumStrings() {
		return numStrings;
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

	public boolean matches(GuitarSpec otherSpec) {
		if (builder != otherSpec.builder)
			return false;
		if ((model != null) && (!model.equals("")) &&
				(!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
				return false;
		if (type != otherSpec.type)
			return false;
		if (numStrings != otherSpec.numStrings)
			return false;
		if (backWood != otherSpec.backWood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;
		return true;
	}
}
