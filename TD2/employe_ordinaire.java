public class employeOrdinaire extends Employe{
    final double pourcentage= 0.3 ; 
    //constructeur
    public employeOrdinaire(String Nom){
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