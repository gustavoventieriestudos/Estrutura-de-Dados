package org.example;



class No {
    int valor;
    No prox;

    public No(int v) {
        valor = v;
        prox = null;
    }
}

class Lista {
    No primeiro, ultimo;
    int totalNos;

    public Lista() {
        primeiro = ultimo = null;
        totalNos = 0;
    }

    public int getTotalNos() {
        return totalNos;
    }

    public boolean checkIfListaVazia() {
        return getTotalNos() == 0;
    }

    public void inserirNoInicio(No n) {
        if (checkIfListaVazia()) {
            primeiro = ultimo = n;
        } else {
            n.prox = primeiro;
            primeiro = n;
        }
        totalNos++;
    }

    public void inserirNoFim(No n) {
        if (checkIfListaVazia()) {
            primeiro = ultimo = n;
        } else {
            ultimo.prox = n;
            ultimo = n;
        }
        totalNos++;
    }

    public void excluirNo(No n) {
        if (checkIfListaVazia()) {
            System.out.println("Lista vazia, nada a excluir.");
            return;
        }

        No noAtual = primeiro, noAnterior = primeiro;
        int contador = 1;

        while (contador <= getTotalNos() && noAtual.valor != n.valor) {
            noAnterior = noAtual;
            noAtual = noAtual.prox;
            contador++;
        }

        if (noAtual.valor == n.valor) {
            if (getTotalNos() == 1) {
                primeiro = ultimo = null;
            } else if (noAtual == primeiro) {
                primeiro = noAtual.prox;
            } else {
                noAnterior.prox = noAtual.prox;
            }
            totalNos--;
        }
    }

    public void exibirLista() {
        No temp = primeiro;
        String valores = "";
        int contador = 1;

        if (!checkIfListaVazia()) {
            while (contador <= getTotalNos()) {
                valores += temp.valor + " -> ";
                temp = temp.prox;
                contador++;
            }
        }
        System.out.println(valores.isEmpty() ? "Lista vazia" : valores);
    }
}
