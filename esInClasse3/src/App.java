import java.util.*;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double v1 []={3,2,3,4,2,6,3,4,2,6,3,4,2};
        double v2 []= new double[4];
        int numero = input.nextInt();
        int i2 = 0;
        for(int i = 0;i<v1.length;i++){
            if(v1[i]==numero){
                v2[i2]=i;
                i2++;
            }
        }
        for(int i=0;i<v2.length;i++){
            System.out.println(v2[i]);
        }

    }
}
