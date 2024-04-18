public class App {
    public static void main(String[] args) throws Exception {
        
        double temperature [] = {10.0, 12.0, 13.0, 14.0, 15.0, 16.0, 76.0, 76.0, 34.0, 13.0, 19.0, 11.0};

        Soluzione vettore = new Soluzione(temperature);

        System.out.println(vettore.sommaEstiveEsercizio1());
        
        System.out.println(vettore.minEsercizio2());
        System.out.println(vettore.maxEsercizio2());

        System.out.println(vettore.valorePresenzeEsercizio3(76));
        System.out.println(vettore.valorePresenzeEsercizio3(100));

        System.out.println(vettore.mediaDispariEsercizio4());

        vettore.valoreCompreso(50, 10);
        System.out.println(vettore.scritturaValoreCompreso());



    }
}
