package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Persona2> trabajadores;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.trabajadores = new ArrayList<Persona2>();
	}
	
	public void añadirTrabajador(Persona2 trabajador) {
		this.trabajadores.add(trabajador);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double promedioDeEdad() {
		return this.sumaDeEdadesDeTrabajadores() / this.trabajadores.size();
	}
	
	public int sumaDeEdadesDeTrabajadores() {
		int sumaDeEdades = 0;
		for(Persona2 trabajador: this.trabajadores) {
			sumaDeEdades = sumaDeEdades + trabajador.getEdad();
		}
		return sumaDeEdades;
	}
	
	
	
}
