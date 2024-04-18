public class Matrice {

    // ATTRIBUTO DI CLASSE
    private double[][] matrice;

    // costruttore di default
    public Matrice() {

    }

    public Matrice(int righe, int colonne) {
        this.matrice = new double[righe][colonne];
    }

    // costruttore master
    public Matrice(double[][] matrice) {
        // this.matrice = matrice deep copy copia profonda senza duplice modifica o
        // shallow copy in questo caso
        this.matrice = new double[matrice.length][matrice[0].length];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                this.matrice[i][j] = matrice[i][j];
            }

        }
    }
    
    public Matrice(Matrice B) {
        this(B.matrice);

    }
    
    public void setElemento(int r, int c, double elemento){
        this.matrice[r][c] = elemento;
    }



    // addizzione tra due matrici della stessa dimensione
    public Matrice somma(Matrice B) {

        Matrice C = new Matrice(this.matrice.length, this.matrice[0].length);

        if (matrice.length == B.matrice.length && matrice[0].length == B.matrice[0].length) {
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[0].length; j++) {
                    C.matrice[i][j] = matrice[i][j] + B.matrice[i][j];
                }
            }
        }

        return C;
    }

    public Matrice prodottoPerScalare(double k) {
        Matrice C = new Matrice(matrice.length, matrice[0].length);
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                C.matrice[i][j] = matrice[i][j] * k;
            }
        }
        return C;
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                s += String.format("%6.2f", matrice[i][j]);
            }
            s += "\n";
        }

        return s;
    }

    public boolean equals(Matrice a) {
        boolean risultato = false;
        int i = 0;
        int j = 0;

        if (this == a) {
            risultato = true;
        } else if (a instanceof Matrice && this.matrice.length == a.matrice.length
                && this.matrice[0].length == a.matrice[0].length) {
            risultato = true;
            while (i < this.matrice.length && risultato) {
                while (j < this.matrice[0].length && risultato) {
                    if (this.matrice[i][j] != a.matrice[i][j]) {
                        risultato = false;

                    }
                    j++;
                }
                i++;
            }
        }
        return risultato;
    }

}
