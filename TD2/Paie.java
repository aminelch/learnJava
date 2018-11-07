public class Paie{

    public static void main(String args []) {
        
        employeOrdinaire e1 = new employeOrdinaire();
        employeResponsable e2 = new employeResponsable("Meriam");
        employeCommerciaux e3 = new employeCommerciaux("Wala");

        e1.Nom="Ahmed";
        e1.setInfosSalaire(39, 120);
        e2.setInfosSalaire(50, 189);
        e3.pourcentage(3);
    
        System.out.println(e1.Nom + " gagne " + e1.calculSalaire() + "DT");
        System.out.println(e2.Nom + " gagne " + e2.calculSalaire() + "DT");
        System.out.println(e3.Nom + " gagne " + e3.calculSalaire() + "DT");
    }

}