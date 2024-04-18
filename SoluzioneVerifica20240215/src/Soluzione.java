public class Soluzione {
    private double temperature[];// = new double [12];
    double vettore [] = new double[12];

    public Soluzione(double[] temperature) {
        setTemperature(temperature);
    }

    public double getTemperature(int mese) {
        return temperature[mese];
    }

    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < temperature.length; i++) {
            s += String.format("%2d - %.2f\n", i + 1, temperature[i]);
        }
        return s;
    }

    public double sommaEstiveEsercizio1() {
        double somma = 0;
        for (int i = 5; i <= 7; i++) {
            somma += temperature[i];
        }
        return somma;
    }

    public double maxEsercizio2() {
        double max = temperature[0];
        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] > max) {
                max = temperature[i];
            }
        }
        return max;
    }

    public double minEsercizio2() {
        double min = temperature[0];
        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] < min) {
                min = temperature[i];
            }
        }
        return min;
    }
    public String valorePresenzeEsercizio3(double numero){
        String output="";
        boolean trovato = false;
        int i = 0;
        while (i < temperature.length && trovato == false){
            if (numero == temperature[i]){
                trovato = true;
            }else{
                i++;
            }
        }
        if (trovato == true){
            output = "il mese è "+ i;
        }else{
            output= "valore non trovato";
        }

        return output;
    }
    public double mediaDispariEsercizio4(){
        double media = 0;
        double somma = 0;
        double conta = 0;

        for (int i = 0; i < temperature.length; i++){
            if (i %2 != 0){
                somma+=temperature[i];
                conta++;
            }
        }
        media = somma/conta;
        return media;
    }

    public void valoreCompreso (int max, int min){
        
        for (int i =0;i<temperature.length; i++){
            if (temperature[i]>=min && temperature[i]<=max){
                vettore[i] = vettore[i]+1;
            }
        }
    }
    public String scritturaValoreCompreso() {
        String output = "";
        for (int i = 0; i < vettore.length; i++) {
            output += String.format("%2d - %.2f\n", i + 1, vettore[i]);
        }
        return output;
    }

}
