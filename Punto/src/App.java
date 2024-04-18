public class App {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto(1,2);
        Punto p2 = new Punto(p1);
        Punto p3 = new Punto(3,2);
        Punto p4 = new Punto(p1);
        p2.setX(10);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distanza(p3));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));

    }
}
