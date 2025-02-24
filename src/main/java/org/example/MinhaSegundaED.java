package org.example;

public class MinhaSegundaED {

    public String[] nomes = new String[26];

    int total_nomes = 0;

    public boolean validarIndice(int posicao){
        return posicao > 0 && posicao <= 26  ;
    }

    public int getIndice(String nome) {

        if (!validarNome(nome)) {
            return -1;
        }

        char primeiraLetra = nome.charAt(0);

        return switch (Character.toLowerCase(primeiraLetra)) {
            case 'a' -> 0;
            case 'b' -> 1;
            case 'c' -> 2;
            case 'd' -> 3;
            case 'e' -> 4;
            case 'f' -> 5;
            case 'g' -> 6;
            case 'h' -> 7;
            case 'i' -> 8;
            case 'j' -> 9;
            case 'k' -> 10;
            case 'l' -> 11;
            case 'm' -> 12;
            case 'n' -> 13;
            case 'o' -> 14;
            case 'p' -> 15;
            case 'q' -> 16;
            case 'r' -> 17;
            case 's' -> 18;
            case 't' -> 19;
            case 'u' -> 20;
            case 'v' -> 21;
            case 'w' -> 22;
            case 'x' -> 23;
            case 'y' -> 24;
            case 'z' -> 25;
            default -> -1;
        };
    }

    public void adiciona(String nome){
        int posicao = getIndice(nome);

        if (!validarIndice(posicao)) {
            throw new ArrayIndexOutOfBoundsException("Posição fora do intervalo.");
        }
        if (posicaoOcupada(posicao)){
            System.out.println("Posição Ocupada");
            return;
        }

        nomes[posicao] = nome;
        total_nomes++;

    }

    private boolean posicaoOcupada(int posicao){
        if (!validarIndice(posicao)) {
            throw new ArrayIndexOutOfBoundsException("Posição fora do intervalo.");
        }
        return nomes[posicao] != null && nomes[posicao] != "";
    }

    public void remove(String nome){
        int posicao = getIndice(nome);
        if (!validarIndice(posicao)) {
            throw new ArrayIndexOutOfBoundsException("Posição fora do intervalo.");
        }

        if (!posicaoOcupada(posicao)){
            System.out.println("Posição Não Ocupada. Impossivel Efetuar A Ação Remover");
            return;
        }
        nomes[posicao] = "";

    }

    public boolean validarNome(String nome){
        return nome != null && !nome.isEmpty();
    }


    public boolean contem(String nome){
        int posicao = getIndice(nome);

        if (!validarIndice(posicao)) {
            throw new ArrayIndexOutOfBoundsException("Posição fora do intervalo.");
        }
        return nomes[posicao] != null && nomes[posicao] != "";
    }


    public String getNome(int posicao){
        if (!validarIndice(posicao)) {
            throw new ArrayIndexOutOfBoundsException("Posição fora do intervalo.");
        }
        if(!posicaoOcupada(posicao)){
            return "Não Há Nome Nessa Posição";
        }
        return nomes[posicao];
    }

    public int totalNomes(){
        return total_nomes;
    }
}
