// import java.util.Com;

public class Etudiant implements Comparable {

    private String nom ; 
    private String prenom ; 
    private double moyenne ; 

    public Etudiant(String n, String p, double m){
        this.nom = n; 
        this.prenom = p; 
        this.moyenne = m; 

    }


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double m) {
		moyenne=m;
	}

	public int compareTO(Etudiant e){
		return this.getMoyenne()>e.getMoyenne()?1:0;

	}

}