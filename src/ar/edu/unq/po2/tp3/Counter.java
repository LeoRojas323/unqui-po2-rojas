package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
     
	private ArrayList<Integer> numbers;
	
	public Counter() {
		this.numbers = new ArrayList<Integer>();
	}
	
	public void addNumber(int number) {
		this.numbers.add(number);
	}
	
	public int getEvenOcurrences() {
	    int amount = 0;

	    for (Integer number : this.numbers) {
	        if (number % 2 == 0) {
	            amount++;
	        }
	    }

	    return amount;
	}
	
	public int getOddOcurrences() {
	    int amount = 0;

	    for (Integer number : this.numbers) {
	        if(number % 2 != 0) {
	        	amount++;
	        }
	    }
	    return amount;
	}
	
	public int getMultOcurrences(int numerito) {
		int amount = 0;
		
		for(Integer number: this.numbers) {
			if(number % numerito == 0) {
				amount++;
			}
		}
		return amount;
	}
	
	public int cantDigitosPares(int numero) {
		int cantidad = 0;
		
		while(numero > 0) {
			
			if (numero % 2 == 0) {
				cantidad++;
			}
			
			numero = numero / 10;
		}
		return cantidad;
	}
	
	public int numeroConMasDigitosPares(int[] numeros) {

	    int numeroConMasPares = numeros[0];
	    int mayorCantidadDePares = cantDigitosPares(numeros[0]);

	    for (int numero : numeros) {

	        int cantidadActual = cantDigitosPares(numero);

	        if (cantidadActual > mayorCantidadDePares) {
	            mayorCantidadDePares = cantidadActual;
	            numeroConMasPares = numero;
	        }
	    }

	    return numeroConMasPares;
	}	
	
	public int multiploMasAlto(int x, int y) {

	    for (int numero = 1000; numero >= 0; numero--) {

	        if (numero % x == 0 && numero % y == 0) {
	            return numero;
	        }
	    }

	    return -1;
	}
}






