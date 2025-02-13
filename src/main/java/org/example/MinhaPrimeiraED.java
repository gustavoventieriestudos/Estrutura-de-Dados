package org.example;

public class MinhaPrimeiraED
{
    private Object[] objetos = new Object[10];
    public int totalDeObjetos = 0;

    public void adiciona(int posicao, Object objeto) {

    }

    public void adiciona(Object objeto) {
        if(cheio()){
            objetos[totalDeObjetos] = objeto;
            totalDeObjetos++;
        }

        objetos[totalDeObjetos] = objeto;
        totalDeObjetos++;

    }

    public boolean posicaoOcupada(int posicao) {
        return objetos[posicao] != null;
    }

    public boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < objetos.length;
    }

    public void remove(int posicao) {

    }

    public boolean contem(Object objeto) {
        return false;
    }

    public Object getObjeto(int posicao) {
        if (posicaoValida(posicao) && posicaoOcupada(posicao)) {
            return objetos[posicao];
        }
        return false;
    }

    public int tamanho() {
        return totalDeObjetos;
    }

    public boolean cheio() {
        if(totalDeObjetos == objetos.length){
            Object[] novoObjeto = new Object[objetos.length * 2];
            for (int i = 0; i < objetos.length; i++) {
                novoObjeto[i] = objetos[i];
            }
            objetos = novoObjeto;
            return true;
        }
        return false;
    }

    public boolean vazio() {
        return totalDeObjetos == 0;
    }
}
