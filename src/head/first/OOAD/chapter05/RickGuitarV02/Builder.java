package head.first.OOAD.chapter05.RickGuitarV02;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

	public String toString() {
		switch (this) {
			case FENDER:   return "Fender";
			case MARTIN:   return "Martin";
			case GIBSON:   return "GIBSON";
			case COLLINGS: return "Collings";
			case OLSON:    return "Olson";
			case RYAN: 	   return "Ryan";
			case PRS: 	   return "PRS";
			default: 	   return "Unspecified";
		}
	}
}
