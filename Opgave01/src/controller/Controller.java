package controller;
public class Controller {
    public static void main(String[] args) {
        Vare piratos = new Vare("Piratos", 0.25);
        Vare skumbanan = new Vare("Skumbanan", 2);
        Order order = new Order();
        order.tilføjOrderlinje(piratos, 20);
        order.tilføjOrderlinje(skumbanan, 10);
        order.beregnSamletPris();

    }
}
