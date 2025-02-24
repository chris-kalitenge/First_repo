class Velo implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("Le vélo démarre");
    }

    @Override
    public void arreter() {
        System.out.println("Le vélo s'arrête");
    }

    @Override
    public int getVitesseMax() {
        return 30;
    }
}
