package models;
public class Vare {
    private String navn;
    private double pris;
    public Vare(String navn, double pris) {
        this.navn = navn;
        this.pris = pris;
    }
    public double hentPris() {
        return pris;
    }
}
