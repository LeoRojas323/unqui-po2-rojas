package ar.edu.unq.po2.tp3;
import java.time.LocalDate;
import java.time.Period;


public class Persona {

	private String nombre;
	private LocalDate fecNac;
	
	public Persona(String nombre, LocalDate fecNac) {
		this.nombre = nombre;
		this.fecNac = fecNac;
	}
	
	public String getNombre() {
	    return this.nombre;
	}

	public LocalDate getFechaDeNacimiento() {
	    return this.fecNac;
	}
	
	
	public int getEdad() {
		return Period.between(this.fecNac, LocalDate.now()).getYears();
	}
	
	public boolean menorQue(Persona persona) {
	    return this.getEdad() < persona.getEdad();
	}

	
	
	
	
	
	
}
