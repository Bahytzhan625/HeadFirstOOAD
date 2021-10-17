package head.first.OOAD.chapter03.DogDoorV02;

public class DogDoor {
	private boolean open;

	/**
	 * @param open
	 */
	public DogDoor(boolean open) {
		this.open = open;
	}

	public DogDoor() {
		this(false);
	}

	public void open() {
		System.out.println("The dog door opens.");
		open = true;
	}

	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

}
