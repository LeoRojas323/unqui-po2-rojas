package ar.edu.unq.po2.tp3;

public class Persona2 {
	
    private String nombre;
    private String apellido;
    private int edad;

    public Persona2(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
}
