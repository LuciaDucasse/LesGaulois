package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;

	public Village(String nom) {
		this.nom = nom;
	}
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	int nbVillageois = 0;
	String[] villageois = new String[nbVillageoisMaximum];
	
	public void  ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	public void trouverHabitant(int num) {
		System.out.println(villageois[num]);
	}
	public static void main(String[] args) {
		Village villageDesIrreductibles = new Village("Village des Irréductibles", 30); 
		Gaulois gaulois = Village.trouverHabitant(30);
	}
			
}
