class Ecole extends Institution {
    private int nbrClasse;
    private String typeEcole;
    private String nomPromoteur;

    public Ecole(String nomInstitution, String nomPromoteur, String paysInstitution, int anneeCreation,
                String typeInstitution, String typeEcole, int nbrClasse) {
        super(nomInstitution, typeInstitution, paysInstitution, anneeCreation);
        this.nbrClasse= nbrClasse;
        this.typeEcole = typeEcole;
        this.nomPromoteur= nomPromoteur;
    }

    // Accesseurs et mutateurs de ecole class
    public int getNbrClasse() { return nbrClasse; }
    public void setNbrClasse(int nbrClasse) { this.nbrClasse = nbrClasse; }

    public String getTypeEcole() { return typeEcole; }
    public void setTypeEcole(String typeEcole) { this.typeEcole = typeEcole; }

    public String getNomPromoteur() { return nomPromoteur; }
    public void setNomPromoteur(String nomPromoteur) { this.nomPromoteur = nomPromoteur; }

    // Méthodes d'instance toujours ecole
    public String decrireEcole() {
        return super.decrireInstitution()
            + "\nType: " + typeEcole
            + "\nClasses: " + nbrClasse
            + "\npromoteur: "+ nomPromoteur;
    }

    public static String listerPromoteurs(Ecole e1, Ecole e2, Ecole e3) {
        return "Promoteurs: " + e1.getNomPromoteur() + ", " + e2.getNomPromoteur() + ", " + e3.getNomPromoteur();
    }
}