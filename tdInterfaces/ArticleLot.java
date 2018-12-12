package tn.aminelch.java.tdInterfaces;

public class ArticleLot extends  Article implements  VendableKilos{
    public int quantite;
    public int stock;


    public ArticleLot(double pachat, double pvente, String nom, String fournisseur){
        super(pachat,pvente,nom,fournisseur);
    }

    public void Afficher() {
        super.affiche();
        System.out.println("Le stock  " + this.stock + "pieces.");
    }

    public double Vendre(int q) {
        if (q < stock) {
            this.stock = this.stock - q;
            return q * super.getprixVente();
        }
        else {
            System.out.println("repture du stock");
            return 0;
        }
    }

    public void RemplirStock(int qte) {
        stock = stock + qte;
    }
    public void affiche() {
        super.affiche();
        System.out.println("===================================================");
        System.out.println("Le stock du produit est " + stock + " kilogrammes.");
    }
}
