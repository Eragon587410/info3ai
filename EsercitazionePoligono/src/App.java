import java.util.Scanner;


public class App {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int matrice[][]= {

                        {1,2},
                        {3,2},
                        {3,4},
                        {1,4}
                                };
        Poligono prova = new Poligono(matrice);

        System.out.println(prova);
        System.out.println(prova.perimetro());
    }


}

