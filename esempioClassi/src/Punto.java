import java.lang.Math;

public class Punto {

    // attrubuti
    private double x;
    private double y;

    public Punto() {
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // calcolo distanza origine
    public double distanzaOrigine() {
        return Math.sqrt((x * x) + (y * y));
    }

    public String toString() {
        String s = "";
        s = String.format("x: %6.2f, y: %6.2f", x, y);
        return s;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double distanzaPunti(double x, double y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y - y),2));
    }

    public double distanzaPunti(Punto p){
        return Math.sqrt(Math.pow((this.x-p.getX()),2)+Math.pow((this.y - p.getY()),2));
    }
}
