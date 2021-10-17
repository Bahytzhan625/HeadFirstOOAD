package head.first.OOAD.chapter04.DogDoorV03;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private Bark allowedBark;

	public DogDoor() {
		this.open = false;
	}
	/**
	 * @return the allowedBark
	 */
	public Bark getAllowedBark() {
		return allowedBark;
	}

	/**
	 * @param allowedBark the allowedBark to set
	 */
	public void setAllowedBark(Bark allowedBark) {
		this.allowedBark = allowedBark;
	}

	public void open() {
		System.out.println("The dog door opens.");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

}
