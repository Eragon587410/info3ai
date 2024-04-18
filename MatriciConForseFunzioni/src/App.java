import java.util.*;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void scambiaRighe(String titolo, double[][] matrice,int riga1,int riga2) {
        double mediatore;
        System.out.println(titolo);
        for(int j=0;j<matrice[0].length;j++){
            mediatore=matrice[riga1][j];
            matrice[riga1][j]=matrice[riga2][j];
            matrice[riga2][j]=mediatore;
        }
        System.out.println();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.printf("%6.2f", matrice[i][j]);
            }
            System.out.println();
            
        }
        System.out.println();
    
        
    }
    //non void dato che deve restituire valore
    public static double [][] trasposta(double[][] matrice) {
        double [][] matTrasporta = new double[matrice[0].length][matrice.length];

        for (int i=0;i<matrice.length;i++){
            for (int j = 0; j<matrice[0].length;j++){
                matTrasporta[j][i] = matrice [i][j];
            }
        }
        

        return matTrasporta;
        
    }

    public static void scambiaColonne(String titolo, double[][] matrice,int colonna1,int colonna2) {
        double mediatore;
        for(int j=0;j<matrice.length;j++){
            mediatore=matrice[j][colonna1];
            matrice[j][colonna1]=matrice[j][colonna2];
            matrice[j][colonna2]=mediatore;
        }
        System.out.println(titolo);
        System.out.println();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.printf("%6.2f", matrice[i][j]);
            }
            System.out.println();
            
        }
        System.out.println();
        
        
    }
    public static void azzeraMatrice(String titolo, double[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = 0;
            }
        }
    }

    public static void stampaMatrice(String titolo, double[][] matrice) {
        System.out.println(titolo);
        System.out.println();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.printf("%6.2f", matrice[i][j]);
            }
            System.out.println();
            
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        double[][] dati = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 }
        };

        scambiaRighe("scambiaRighe",dati,0,1);
        System.out.println();
        scambiaColonne("scambiaColonne",dati,0,1);

        trasposta(dati);
        
        System.out.println();
        stampaMatrice("traspostaDati", trasposta(dati));
        

    

}
}
