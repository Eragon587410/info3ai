import java.util.*;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int v1 []={4,6,2,1,3,5,8};
        int v2 []= {2,5,4,9};
        int v3 [] = new int [v1.length+v2.length];

        for (int i = 0; i < v1.length; i++) {
            for(int i2 = 0; i < v3.length; i++) {
                if(v3[i2]!=v1[i]){
                    v3[i2]=v1[i];
                }
            
            }
        }
        for (int i = 0; i < v2.length; i++) {
            for(int i2 = 0; i < v3.length; i++) {
                if(v3[i2]!=v2[i]){
                    
                    v3[v3.length-v2.length+i]=v2[i];
                }

           
        }
    }
        for (int i = 0; i < v3.length; i++) {
            System.out.println(v3[i]);
}       
}
}