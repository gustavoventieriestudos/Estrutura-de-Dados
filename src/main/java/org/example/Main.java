package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    MinhaSegundaED ED = new MinhaSegundaED();

    ED.adicionaNome("Gustavo");


        System.out.println(Arrays.toString(ED.nomes));
        ED.removeNome("Gustavo");
        System.out.println(Arrays.toString(ED.nomes));



    }
}
