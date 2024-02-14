package models;

public class OrderLinje {
    private int antal;
    private Vare vare;

    public Orderlinje(int antal, Vare vare) {
        this.antal = antal;
        this.vare = vare;
    }

    public int hentAntal() {
        return antal;
    }
    public double hentVarePris() {
        return vare.hentPris();
    }
}
