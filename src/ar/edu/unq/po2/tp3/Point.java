package ar.edu.unq.po2.tp3;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public void moverA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point sumar(Point otroPunto) {
        int nuevoX = this.x + otroPunto.x;
        int nuevoY = this.y + otroPunto.y;
        return new Point(nuevoX, nuevoY);
    }
    
    
}