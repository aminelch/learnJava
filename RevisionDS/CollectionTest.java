import java.util.*;
// import java.util.Iterator;

public class CollectionTest{

    public static void main(String[] args) {
      ArrayList<Etudiant> etudiant = new ArrayList<Etudiant>(); 
      Etudiant e1 = new Etudiant("Hossny","Sellemi",14.25);
      Etudiant e2 = new Etudiant("Nermine","Mahfoudhi",8.70);
      Etudiant e3 = new Etudiant("Nouha","Akacha",11.63);
      
      Iterator<Etudiant> it = new Etudiant.iterator();

      System.out.println("La liste des etudiants:\n"); 
      while(it.hasNext()){
        System.out.println(it.next().getNom()); 
      }







    }

}