package head.first.OOAD.chapter04.DogDoorV02;

public class BarkRecognizer {
	private DogDoor door;

	/**
	 * @param door
	 */
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(String bark) {
		System.out.println("BackRecognizer: Heard a '" +
				bark + "'");
		if (door.getAllowedBark().equals(bark)) {
			door.open();
		} else {
			System.out.println("This dog is not allowed.");
		}
	}

}
