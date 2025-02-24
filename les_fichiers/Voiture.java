import java.io.Serializable;
class Voiture implements Serializable {
    // Attributes
    private String marque;
    private int nombrePneus;
    private int nombrePortes;
    private int numero;
    private int nombreChaises;

    public Voiture(String marque, int nombrePneus, int nombrePortes, int numero ,int nombreChaises ) 
   {
            
        this.marque = marque;
        this.nombrePneus = nombrePneus;
        this.nombrePortes = nombrePortes;
        this.numero = numero;
        this.nombreChaises = nombreChaises;
    }
        // getters yeah we can get so cool wesh
    public String getMarque() {
        return marque;
    }
    public int getNombrePneus() {
        return nombrePneus;
    }   
    public int getNombrePortes() {
        return nombrePortes;
    }   
    public int getNumero() {
        return numero;
    }
    public int getNombreChaises() {
        return nombreChaises;
    }
    // setters yeah we can set so cool wesh
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setNombrePneus(int nombrePneus) {
        this.nombrePneus = nombrePneus;
    }
    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setNombreChaises(int nombreChaises) {
        this.nombreChaises = nombreChaises;
    }
    public String toFileFormat() {
        return marque + "," + this.nombrePneus + "," +  this.nombrePortes + "," +this.numero+ "," +  this.nombreChaises;
    }
    public static Voiture fromFileFormat(String line) {
        String[] data = line.split(",");
        return new Voiture(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), 
                           Integer.parseInt(data[3]), Integer.parseInt(data[4]));
    }
    public String description(){
        String desc="je suis une voiture de la marque "+this.marque+", pneus "+this.nombrePneus;
        return desc;
    }

}
