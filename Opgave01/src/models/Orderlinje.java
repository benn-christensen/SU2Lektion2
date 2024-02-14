package models;
public class Orderlinje {
    private int antal;
    private Vare vare;

    public Orderlinje(int antal, Vare vare) {
        this.antal = antal;
        this.vare = vare;
    }

    public double hentLinjePris() {
        return antal * vare.hentPris();
    }
}
