package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

    private ArrayList<Integer> numeros;

    public Multioperador() {
        this.numeros = new ArrayList<Integer>();
    }

    public void addNumber(int numero) {
        this.numeros.add(numero);
    }
    
    
    
    public int sumarTodos() {
        int acumulador = 0;
        for (Integer numero : this.numeros) {
            acumulador = acumulador + numero;
        }
        return acumulador;
    }
    
    public int multiplicarTodos() {
        int acumulador = 1;
        for (Integer numero : this.numeros) {
            acumulador = acumulador * numero;
        }
        return acumulador;
    }
    
    
    public int restarTodos() {
        int acumulador = this.numeros.get(0);
        for (int i = 1; i < this.numeros.size(); i++) {
            acumulador = acumulador - this.numeros.get(i);
        }
        return acumulador;
    }
}



