package org.example;

public class MinhaPrimeiraED
{
    private Object[] objetos = new Object[10];
    public int totalDeObjetos = 0;

    // Quase certo
    public void adiciona(int posicao, Object objeto) {
        if (posicaoValida(posicao) && !posicaoOcupada(posicao) && !cheio()) {
            for (int i = totalDeObjetos; i > posicao; i--) {
                objetos[i] = objetos[i - 1];
            }
            objetos[posicao] = objeto;
            totalDeObjetos++;

        } else if (posicaoValida(posicao) && posicaoOcupada(posicao)) {
            if(cheio()){
                for (int i = totalDeObjetos; i > posicao; i--) {
                    objetos[i] = objetos[i - 1];
                }
                objetos[posicao] = objeto;
                totalDeObjetos++;
            }

            for (int i = totalDeObjetos; i > posicao; i--) {
                objetos[i] = objetos[i - 1];
            }
            objetos[posicao] = objeto;
            totalDeObjetos++;

        }
    }

    public void adiciona(Object objeto) {
        if(!cheio()){
            objetos[totalDeObjetos] = objeto;
            totalDeObjetos++;
        }
    }

    public boolean posicaoOcupada(int posicao) {
        return objetos[posicao] != null;
    }

    public boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < objetos.length;
    }

    public void remove(int posicao) {
        if (posicaoValida(posicao) && posicaoOcupada(posicao)) {
            for (int i = posicao; i < totalDeObjetos - 1; i++) {
                objetos[i] = objetos[i + 1];
            }
            objetos[totalDeObjetos - 1] = null;
            totalDeObjetos--;
        }
    }

    public boolean contem(Object objeto) {

        for(int i = 0; i < totalDeObjetos; i++){
            if(objetos[i].equals(objeto)) return true;
        }
        return false;
    }

    public Object getObjeto(int posicao) {

        if (posicaoValida(posicao) && posicaoOcupada(posicao)) return objetos[posicao];

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