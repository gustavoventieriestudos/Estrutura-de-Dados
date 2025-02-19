package org.example;

public class Bebida {

    private String sabor;
    private double preco;

    public Bebida(double preco, String sabor) {
        this.preco = preco;
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
