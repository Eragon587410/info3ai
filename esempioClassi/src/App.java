import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Punto p1 = new Punto();
        Punto p2 = new Punto(1,1);

        p1.setX(5);
        p1.setY(1);

        System.out.println(p1);
        System.out.println(p1.distanzaOrigine());

        System.out.println(p2);
        System.out.println(p2.distanzaOrigine());

        System.out.println(p1.distanzaPunti(p2.getX(),p2.getY()));
        System.out.println(p1.distanzaPunti(p2));
    
        double x,y;
        x = input.nextDouble();
        y = input.nextDouble();

        Punto p4 = new Punto(x,y);
        System.out.println(p2.distanzaPunti(p4));
        }
}
