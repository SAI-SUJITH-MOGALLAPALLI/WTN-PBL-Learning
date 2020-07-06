package AbstractionAndPackagesAndExceptionHandling.Interfaces.Interfaces1.music.string;

import AbstractionAndPackagesAndExceptionHandling.Interfaces.Interfaces1.music.Playable;

public class Veena implements Playable{

	@Override
	public void play() {
		System.out.println("Veena playing");
	}

}
