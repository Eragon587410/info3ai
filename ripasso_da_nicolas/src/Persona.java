public class Persona {
    private String nome = "mario";
    private int età = 23;
    private String coloreOcchi = "marroni";

    //costruttore default
    public Persona(){};
    //costruttore master


    public Persona (String nome, int età){
        this.nome = nome;
        this.età = età;
    }

    public String getNome(){ //camel case
        return nome;
    }
    public int getEtà(){ //camel case
        return età;
    
    }
    public void setNome(String nome){
        this.nome = nome;
        
    }
    public void setEtà(int età){
        this.età = età;
    }
    //metodo che sostituisce l'output ( si chiamano metodi)
    public String toString(){
        return "nome: "+nome+";"+" età: "+età;
    }
}
