import java.util.*;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int v1 []={3,2,3,4,2,6,3,4,2,6,3,4,2};
        int v2 []= new int[10];

        for(int i = 0;i<v1.length;i++){
            v2[v1[i]]=v2[v1[i]]+1;
                }
            
        
        for(int i=0;i<v2.length;i++){
            System.out.print(v2[i]+", ");
        }

    }
}
