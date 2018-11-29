class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    public double calculerSurface() {
        return (getCote() * getCote());
    }

    public double calculerValeur(int anneeActuelle) {
        double valeur = 5 * super.calculerValeur(anneeActuelle);
        return valeur;
    }

    public double getCote() {
        return cote;
    }
}