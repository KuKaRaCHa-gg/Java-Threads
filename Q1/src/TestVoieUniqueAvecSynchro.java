package threads.train;

import threads.train.*;

public class TestVoieUniqueAvecSynchro {

	public static void main(String[] args) {
		// lance 10 trains (1 train par s) en choisissant de façon aléatoire la voie d'entrée (voie 1 ou 4)
		VoieUnique voieUnique = new VoieUniqueAvecSynchro();
		int voie;
		int nbTrain = 10;

		while (nbTrain > 0) {
			if ((int)(Math.random()*2) % 2 == 0) {
				voie = 4;
			} else {
				voie = 1;
			}
			Train train = new Train(voieUnique, voie);
			train.run();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			nbTrain--;
		}
	}
}