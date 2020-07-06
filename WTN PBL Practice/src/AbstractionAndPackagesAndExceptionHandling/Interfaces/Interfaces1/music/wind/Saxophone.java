package AbstractionAndPackagesAndExceptionHandling.Interfaces.Interfaces1.music.wind;

import AbstractionAndPackagesAndExceptionHandling.Interfaces.Interfaces1.music.Playable;

public class Saxophone implements Playable{

	@Override
	public void play() {
		System.out.println("Saxophone playing");
	}

}
