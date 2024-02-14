package models;
public class Order {
    private ArrayList<Orderlinje> orderlinjer = new ArrayList<>();
    public void tilføjOrderlinje(int antal, Vare vare) {
        orderlinjer.add(new Orderlinje(antal, vare));
    }

    public double beregnSamletPris() {
        double samletpris = 0;
        for (OrderLinje orderlinje : orderlinjer) {
            samletpris += orderlinje.be
        }
    }
}
