package head.first.OOAD.chapter04.DogDoorV03;

public class DogDoorSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogDoor door = new DogDoor();
		door.setAllowedBark(new Bark("Rowlf"));
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		// Simulate the hardware hearing a bark
		System.out.println("Bruce starts barking.");
		recognizer.recognize(new Bark("Rowlf"));

		System.out.println("\nBruce has gone outside...");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) { }

		System.out.println("\nBruce all done...");
		System.out.println("...but he's stack outside!");

		// Simulate the hardware hearing a bark (not Bruce!)
		System.out.println("A small dog starts barking.");
		recognizer.recognize(new Bark("Yip"));

		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) { }

		// Simulate the hardware hearing a bark again
		System.out.println("\nBruce starts barking");
		recognizer.recognize(new Bark("Rowlf"));

		System.out.println("\nBruce's back inside...");

	}

}
