public class employeCommerciaux extends Employe{
    final double pourcentage= 0.01 ; 
    private double ca;//chiffre d'affaire 
    //constructeur
    public employeCommerciaux(String Nom){
        this.Nom=Nom;
    }
    //constructeur avec params
    public employeCommerciaux(String Nom,int Heures,double TarifHoraire){
        this.Nom=Nom;
        Employe.super.setInfosSalaire(Heures,TarifHoraire);

    }
    public double setChiffreDaffaire(double a){
        this.ca=a; 
    }
    public double getChiffreDaffaire(){
        return this.ca; 
    }
    public double calculSalaire(){
        return ((this.pourcentage)*this.getChiffreDaffaire())+this.getChiffreDaffaire();
        
    }

}