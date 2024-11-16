package threads.train;

public class Train {
	private int        voieEntree;
	private VoieUnique voieUnique;
	
	public Train(VoieUnique voieUnique, int voieEntree) {
		this.voieUnique = voieUnique;
		this.voieEntree = voieEntree;
	}
	
	public void run() {
		int voeiSortie;
		System.out.println("Train arrivant sur la voie " + voieEntree);
		try {
			voeiSortie = voieUnique.emprunter(this.voieEntree);
		} catch (MauvaiseVoieException e) {
			System.out.println("Erreur : voie d'entrée incorrecte");
			return;
		}
		System.out.println("Train sortant sur la voie " + voeiSortie);
	}
}
