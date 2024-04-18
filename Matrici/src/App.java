import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
    
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int righe, colonne;
        
        double [][] matriceInput = 
        {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        double [][] matriceInput2 = 
        {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        double [][] matriceInput3 = 
        {
            {1.0, 2.0, 3.0, 6},
            {4.0, 5.0, 6.0, 6}
        };
        double [][] matriceInput4 = 
        {
            {1.0, 3.0, 3.0},
            {4.0, 1.0, 6.0}
        };
        Matrice A = new Matrice(matriceInput);
        Matrice B = new Matrice(matriceInput);
        System.out.println(A.toString());

        /*System.out.println("numero righe");
        righe = input.nextInt();
        System.out.println("colonne");
        colonne = input.nextInt();
        double matriceEsterna [][] = new double[righe][colonne];
        for (int i = 0; i<matriceEsterna.length;i++){
            for (int j = 0; j<matriceEsterna[0].length;j++){
                System.out.println("Inserisci valore riga "+ i+ " e colonna "+ j);
                matriceEsterna[i][j]= input.nextDouble();
            }
        }
        Matrice A2 = new Matrice (matriceEsterna);
        System.out.println(A2);
        */
        Matrice C = A.somma(B);
        System.out.println(C);

        Matrice E = A.somma(B).somma(C); //proprietà associativa in mate, method chain in informatica
        System.out.println(E);
        Matrice K = A.prodottoPerScalare(10);
        System.out.println(K);

        Matrice prova = new Matrice(matriceInput);
        Matrice prova1 = new Matrice(matriceInput3);

        System.out.println(prova.equals(prova1));
        Matrice prova32 = new Matrice(prova);
        prova32.setElemento(0,0,100);
        System.out.println(prova);


       
    }
}
