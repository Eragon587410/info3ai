public class Libro {
    private String titolo;
    private String autore;
    private int numeroPagine;
    private static double costoPagina = 0.05;
    private final double COSTO_FISSO = 5.5;

    Libro() {
    }

    Libro(String titolo, String autore, int numeroPagine) {
        setTitolo(titolo);
        setAutore(autore);
        setNumeroPagine(numeroPagine);
    }

    Libro(Libro libro) {
        this(libro.titolo,libro.autore,libro.numeroPagine);
        /*
         * setTitolo(libro.getTitolo);
         */
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        if (numeroPagine>0){
        this.numeroPagine = numeroPagine;
        }else{
            this.numeroPagine = 0;
        }
    }
    public double prezzo(){
        return COSTO_FISSO + costoPagina*numeroPagine;
    }

    public static void setCostoPagina(double costo){
        costoPagina=costo;
      
    }

    public String toString(){
        String s="";
        s = "titolo: "+titolo+"\nautore: "+autore+"\nnumero pagine: "+numeroPagine;
        return s;
    }

    public boolean equals(Libro libro){
        boolean uguale = false;

        if (titolo.equals(libro.titolo) && autore.equals(libro.autore) && numeroPagine==libro.numeroPagine){
            uguale = true;
        }
        
        return uguale;
    }
}
