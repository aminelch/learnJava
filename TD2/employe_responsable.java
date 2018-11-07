public class employeResponsable extends Employe{
    final double pourcentage= 0.5 ; 
    //constructeur
    public employeResponsable(String Nom){
        this.Nom=Nom;
    }
    //constructeur avec params
    public employeOrdinaire(String Nom,int Heures,double TarifHoraire){
        this.Nom=Nom;
        Employe.super.setInfosSalaire(Heures,TarifHoraire);

    }

    public double calculSalaire(){
        return (this.nbrHeures*this.tarifHoraire) + (pourcentage *(this.nbrHeures*this.tarifHoraire));
        
    }

}