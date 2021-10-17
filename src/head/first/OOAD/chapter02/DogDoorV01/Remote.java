package head.first.OOAD.chapter02.DogDoorV01;

public class Remote {
	private DogDoor door;

	/**
	 * @param door
	 */
	public Remote(DogDoor door) {
		this.door = door;
	}
	public void pressButton() {
		System.out.println("Pressing the remote control button...");
		if (door.isOpen()) {
			door.close();
		} else {
			door.open();
		}
	}
}
