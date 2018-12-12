package tn.aminelch.java.tdInterfaces ;

public class Article {

    private double prixAchat;
    private double prixVente;
    private String Nom;
    private String fournisseur;

    public Article(double prixAchat, double prixVente, String n, String f) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.Nom = n;
        this.fournisseur = f;
    }

    public double getprixAchat() {
        return prixAchat;
    }

    public void setprixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public double getprixVente() {
        return this.prixVente;
    }

    public void setprixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

    public String getFournisseur() {
        return this.fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    //formule = (prixVente -prixAchat )/ prixAchat
    public double rendement()
    {
        return (this.prixVente - this.prixAchat) / this.prixAchat;
    }


    public void affiche() {
        System.out.println("*****************************************");
        System.out.println("Nom du produit:" + this.getNom());
        System.out.println("Fournisseur: " + this.fournisseur);
        System.out.println("Prix d'achat: " + this.getprixAchat());
        System.out.println("Prix de vente: " + this.getprixVente());
        System.out.println("Redement: " + this.rendement());
        System.out.println("*****************************************");
    }
}