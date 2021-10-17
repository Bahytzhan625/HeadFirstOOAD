package head.first.OOAD.chapter03.DogDoorV01;

public class DogDoorSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);

		System.out.println("Fido barks to go outside...");
		remote.pressButton();

		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido's all done...");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) { }
			System.out.println("...but he's stuck outside!");
			System.out.println("\nFido starts barking...");
			System.out.println("...so Gina grabs the remote control.");
			remote.pressButton();

			System.out.println("\nFido's back inside...");
	}

}
