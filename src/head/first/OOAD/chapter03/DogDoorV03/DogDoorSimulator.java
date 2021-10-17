package head.first.OOAD.chapter03.DogDoorV03;

public class DogDoorSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		BarkRecognizer recognizer = new BarkRecognizer(door);

		System.out.println("Fido barks to go outside...");
		remote.pressButton();

		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido's all done...");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) { }
			System.out.println("...but he's stuck outside!");
			System.out.println("\nFido starts barking...");
			recognizer.recognize("Woof");

			System.out.println("\nFido's back inside...");
	}

}
