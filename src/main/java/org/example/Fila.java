package org.example;

public class Fila {

    private No inicio;
    private No fim;

    public Fila(){
        this.inicio = null;  
        this.fim = null;     
    }
    
   
    public void enfileira(Object elemento){
        No novoNo = new No();  
        novoNo.setItem(elemento);  
        
        if (vazia()) { 
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            this.fim.setProx(novoNo); 
            this.fim = novoNo;       
        }
    }

   
    public Object desenfileira(){
        if (vazia()) {
            return null; 
        }
        
        Object item = this.inicio.getItem();  
        this.inicio = this.inicio.getProx();  
        
        if (this.inicio == null) {  
            this.fim = null;
        }
        
        return item; 
    }

  
    public boolean vazia() {
        return this.inicio == null;
    }

   
    public void imprime() {
        No atual = this.inicio;
        while (atual != null) {
            System.out.print(atual.getItem() + " ");
            atual = atual.getProx();
        }
        System.out.println(); 
    }

    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        
       
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        
        System.out.println("Fila após enfileirar elementos:");
        fila.imprime();  
        
        System.out.println("Elemento removido: " + fila.desenfileira());
        System.out.println("Elemento removido: " + fila.desenfileira());  
        System.out.println("Fila após desenfileirar:");
        fila.imprime();  

        fila.enfileira(20);
        fila.enfileira(30);
        
        System.out.println("Fila após enfileirar elementos:");
        fila.imprime();  
    }
}
