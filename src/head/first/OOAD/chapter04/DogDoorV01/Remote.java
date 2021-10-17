package head.first.OOAD.chapter04.DogDoorV01;

import java.util.Timer;
import java.util.TimerTask;

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
