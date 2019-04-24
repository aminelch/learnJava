import java.util.ArrayList;
import java.util.Iterator;

public class IteratorList{

    public static void main ( String[] args){
        ArrayList<Integer> liste = new ArrayList<>(); 
        //Ajout des elem au ArrayList avec la methode add 
        for(int i =0;i<5;i++){
            liste.add(i);
        }

        Iterator<Integer> it = liste.iterator();
        // tanque l'iterator a un successeur 
        while(it.hasNext()){
            System.out.println(it.next());
        }

      

    }
    
}