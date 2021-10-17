package head.first.OOAD.chapter02.DogDoorV01;

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
		remote.pressButton();

		System.out.println("\nFido's all done...");
		remote.pressButton();

		System.out.println("\nFido's back inside...");
		remote.pressButton();
	}

}
