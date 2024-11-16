package threads.train;

public class VoieUniqueAvecSynchro implements VoieUnique {

	// Retourne la voie de sortie correspondante à la voie d'entrée
	private int voieSortie(int voieEntree) throws MauvaiseVoieException {
		switch (voieEntree) {
			case 1:
				return 3;
			case 4:
				return 2;
			default:
				throw new MauvaiseVoieException();
		}
	}

	// Simule l'arrivée d'un train sur la voie unique et sa sortie
	// retourne la voie de sortie correspondante à la voie d'entrée
	public synchronized int emprunter(int voieEntree) throws MauvaiseVoieException {
		int sortie = -1; // voie de sortie

		// affiche de quelle voie arrive le train sur la voie unique
		System.out.println("VOIE UNIQUE: Train arrivant sur la voie UNIQUE " + voieEntree);

		// simule une durée de traversée de la voie unique
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// détermine la voie de sortie en fonction de celle d'entrée
		sortie = voieSortie(voieEntree);

		// affiche sur quelle voie sort le train de la voie unique
		System.out.println("VOIE UNIQUE: Train sortant sur la voie UNIQUE " + sortie);

		return sortie;
	}
}
