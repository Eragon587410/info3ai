public class Quadrato {
    private double lato;
    //costruttore default
    public Quadrato(){};
    //costruttore master
    public Quadrato(double lato){
        setLato(lato);
    }
    public double getLato(){
        return lato;
    }
    public void setLato(double lato){
        if (lato<0){
            System.out.println("il lato non può essere negativo");
            return; //al posto di usare: else{this.lato = lato} abbiamo usato return, che blocca tutto
        }
        this.lato = lato;
    }
    public String toString(){
        return "Il quadrato di lato è "+ lato;
    }
    public double area(){
        return lato*lato;
    
    }
    public double perimetro(){
        return lato*4;
    }
}
