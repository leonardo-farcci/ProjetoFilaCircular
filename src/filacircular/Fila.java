/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacircular;

/**
 *
 * @author lab212
 */
public class Fila {

    private static class No {

        public No prox; // PROXIMO NÓ DA FILA
        public int valor; // VALOR DO ELEMENTO ARMAZENADO

        public No(int val) {
            valor = val;
            prox = null;
        }
    }

    private No fim;      //REPRESENTA O FIM DA FILA
    private int size;          //NUMERO DE ELEMENTOS

    public Fila() {      //CONSTRUTOR DA FILA
        fim = null;
        size = 0;
    }

    public boolean isEmpty() {
        return fim == null;
    }

    public boolean search(int elem) {
        No nodo = fim.prox;
        for (int i = 0; i < size; i++) {
            if (elem == nodo.valor) {
                return true; //encontrou o elemento
            }
            nodo = nodo.prox;
        }
        return false; // não encontrou o elemento
    }

    public void insereInicio(int elem) { //insere no início da lista
        No novoNo = new No(elem);
        if (isEmpty()) // lista vazia
        {
            fim = novoNo; // o fim e o início da lista são o novo nó.
        } else // a lsita já possui elementos
        {
            novoNo.prox = fim.prox; // o novo nó aponta para o antigo início
        }
        fim.prox = novoNo; // o nó final aponta para o novo início
        size++;
    }

    public void insereFim(int elem) {
        No novoNo = new No(elem);
        if (isEmpty()) // lista vazia
        {
             // o fim e o início da lista são o novo nó.
             fim = novoNo;
            fim.prox = novoNo;
        } else // a lista já possui elementos
        {
            novoNo.prox = fim.prox; // o antigo inicio aponta para o novo nó
            fim.prox = novoNo;
            fim = novoNo;
        }
        size++; 
    }

    public void removeInicio() { //elimina o primiro item da lista
        No del;
        if (isEmpty()) {
            System.out.println("Lista Vazia!");
            return;
        }
        del = fim.prox; // del aponta para o primeiro elemento
        if (del == fim) // a lista só tem um elemento
        {
            fim = null;
        } else {
            fim.prox = del.prox; // atualiza o início da lista
        }
        size--;
    }
    
    public void removeFim() { //elimina o primiro item da lista
        No del;
        if (isEmpty()) {
            System.out.println("Lista Vazia!");
            return;
        }
        del = fim.prox; // del aponta para o primeiro elemento
        if (del == fim) // a lista só tem um elemento
        {
            fim = null;
        } else {
            del = fim.prox;
            // atualiza o início da lista
        }
        size--;
    }

    public String exibeLista() {
        if (isEmpty()) {
            return "Lista vazia\n"; //teste de lista vazia
        }
        String str = "Lista Encadeada: ";
        No nodo = fim.prox;
        for (int i = 0; i < size; i++) {
            str += " " + nodo.valor;
            nodo = nodo.prox;
        }
        return str + "\n";
    }

}
