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
	Class [] villageois = new Class [nbVillageoisMaximum];
	
	public void  ajouterHabitant(Class habitant) {
		villageois[nbVillageois] = habitant;
		nbVillageois += 1;
	}
	
	public Class trouverHabitant(int num) {
		return(villageois[num]);
	}
	public static void main(String[] args) {
		Village villageDesIrreductibles = new Village("Village des Irréductibles", 30); 
		Chef abraracourcix = new Chef("Abraracourcix", 6, villageDesIrreductibles);
		ajouterHabitant(Chef.abraracourcix);
		
		//gaulois = Village.trouverHabitant(30);
		
	}
			
}
