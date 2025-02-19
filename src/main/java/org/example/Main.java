package org.example;

public class Main {
    public static void main(String[] args) {
        MinhaPrimeiraED lista = new MinhaPrimeiraED();

        // Teste 1: Inserção de elementos na lista
        System.out.println("Teste 1: Inserindo elementos na lista");
        lista.adiciona("Maçã");
        lista.adiciona("Banana");
        lista.adiciona("Cereja");
        lista.adiciona("Damasco");
        exibirObjetos(lista);

        // Teste 2: Inserção em uma posição específica
        System.out.println("Teste 2: Adicionando um item no meio da lista");
        lista.adiciona(2, "Uva");
        exibirObjetos(lista);

        // Teste 3: Exclusão de um item em determinada posição
        System.out.println("Teste 3: Removendo um item da lista");
        lista.remove(1);
        exibirObjetos(lista);

        // Teste 4: Busca por um elemento na lista
        System.out.println("Teste 4: Verificando se um item está na lista");
        System.out.println("A lista contém 'Maçã'? " + lista.contem("Maçã"));
        System.out.println("A lista contém 'Pêssego'? " + lista.contem("Pêssego"));

        // Teste 5: Contagem de elementos na lista
        System.out.println("Teste 5: Conferindo a quantidade de itens armazenados");
        System.out.println("Número de elementos na lista: " + lista.tamanho());

        // Teste 6: Teste de redimensionamento da estrutura
        System.out.println("Teste 6: Inserindo vários elementos para testar o crescimento da lista");
        for (int i = 0; i < 15; i++) {
            lista.adiciona(i, "Item-" + (i + 1));
        }
        exibirObjetos(lista);

        // Teste 7: Validação da lista vazia
        System.out.println("Teste 7: Checando se a lista está vazia");
        System.out.println("A lista está vazia? " + lista.vazio());

        // Teste 8: Recuperação de um item por índice
        System.out.println("Teste 8: Obtendo um elemento em uma posição específica");
        System.out.println("Elemento na posição 0: " + lista.getObjeto(0));
        System.out.println("Elemento na posição 3: " + lista.getObjeto(3));
    }

    public static void exibirObjetos(MinhaPrimeiraED objeto) {
        System.out.print("Objeto atual: [ ");
        for (int i = 0; i < objeto.tamanho(); i++) {
            System.out.print(objeto.getObjeto(i) + " ");
        }
        System.out.println("]");
    }
}
