public class Barca {
    private String nome;
    private String nazionalità;
    private double lunghezza;
    private double stazza;
    private String tipologia;

    public Barca(){
        lunghezza = 0;
        stazza = 0;
    }

    public Barca(String nome, String nazionalità, double lunghezza, double stazza, String tipologia){
        this();
        setNome(nome);
        setNazionalità(nazionalità);
        setLunghezza(lunghezza);
        setStazza(stazza);
        setTipologia(tipologia);
    }

    public Barca(Barca other){
        this(other != null ? other.nome : null, 
            other != null ? other.nazionalità : null, 
            other != null ? other.lunghezza : 0, 
            other != null ? other.stazza : 0, 
            other != null ? other.tipologia : null);
    }

    public void setNome(String nome){
        if (nome != null){
            this.nome = new String(nome);
        } else {
            this.nome = null;
        }
    }

    public void setNazionalità(String naz){
        if (naz != null){
            nazionalità = new String(naz);
        } else {
            nazionalità = null;
        }
    }

    public void setLunghezza(double len){
        if (len > 0){
            lunghezza = len;
        }
    }

    public void setStazza(double stazza){
        if (stazza > 0){
            this.stazza = stazza;
        }
    }

    public void setTipologia(String tipo){
        if (tipo != null){
            tipologia = new String(tipo);
        } else {
            tipologia = null;
        }
    }

    public String getNome(){
        String out = null;
        if (nome != null){
            out = new String(nome);
        }
        return out;
    }

    public String getNazionalità(){
        String out = null;
        if (nazionalità != null){
            out = new String(nazionalità);
        } 
        return out;
    }

    public double getLunghezza(){
        return lunghezza;
    }

    public double getStazza(){
        return stazza;
    }

    public String getTipologia(){
        String out = null;
        if (tipologia != null){
            out = new String(tipologia);
        }
        return out;
    }

    public boolean equals(Barca other){
        boolean out = false;
        if (this != other){
            if (other instanceof Barca && getLunghezza() == other.getLunghezza() && getStazza() == other.getStazza()){
                if (getNome() == other.getNome() || getNome() != null && other.getNome() != null && getNome().equals(other.getNome())){
                    if (getNazionalità() == other.getNazionalità() || getNazionalità() != null && other.getNazionalità() != null && getNazionalità().equals(other.getNazionalità())){
                        if (getTipologia() == other.getTipologia() || getTipologia() != null && other.getTipologia() != null && getTipologia().equals(other.getTipologia())){
                            out = true;
                        }
                    }
                }
            }
        } else {
            out = true;
        }
        return out;
    }

    public String toString(){
        String out = "Nome: " + nome + ", Nazionalità: " + nazionalità + ", Lunghezza: " + lunghezza + ", Stazza: " + stazza + ", Tipologia: " + tipologia;
        return out;
    }
}
