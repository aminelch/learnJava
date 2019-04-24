import java.util.HashMap;
import java.util.Iterator;

public class IteratorHashmap{
    public static  void main (String[] args){
        HashMap<String,String> map = new HashMap();
        
        map.put("Pays", "Algerie");
        map.put("Animal", "Chat");
        map.put("Animal", "Penguin");
        map.put("Framework php", "Symfony");
        map.put("Voiture", "Kia");

        // décleration de l' iterator sur les valeurs de hashMap
        // Iterator<String> it = map.values().iterator(); 
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // décleration de l' iterator sur les clé de hashMap
        Iterator<String> it2 = map.keySet().iterator(); 
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        
    }
}