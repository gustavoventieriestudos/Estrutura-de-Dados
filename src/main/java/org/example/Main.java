package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // Adicionando elementos
        lista.inserirNoFim(new No(10));
        lista.inserirNoFim(new No(20));
        lista.inserirNoInicio(new No(5));
        lista.inserirNoFim(new No(30));

        // Exibindo a lista
        System.out.println("Lista após inserção:");
        lista.exibirLista();

        // Removendo um elemento
        lista.excluirNo(new No(20));
        System.out.println("Lista após remover 20:");
        lista.exibirLista();

        // Testando lista vazia
        lista.excluirNo(new No(5));
        lista.excluirNo(new No(10));
        lista.excluirNo(new No(30));
        System.out.println("Lista após remover todos:");
        lista.exibirLista();
    }
}
