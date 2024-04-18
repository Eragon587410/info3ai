import java.util.*;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        double [] [] matrice = new double [2] [3]; //2=righe, 3 = colonne(indici)
        matrice [0] [0] = 1;
        matrice [0] [1] = 2;
        matrice [0] [2] = 3;
        matrice [1] [0] = 4;
        matrice [1] [1] = 5;
        matrice [1] [2] = 6;

        for(int i=0; i<matrice.length; i++){ //righe
            for(int j = 0; j<matrice[i].length;j++){ //colonne (numero indice)
                System.out.printf("%6.2f",matrice[i][j]);

            }
            System.out.println();
        }
        double [] [] matrice2 = {
                                    {1,2,3},
                                    {4,5,6}
                                
        };
        System.out.println("numero righe");
        int nr = input.nextInt();
        System.out.println("numero colonne");
        int nc = input.nextInt();

        double [] [] matrice3 = new double [nr] [nc];
        for(int i=0;i<matrice3.length;i++){
            System.out.println("inserisci i valori della riga "+ (i));
            for (int j=0;j<matrice3[i].length;j++){
                System.out.printf("matrice[%2d][%2d]:",i,(j));
                matrice3 [i] [j] = input.nextDouble();
            }
        }
        for(int i=0; i<matrice3.length; i++){ //righe
            for(int j = 0; j<matrice3[i].length;j++){ //colonne (numero indice)
                System.out.printf("%6.2f",matrice3[i][j]);
            }
            System.out.println();
        }
        double vettore [] = new double [matrice3[0].length];
        double vettore2 [] = new double [matrice3.length];

        for(int i=0;i<matrice3[0].length;i++){
            for (int j=0;j<matrice3.length;j++){
                vettore [i]+= matrice3[j][i];
            }
        }
        for(int i=0;i<matrice3.length;i++){
            for (int j=0;j<matrice3[i].length;j++){
                vettore2 [i]+= matrice3[i][j];
            }
        }
        System.out.println();
        for(int i = 0; i< vettore.length;i++){
            System.out.printf("%6.2f",vettore[i]);
        }
        System.out.println();
        for(int i = 0; i< vettore2.length;i++){
            System.out.printf("%6.2f",vettore2[i]);
        }
    }
}