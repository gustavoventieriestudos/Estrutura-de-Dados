package org.example;

public class Main {

    public static void main(String[] args) {
        MinhaPrimeiraED ED = new MinhaPrimeiraED();


        ED.adiciona(2);
        ED.adiciona(3);
        ED.adiciona(2);
        ED.adiciona(2);
        ED.adiciona(2);
        ED.adiciona(2);
        ED.adiciona(2);
        ED.adiciona(2);
        ED.adiciona(2);
        ED.adiciona(2);
        ED.adiciona(2);
        ED.adiciona(2);
        ED.adiciona(2);


        // Funcionanando
        System.out.println(ED.cheio());
        System.out.println(ED.posicaoOcupada(2));
        System.out.println(ED.posicaoValida(20));
        System.out.println(ED.getObjeto(1));

        System.out.println(ED.vazio());
        System.out.println(ED.tamanho());




        ED.adiciona(1,5);

        //
    }
}