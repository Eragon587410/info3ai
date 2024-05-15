public class Atleta {
    String sport;
    String nome;
    double altezza;
  

    public Atleta(){}

    public Atleta (String nome, String sport, double altezza){
        this.nome = nome;
        this.sport = sport;
        this.altezza = altezza;
    }
    //fanculo
    public String getNome(){
        return nome;
    }

    public String getSport(){
        return sport;
    }
    public double getAltezza(){
        return altezza;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSport(String sport){
        this.sport = sport;
    }
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    @Override
    public String toString(){
        return this.nome + " " + this.sport+ " "+this.altezza;
    }
    public boolean equals(Atleta a){
        boolean risultato = false;
        if (this == a){  //vediamo se indirizzo di memoria è uguale
            risultato = true;
        }
        else if (a instanceof Atleta){ //confronto tipo
            //controllo stesso contenuto
            risultato = (this.nome.equals(a.nome) && this.sport.equals(a.sport) && this.altezza == a.altezza);
        }

        return risultato;
    }


}
