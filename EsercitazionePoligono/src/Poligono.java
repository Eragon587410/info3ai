public class Poligono {
    
    int matrice [][]; 
    


    public Poligono(int[][] matrice) {
        this.matrice = new int[matrice.length][matrice[0].length];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                this.matrice[i][j] = matrice[i][j];
            }

        }
    }

    public String toString(){
        String s = "";
        for (int i = 0; i<matrice.length;i++){
                int j = i+1;
                s+="punto "+j+ ": x = "+matrice[i][0]+ ", y = " + matrice [i][1];
    
            s += "\n";
        }

        return s;
    }

    public boolean equals(Poligono matrice2) {
        boolean risultato = false;
        int i = 0;
        int j = 0;

        if (this == matrice2) {
            risultato = true;
        } else if (matrice2 instanceof Poligono && this.matrice.length == matrice2.matrice.length
                && this.matrice[0].length == matrice2.matrice[0].length) {
            risultato = true;
            while (i < this.matrice.length && risultato) {
                while (j < this.matrice[0].length && risultato) {
                    if (this.matrice[i][j] != matrice2.matrice[i][j]) {
                        risultato = false;

                    }
                    j++;
                }
                i++;
            }
        }
        return risultato;
    }
    public double perimetro() {
        double perimetro = 0;

        for (int i = 0;i<matrice.length-1;i++){
            double x =Math.pow(matrice[i][0]-matrice[i+1][0], 2);
            double y =Math.pow(matrice[i][1]-matrice[i+1][1], 2);
            perimetro += Math.sqrt(x+y);

        }
        if (matrice.length > 2){
            double x =Math.pow(matrice[matrice.length-1][0]-matrice[0][0], 2);
            double y =Math.pow(matrice[matrice.length-1][1]-matrice[0][1], 2);
            perimetro += Math.sqrt(x+y);
        }


        return perimetro;
    }
    /*public double distanza(){
        double distanza = 0;
        double distX =Math.pow(matrice[matrice.length-1][0]-matrice[0][0], 2);
            double distY =Math.pow(matrice[matrice.length-1][1]-matrice[0][1], 2);
            distanza = Math.sqrt(x+y);
        return distanza;
    }
    */
    
    
}
