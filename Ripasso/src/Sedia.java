public class Sedia { //classe sedia figlia classe Object = eredita alcuni metodi

    private String colore; //attributi di classe
    private double altezza;

    public Sedia(){} //il costruttore di default ci permette di inizializzare gli attributi di classe ad un valore predefinito 

    public Sedia(String colore, double altezza){
        setColore(colore);
        setAltezza(altezza);
    }

    public String toString(){
        String s = String.format("colore: %s; altezza %.2f", colore, altezza); //%s per stringa
        return s;
    }

    public void setColore(String variabile){
        colore = variabile;
    }

    public void setAltezza(double variabile){
        altezza = variabile;
    }

    public double getAltezza(){
        return altezza;
    }

    public String getColore(){
        return colore;
    }
}
