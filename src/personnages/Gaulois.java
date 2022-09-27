package personnages;

public class Gaulois {
	public String getNom() {
		return nom;
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public Gaulois(String nom, int force, int effetPotion) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public static void main(String[] args) {
		
	}
}
