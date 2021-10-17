package head.first.OOAD.chapter03.DogDoorV03;

public class BarkRecognizer {
	private DogDoor door;

	/**
	 * @param door
	 */
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}
	public void recognize(String bark) {
		System.out.println("	BarkRecognizer: Heard a '" + bark + "'");
		door.open();
	}
}
