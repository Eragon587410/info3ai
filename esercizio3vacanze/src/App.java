import java.util.*;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double [] v1 = {1,2,3};
        double [] v2 = {1,2,3,4,5,6};
        System.out.println(v1);
        System.out.println(v2);
        v1 = v2;
        for(int i = 0; i<v1.length;i++){
            System.out.println(v1[i]);
        }
        for(int i = 0; i<v2.length;i++){
            System.out.println(v2[i]);
        }
        //l'identificatore v1 ha acquisito lo stesso valore di v2
        System.out.println(v1);
        System.out.println(v2);

        v1[0]=-1;
        System.out.printf("la componente 0 di v1= %.2f", v2[0]);


        double valore1 = 10;
        double valore2 = 20;
        valore1=valore2;
        System.out.println("indirizzo di valore1"+System.identityHashCode(valore1));
        System.out.println("indirizzo di valore2"+System.identityHashCode(valore2));
}
}