package org.example;

public class CarrinhoDeCompras {

    private double frete = 0;
    private double total_a_pagar = 0;

    MinhaPrimeiraED carrinho = new MinhaPrimeiraED();

    public void adicionaBebida(Bebida item) {
        carrinho.adiciona(item);
        total_a_pagar += item.getPreco();
    }

    public void adicionaPizza(Pizza item) {
        carrinho.adiciona(item);
        total_a_pagar += item.getPreco();
    }

    public double getTotalPagar(){
        return total_a_pagar;
    }

}
