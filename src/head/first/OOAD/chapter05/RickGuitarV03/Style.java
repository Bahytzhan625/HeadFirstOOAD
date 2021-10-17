package head.first.OOAD.chapter05.RickGuitarV03;

public enum Style {
	A, F;

	public String toString() {
		switch (this) {
			case A:  return "A style";
			case F:  return "F style";
			default: return "Unspecified";
		}
	}
}
