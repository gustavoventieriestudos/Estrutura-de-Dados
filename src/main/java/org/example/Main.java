package org.example;


public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Criando objetos Pessoa
        Pessoa p1 = new Pessoa(1, "João", "joao@gmail.com");
        Pessoa p2 = new Pessoa(2, "Maria", "maria@gmail.com");
        Pessoa p3 = new Pessoa(3, "Carlos", "carlos@gmail.com");

        // Testando adicionar elementos
        lista.adicionar(p1);
        lista.adicionar(p2);
        lista.adicionar(p3);

        // Exibindo os elementos
        System.out.println("Lista após adição:");
        exibirLista(lista);

        // Testando remoção
        lista.remover();
        System.out.println("Lista após remover último elemento:");
        exibirLista(lista);

        // Removendo até esvaziar
        lista.remover();
        lista.remover();
        System.out.println("Lista após remover todos:");
        exibirLista(lista);

        // Tentando remover de lista vazia
        lista.remover();
    }

    private static void exibirLista(ListaEncadeada lista) {
        while (lista.temProximo()) {
            System.out.println(lista.getPosicaoAtual().getValor());
        }
    }
}
