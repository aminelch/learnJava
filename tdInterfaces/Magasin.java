package tn.aminelch.java.tdInterfaces;

public class Magasin {

    private double depense;
    private double revenu;
    private Article[] produits;
    public Magasin(double depense, double revenu, int taille)
    {
        this.depense = depense;
        this.revenu = revenu;
        // j'ai rencontré un prob au niveau d'ajout d'un nouveau elem
        // ce pour ça j'ai muliplier la taille par 3 pour que
        // j'ai puisse ensuite ajouter un elm facilement au niveau
        //de la methode Ajouter
        produits = new Article [taille*3];
    }
    public void Inventaire()
    {
        System.out.println("Affichage de la liste *****");
        for(int i = 0; i < (int) produits.length; i++)
        {
            System.out.println("produits" + i + ":\n");
            System.out.println("nom: "+ produits[i].getNom());
            System.out.println("fournisseur: " + produits[i].getFournisseur());
        }
        System.out.println("=======================================");
    }
    public void Ajouter(Article A)
    {
    this.produits [ produits.length + 1 ]=A;

    }
    public double rendement()
    {
        return (this.revenu - this.depense) / this.depense;
    }

    public static void main(String[] args) {
        //Création des objets manuellement
        Magasin magasin = new Magasin(250000,258000,3);
        ArticleElectro machineALaver = new ArticleElectro(100,150,"Machine à laver", "Weld benZineb");
        ArticleLot Sucre = new ArticleLot(289,1.2,"Sucre","Sugar");
        ArticleLot Pomme = new ArticleLot(2.7,3.8,"Pomme","Saniyet l masmoudi");
        //affichage de magasin
        magasin.Inventaire();
        //calcul de rendement
        System.out.println("Le taux de rendement :");
        magasin.rendement();

    }
}