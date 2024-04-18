import java.lang.Math.*;

public class Triangolo {
    private double lato1;
    private double lato2;
    private double lato3;

    // costruttori default
    public Triangolo() {
    }

    // costruttori master
    public Triangolo(double lato1, double lato2, double lato3) {
        setLato1(lato1);
        setLato2(lato2);
        setLato3(lato3);
    }

    public double getLato1() {
        return lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato1(double lato) {
        if (lato < 0) {
            System.out.println("Valore inferiore a zero");
            return;
        }
        lato1 = lato;
    }

    public void setLato2(double lato) {
        if (lato < 0) {
            System.out.println("Valore inferiore a zero");
            return;
        }
        lato2 = lato;
    }

    public void setLato3(double lato) {
        if (lato < 0) {
            System.out.println("Valore inferiore a zero");
            return;
        }
        lato3 = lato;
    }
    public String toString(){
        return lato1+", "+ lato2+", "+ lato3;
    }
    public double perimetro(){
        return lato1+lato2+lato3;
    }
    public double area(){
        double p = (lato1+lato2+lato3)/2;
        return Math.sqrt(p*(p-lato1)*(p-lato2)*(p-lato3));
    }
}