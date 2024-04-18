import java.util.*;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double v1 []={1,2,3,4,5,6};
        double v2 []= new double[6];
        int i2 = 0;
        for(int i = 0;i<v1.length;i++){
            if(v1[i]%2==0){
                v2[i2]=v1[i];
                i2++;
            }
        }
        for(int i=0;i<i2;i++){
            System.out.println(v2[i]);
        }

    }
}
