package pkgCol;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


 
public class Main {

	public static void main(String[] args) {
 
		
		AgeComparator comparateurAge = new AgeComparator(); 		
		personne P =new personne("wifek","abbassi",21,58,120);
		personne P1 =new personne("ali","rrr",21,58,158);
		personne P2 =new personne("rim","raboudi",21,58,190);
		personne P3 =new personne("sana","tttt",21,58,166);
		
		
		ArrayList <personne> list;
		list=new ArrayList <personne>();
		
	
			list.add(P);
			list.add(P1);
			list.add(P2);
			list.add(P3);

			Iterator <personne> it = list.iterator(); 
//		while (it.hasNext()){
//			personne P11 = it.next(); 
//		
//			if(P11.getage()> 18){
//				System.out.println(P11);
//				
//			}
//		}
		
		
//		for ( personne P:list) {
//			if(P.getage()>30){
//				System.out.println(P1);
//			}
//		}
			HashSet <personne> set;
			set = new HashSet<personne>();


			set.add(P);
			set.add(P1);
			set.add(P2);
			set.add(P3);
			
			
			Iterator <personne> it2 = set.iterator(); 	
			
			while (it2.hasNext()){
				personne P11 = it2.next(); 
			
				if(P11.gettaille()>150){
					System.out.println(P11);
					
				}
			}
			
	}

}
