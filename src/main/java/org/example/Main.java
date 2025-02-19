package org.example;

public class Main {
    public static void main(String[] args) {

        Pizza p1 = new Pizza(50.00, "mussarela");
        Pizza p2 = new Pizza(60.00, "marguerita");
        Pizza p3 = new Pizza(70.00, "portuguesa");
        Pizza p4 = new Pizza(80.00, "napoitana");
        Pizza p5 = new Pizza(90.00, "calabresa");


        Bebida b1 = new Bebida(10.00, "suco");


        CarrinhoDeCompras c1 = new CarrinhoDeCompras();

        c1.adicionaBebida(b1);
        c1.adicionaPizza(p1);

        System.out.println("total: " + c1.getTotalPagar());





    }
}
