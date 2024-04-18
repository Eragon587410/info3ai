public class Mensola {
    //CLASSE AGGREGANTE
    public Libro[] volumi;
    private static final int NUM_MAX_VOLUMI = 15;

    public Mensola() {
        volumi = new Libro[NUM_MAX_VOLUMI];
    }

    public Mensola(Mensola mensola) {
        this();
        for (int i = 0; i < mensola.volumi.length; i++) {
            if (mensola.volumi[i] != null) {
                setVolume(mensola.volumi[i], i);
            }
        }
    }

    public int setVolume(Libro volume, int posizione) {
        int out = -1;
        if (posizione >= 0 && posizione < NUM_MAX_VOLUMI && getVolume(posizione) == null) {
            volumi[posizione] = new Libro(volume);
            out = posizione;
        } else if (getVolume(posizione) != null) {
            out = -2;
        }
        return out;
    }

    public int getNumVolumi() {
        int out = 0;
        for (int i = 0; i < NUM_MAX_VOLUMI; i++) {
            if (volumi[i] != null) {
                out++;
            }
        }
        return out;
    }

    public int getNumMaxVolumi() {
        return NUM_MAX_VOLUMI;
    }

    public Libro getVolume(int posizione) {
        return volumi[posizione];
    }

    public int rimuoviVolume(int posizione) {
        int out = -1;
        if (posizione >= 0 && posizione < NUM_MAX_VOLUMI && getVolume(posizione) != null) {
            volumi[posizione] = null;
            out = posizione;
        } else if (getVolume(posizione) == null) {
            out = -2;
        }
        return out;
    }
    public int volumeXParolaInTitolo(String parola){
        int risultato = -1;
        int i = 0;
        while (i < volumi.length && risultato == -1){
            if (volumi[i]!=null && volumi[i].getTitolo().toLowerCase().contains(parola.toLowerCase())){
                risultato = i;
            }
            i++;
        }

        return risultato;
    }
    public int contaVocali(int posizione){
        int out = 0;
        char vocali [] ={'a','e','i','o','u'};
        if (posizione >= 0 && posizione < NUM_MAX_VOLUMI && volumi[posizione]!=null){
            for (int i = 0; i < volumi[posizione].getTitolo().length(); i++){
                for (int j = 0; j < vocali.length; j++){
                    if (volumi[posizione].getTitolo().toLowerCase().charAt(i)==vocali[j]){
                        out++;
                    }
                }
            }
        }
        return out;
    }
    public int scambioPosizioneLibri(int pos1, int pos2){
        int out = -1;

        if (pos1 >= 0 && pos2 >= 0 && pos1 < volumi.length && pos2 < volumi.length && volumi[pos1]!=null & volumi[pos2]!=null){
            Libro intermedio = volumi[pos1];
            volumi[pos1]=volumi[pos2];
            volumi[pos2]=intermedio;
            intermedio = null;
            out = pos1;
        }

        return out;
    }

    public String toString() {
        String out = "MENSOLA\n";
        for (int i = 0; i < NUM_MAX_VOLUMI; i++) {
            if (volumi[i] != null) {
                out += " " + i + ". Titolo: " + volumi[i].getTitolo() + "; Autore: " + volumi[i].getAutore()
                        + "; Numero Pagine: " + volumi[i].getNumeroPagine() + "\n";
            } else {
                out += " " + i + ". spazio vuoto\n";
            }
        }
        return out;

    }
}
