package tn.aminelch.java.tdInterfaces;

public class ArticleElectro extends Article implements VendablePiece, Solde {

    private int pieces, stock = 0;

    //constructeur
    public ArticleElectro(double prixArticle, double prixVente, String nom, String fournisseur) {
        // naamel l appel lel parent bech ylanci l constructeur mtaao'u
        super(prixArticle, prixVente, nom, fournisseur);
        //mise à zéro de stock
        this.stock = 0;
    }


    public void RemplirStock(int Quantite) {
        this.stock += Quantite;
    }

    public void Afficher() {
        super.affiche();
        System.out.println("Le stock  " + this.stock + "pieces.");
    }


    public void startSolde(double pourcentage) {
        double nouveauSoldePrix = super.getprixVente() - (super.getprixVente() * pourcentage / 100);
        System.out.println("Solde de  : " + nouveauSoldePrix);
        super.setprixVente(nouveauSoldePrix);
    }

    public void endSolde(double pcnt) {
        double sld = super.getprixVente() + (super.getprixAchat() * pcnt / 100);
        System.out.println("Fin de solde de : " + sld);
        super.setprixVente(sld);
    }

    public double Vendre(int qte) {
        if (qte < stock) {
            stock -= qte;
            return qte * super.getprixVente();
        } else {
            System.out.println("Repture du stock");
            return 0;
        }

    }
}