public class App {
    public static void main(String[] args) throws Exception {

        Sedia oggettoEsempio;  // solo dichiarazione dell'oggetto appartenente alla classe sedia
        oggettoEsempio = null; // assegnazione ( istanziazione variabile a null = vuoto/nulla)
        oggettoEsempio = new Sedia(); // assegnare / istanziare / creare  oggetto = Classe + indirizzo casella
        
        System.out.println(oggettoEsempio.toString()); //se ci sono parentesi tonde vogliamo richiamate metodo, toString è uguale a scrivere solo il nome dellì'oggetto

        //System.out.println(oggettoEsempio.colore); //se sono attributi non servono le ()

        oggettoEsempio.setColore("rosso");
        oggettoEsempio.setAltezza(10.4);

        System.out.println(oggettoEsempio);

        System.out.println(oggettoEsempio.getAltezza());
        System.out.println(oggettoEsempio.getColore());

        Sedia oggettoEsempio2 = new Sedia();
        Sedia oggettoEsempio3 = new Sedia();

        System.out.println(oggettoEsempio2);
        System.out.println(oggettoEsempio3); //grazie al costruttore master hanno tutti e tre gli stessi valori agli stessi attributi (in questo caso null e 0,00)

        Sedia sediaBrutta = new Sedia("marrone", 5); //grazie al costruttore master possiamo creare oggetti con valori diversificati direttamente dalla dichiarazione
        System.out.println(sediaBrutta);
    }
}
