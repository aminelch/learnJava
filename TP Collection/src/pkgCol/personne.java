package pkgCol;



public class personne implements Comparable<personne>{
	  private String nom ;
	    private String prenom; 
	    private int age;
	    private int poids;
	private int taille; 
	public personne(String nom , String prenom ,int age , int poids , int taille) {
	    this.nom=nom;
	    this.prenom=prenom;
	    this.age=age;
	    this.poids=poids;
	    this.taille=taille;
	}
	public String getnom (){
	    return nom ;
	}
	public String getprenom (){
	    return prenom ;
	}
	public int getage (){
	    return age ;
	}
	public int getpoids (){
	    return poids ;
	}
	public int gettaille (){
	    return taille ;
	}

public void setnom (String nom ){
  this.nom=nom ;
}
public void setprenom (String prenom ){
  this.prenom=prenom ;
}
public void setage (int age ){
  this.age=age;
}
public void setpoids (int poids ){
  this.poids=poids;
}
public void settaille (int taille ){
 this.taille=taille ;
}
@Override
public String toString() {
	return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age + ", poids=" + poids + ", taille="
			+ taille + "]";
}

@Override
public int compareTo(personne P1) {
	// TODO Auto-generated method stub

	int i=prenom.compareTo(P1.getprenom());
	if(i==0)
		i=nom.compareTo(P1.getnom());
	return i;
}

}
