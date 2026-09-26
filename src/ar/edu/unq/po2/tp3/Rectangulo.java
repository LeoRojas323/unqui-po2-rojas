package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
    private Point ubicacion;
    private int ancho;
    private int alto;
    
    public Rectangulo(Point ubicacion, int ancho, int alto) {
        this.ubicacion = ubicacion;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public int area() {
        return this.ancho * this.alto;
    }
    
    public int perimetro() {
        return 2 * this.ancho + 2 * this.alto;
    }
    
    public boolean esHorizontal() {
        return this.ancho > this.alto;
    }
    
    public boolean esVertical() {
        return this.alto > this.ancho;
    }
    
    
}
