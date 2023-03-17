import java.io.*;
import java.lang.*;
import java.util.*;

public class Vetor {
    private int elements[];
    private int MAX;
    private int currentSize;

    public Vetor() {
        MAX = 5;
        currentSize = 0;
        elements = new int[MAX];
    }
    public boolean empty(){
        //verifica se está vazio
        if (currentSize == 0 ) return true;
        else return false;

    }
    public boolean full(){
        //verifica se está cheio
        if (currentSize == MAX) return true;
        else return false;
    }
    //obter o tamanho da lista
    public int size(){
        return currentSize;
    }
    //obter o valor de uma determinada posição na lista
    public int search (int position) {
        int dados;
        return elements[position];
    }
    //inserir um elemento em uma determinada posição
    public boolean insert(int position, int dados){
        if (full() || (position > currentSize+1) || (position<=0)){
            return false;
        }
        for (int i = currentSize; i >= position; i--){
            elements[i] = elements[i-1];
        }
        elements[position-1] = dados;
        currentSize++;
        return true;
    }
    public int remove (int position){
        int dados;
        if ((position > currentSize) || (position < 1)){
            return -1;
        }
        dados = elements[position-1];
        for (int i = position - 1; i < currentSize - 1; i++){
            elements[i] = elements[i+1];
        }
        currentSize--;
        return dados;
    }
}



