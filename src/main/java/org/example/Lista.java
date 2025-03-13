package org.example;

public class Lista {

    private Livro cabeca;
    private Livro anterior;

    public void adicionar(Livro livro) {
        if (cabeca == null) {
            cabeca = livro;
        } else {
            livro.setAnterior(cabeca);
            cabeca = livro;
        }
        anterior = livro;
    }

    public void remover() {
        if (cabeca == null) {
            System.out.println("Lista vazia!");
            return;
        }

        Livro atual = cabeca;
        cabeca = cabeca.getAnterior();
        System.out.println("Último livro removido: " + atual.getNome());
    }

    public void listar() {
        if (cabeca == null) {
            System.out.println("Lista vazia!");
            return;
        }

        Livro atual = cabeca;
        while (atual != null) {
            System.out.println("Nome: " + atual.getNome() +
                    ", Ano: " + atual.getAno() +
                    ", Preço: " + atual.getPreco());
            atual = atual.getAnterior();
        }
    }

    public Livro getCabeca() {
        return cabeca;
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro 1", 2020, 29.99);
        Livro livro2 = new Livro("Livro 2", 2021, 39.99);
        Livro livro3 = new Livro("Livro 3", 2022, 49.99);

        Lista lista = new Lista();

        lista.adicionar(livro1);
        lista.adicionar(livro2);
        lista.adicionar(livro3);

        System.out.println("Lista de livros após adições:");
        lista.listar();

        lista.remover();

        System.out.println("\nLista de livros após remoção do cabeca (ultimo livro adicionado):");
        lista.listar();

        Livro primeiroLivro = lista.getCabeca();
        System.out.println("O cabeca é: " + primeiroLivro.getNome());
    }
}
