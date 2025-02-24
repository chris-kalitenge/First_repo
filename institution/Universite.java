class Universite extends Institution {
    private String systemeEnseignement;
    private int nombreFacultes;
    private String nomRecteur;

    public Universite(String nomInstitution, String typeInstitution, String paysInstitution, int anneeCreation,
                     String systemeEnseignement, int nombreFacultes, String nomRecteur) {
        super(nomInstitution, typeInstitution, paysInstitution, anneeCreation);
        this.systemeEnseignement = systemeEnseignement;
        this.nombreFacultes = nombreFacultes;
        this.nomRecteur = nomRecteur;
    }

    // Accesseurs et mutateurs de univ
    public String getSystemeEnseignement() { return systemeEnseignement; }
    public void setSystemeEnseignement(String systemeEnseignement) { this.systemeEnseignement = systemeEnseignement; }

    public int getNombreFacultes() { return nombreFacultes; }
    public void setNombreFacultes(int nombreFacultes) { this.nombreFacultes = nombreFacultes; }

    public String getNomRecteur() { return nomRecteur; }
    public void setNomRecteur(String nomRecteur) { this.nomRecteur = nomRecteur; }

    // Méthodes d'instance toujours de univ
    public String decrireUniversite() {
        return super.decrireInstitution() 
            + "\nSystème: " + systemeEnseignement
            + "\nFacultés: " + nombreFacultes
            + "\nRecteur: " + nomRecteur;
    }

    public static String listerRecteurs(Universite u1, Universite u2) {
        return "Recteurs: " + u1.getNomRecteur() + " et " + u2.getNomRecteur();
    }
}