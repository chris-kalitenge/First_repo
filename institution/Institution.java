import java.time.Year;

class Institution {
    private String nomInstitution;
    private String typeInstitution;
    private String paysInstitution;
    private int anneeCreation;
    // constructeur de la class Institution...
    public Institution(String nomInstitution, String typeInstitution, String paysInstitution, int anneeCreation) {
        this.nomInstitution = nomInstitution;
        this.typeInstitution = typeInstitution;
        this.paysInstitution = paysInstitution;
        this.anneeCreation = anneeCreation;
    }

    // Accesseurs et mutateurs de la class Institution
    public String getNomInstitution() { return nomInstitution; }
    public void setNomInstitution(String nomInstitution) { this.nomInstitution = nomInstitution; }

    public String getTypeInstitution() { return typeInstitution; }
    public void setTypeInstitution(String typeInstitution) { this.typeInstitution = typeInstitution; }

    public String getPaysInstitution() { return paysInstitution; }
    public void setPaysInstitution(String paysInstitution) { this.paysInstitution = paysInstitution; }

    public int getAnneeCreation() { return anneeCreation; }
    public void setAnneeCreation(int anneeCreation) { this.anneeCreation = anneeCreation; }

    // Méthodes d'instance toujours du fameux Institution
    public int calculerAge() {
        return Year.now().getValue() - anneeCreation;
    }

    public String decrireInstitution() {
        return "Nom: " + nomInstitution 
            + "\nType: " + typeInstitution
            + "\nPays: " + paysInstitution
            + "\nÂge: " + calculerAge() + " ans";
    }
}