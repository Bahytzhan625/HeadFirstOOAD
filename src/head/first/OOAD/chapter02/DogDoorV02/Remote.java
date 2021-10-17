package head.first.OOAD.chapter02.DogDoorV02;

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

			final Timer timer = new Timer();
			timer.schedule(new TimerTask() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					door.close();
					timer.cancel();
				}
			}, 5000);
		}
	}

}
