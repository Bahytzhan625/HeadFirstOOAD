package head.first.OOAD.chapter04.DogDoorV04;

public class Bark {
	private String sound;

	/**
	 * @param sound
	 */
	public Bark(String sound) {
		this.sound = sound;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}
	public boolean equals(Object bark) {
		if (bark instanceof Bark) {
			Bark otherBark = (Bark)bark;
			if (this.sound.equalsIgnoreCase(otherBark.sound)) {
				return true;
			}
		}
		return false;
	}

}
