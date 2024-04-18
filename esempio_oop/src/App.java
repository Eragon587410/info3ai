public class App {
    public static void main(String[] args) throws Exception {
        //Tipo   oggetto   = new Costruttore
        //Matrice matrice = new Matrice(); //costruttore di default

        //System.out.println(matrice); //Matrice@2f92e0f4
        
        //Matrice matrice = new Matrice(3 , 2) crea matrice vuota
        
        double [][]mat ={
                         {1,2},
                         {4,5},
                         {7,8}
                        };
        Matrice salto = new Matrice(mat);
        System.out.println(salto);
        /* 
        matrice.azzera();
        System.out.println(matrice);
        System.out.println(matrice.trasposta);
        */         
    }
}
