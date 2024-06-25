public class Porto {
    private Barca posti [];
    private int numeroBarchePrimiVenti;
    private int numeroBarcheVentunoCinquanta;
    private int numeroBarcheDopoCinquanta;

    public Porto(){
        posti = new Barca[100];
        numeroBarchePrimiVenti = 0;
        numeroBarcheDopoCinquanta = 0;
        numeroBarcheVentunoCinquanta = 0;
    }

    public Porto(Porto other){
        this();
        if (other != null){
            numeroBarchePrimiVenti = other.numeroBarchePrimiVenti;
            numeroBarcheVentunoCinquanta = other.numeroBarcheVentunoCinquanta;
            numeroBarcheDopoCinquanta = other.numeroBarcheDopoCinquanta;
            int numeroBarche = other.getNumeroBarche();
            int i = 0;
            while (i < posti.length && numeroBarche > 0){
                if (other.posti[i] != null){
                    setPosto(i, other.posti[i]);
                    numeroBarche--;
                }
                i++;
            }
        }
    }
    
    private int getNumeroBarche(){
        return numeroBarchePrimiVenti + numeroBarcheVentunoCinquanta + numeroBarcheDopoCinquanta;
    }

    private void setPosto(int posizione, Barca other){
        posti[posizione] = new Barca(other);
    }

    public void addBarca (Barca barca){
        if (barca != null && getNumeroBarche() < posti.length){
            if (barca.getTipologia().equals("vela") && numeroBarcheDopoCinquanta < 50 || numeroBarchePrimiVenti + numeroBarcheVentunoCinquanta >= 50){
                setPosto(50+numeroBarcheDopoCinquanta, barca);
                numeroBarcheDopoCinquanta++;
            } else {
                if (barca.getLunghezza() <= 10 && numeroBarchePrimiVenti < 20){
                    setPosto(numeroBarchePrimiVenti, barca);
                    numeroBarchePrimiVenti++;
                } else {
                    setPosto(20 + numeroBarcheVentunoCinquanta, barca);
                    numeroBarcheVentunoCinquanta++;
                }
            }
        }
    }

    public double importoSosta(Barca barca, int tempo){
        double out = 0;
        if (barca != null && tempo > 0){
            if (barca.getTipologia().equals("vela")){
                out = 10 * barca.getLunghezza() * tempo;
            } else {
                out = 20 * barca.getStazza() * tempo;
            }
        }

        return out;
    }

    public double removeBarca(int posizione, int tempo){
        double out = 0;
        if (posizione >= 0 && posizione < 100){
            out = importoSosta(posti[posizione], tempo);
            if (posti[posizione] != null){
                posti[posizione] = null;
                if (posizione > 49){
                    numeroBarcheDopoCinquanta--;
                } else if (posizione > 19){
                    numeroBarcheVentunoCinquanta--;
                } else {numeroBarchePrimiVenti--;}
            }
        }
        return out;
    }

    public String toString(){
        String out = "";
        for (int i = 0; i < numeroBarchePrimiVenti; i++){
            out += "("+ i + ") " + posti[i].toString();
        }
        for (int i = 0; i < numeroBarcheVentunoCinquanta; i++)
            out += "("+ (i+20) + ") " + posti[i+20].toString();
        for (int i = 0; i < numeroBarcheDopoCinquanta; i++)
            out += "("+ (i+50) + ") " + posti[i+50].toString();
        return out;
    }
}
