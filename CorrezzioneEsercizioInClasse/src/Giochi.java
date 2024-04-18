public class Giochi {
    private String lista[];
    private int numeroGiochi;

    public boolean cercaTitolo(String titolo) {
        boolean trovato = false;
        if (titolo != null) {
            for (int i = 0; i < numeroGiochi; i++) {
                if (titolo.equals(lista[i])) {
                    trovato = true;
                }
            }
        } else {
            trovato = true;
        }
        return trovato;
    }

    public void aggiungiTitolo(String titolo) {
        if (!cercaTitolo(titolo) && numeroGiochi < lista.length) {
            lista[numeroGiochi] = titolo;
            numeroGiochi++;
        }
    }

    public Giochi() {
        numeroGiochi = 0;
        lista = new String[0];
    }

    public Giochi(int max) {
        numeroGiochi = 0;
        lista = new String[max];
    }

    public Giochi(int max, String[] giochi) {
        lista = new String[max];
        for (int i = 0; i < giochi.length; i++) {
            aggiungiTitolo(giochi[i]);
        }
    }

    public Giochi(Giochi lista) {
        this(lista.lista.length, lista.lista);
    }

    public boolean rimuoviGioco(String titolo) {
        boolean trovato = false;
        for (int i = 0; i < numeroGiochi; i++) {
            if (titolo.equals(lista[i])) {
                for (int j = i; j < numeroGiochi - 1; j++) {
                    lista[j] = lista[j + 1];
                }
                numeroGiochi--;
                lista[numeroGiochi] = null;
                trovato = true;
            }
        }
        return trovato;
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < numeroGiochi; i++) {
            s += i + 1 + ": " + lista[i] + "\n";
        }

        return s;
    }
    public String cercaTipo(String parola){
        String s = "";
        for (int i = 0; i < numeroGiochi; i++){
            if (lista[i].contains(parola)){
                s += lista[i] + "\n";
            }
        }
        return s;
    }


}
