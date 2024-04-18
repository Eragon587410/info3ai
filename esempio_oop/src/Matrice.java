public class Matrice {
    //attributo di classe
    double [][] matrice;
    //deep copy, crea una nuova matrice con gli stessi valori
    public Matrice(double[][] matrice){
        //abbiamo inizzializzato l'attributo matrice con la dimensione righe per colonne
        this.matrice = new double [matrice.length][matrice[0].length];
        for (int i = 0; i< matrice.length; i++){
            for (int j = 0; j < matrice[0].length; j++){
                this.matrice[i][j] = matrice [i][j];
            }
        }
        
        }
        //metodo per stampare la matrice
    public String toString(){
        String s="";
        for (int i = 0; i< matrice.length; i++){
            for (int j = 0; j < matrice[0].length; j++){
                s+=matrice[i][j]+ " ";
            }
            s+= "\n";
        }

        return s;
    }
}
