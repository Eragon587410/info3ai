// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

public class App {
  public static void main(String[] args) {
    int nPC [] = {0,0,1,0,1,1,1,0,1,1};
    int nPulsanti []  = {0,0,0,0,0,0,0,0,0,0};
    
    for (int i = 1; i<=nPC.length;i++){
      int j = i+1; 
      boolean trovato = false;
      while (j <= nPulsanti.length && trovato == false){
        if (j %i== 0 && nPC[i-1]!=nPulsanti[j-1]){
          nPulsanti[j-1] = 1;
          nPC[i-1] = nPC[j-1];
          trovato = true;
        }
        j++;
      }
      if (trovato == false && nPC[i-1] == 0){
        nPulsanti[i-1] = 1;
        nPC[i-1] = 1;
      }
    }
    for (int i = 0; i<nPulsanti.length;i++){
      System.out.println(nPulsanti[i]);
    }
    System.out.println();
    for (int i = 0; i<nPC.length;i++){
      System.out.println(nPC[i]);
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}