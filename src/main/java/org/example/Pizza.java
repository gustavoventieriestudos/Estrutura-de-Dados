package org.example;

public class Pizza {

    private String sabor;
    private double preco;

    public Pizza(double preco, String sabor) {
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
