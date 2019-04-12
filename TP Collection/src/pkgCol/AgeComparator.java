package pkgCol;



import java.util.Comparator;

public class AgeComparator implements Comparator<personne> {

	@Override
	public int compare(personne P1, personne P2) {
		return P1.getage() - P2.getage();
	}
	
	

}
