public class App {
    public static void main(String[] args) throws Exception {
        
        double misurazioni [] = {1,2,3,4,5,6,7,8,9,10,11,12};

        Vettore v = new Vettore();

        Vettore v2 = new Vettore(misurazioni);

        System.out.println(v);
        System.out.println(v2);

        System.out.println(v2.somma());
        System.out.println(v2.media());

        System.out.println(v2.max());
        System.out.println(v2.min());
        
        
        
    }
}
