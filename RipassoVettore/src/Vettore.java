public class Vettore {
    
    private double rainfall [] = new double [12];

    public Vettore(){}

    public Vettore(double vet []){
        // rainfall = vet;  shallow copy = copia superficiale (se assegnamo ad un vettore un altro vettore, i vettori avranno lo stesso indirizzo e saranno suscettibili alle stesse modifiche)
        for (int i = 0; i<rainfall.length;i++){
            rainfall[i]=vet[i];
        }
    }

    public String toString(){
        String s = "";
        for (int i = 0; i< rainfall.length; i++){
            s+=String.format("%2d %6.2f\n",i+1, rainfall[i]);
        }
        return s;
    }

    public double somma(){
        double s=0;

        for (int i = 0; i < rainfall.length; i++){
            s+= rainfall[i];
        }
        return s;
    }

    public double mediaMesiEstivi(){
        double s=0;

        for (int i = 5; i < 8; i++){
            s+= rainfall[i];
        }
        return s/3;
    }

    public double media(){
        return somma()/12;
    }

    public double max(){
        double s = rainfall[0];

        for (int i = 1; i < rainfall.length; i++){
            if (rainfall[i] > s){
                s = rainfall[i];
            }
        }

        return s;
    }

    public double min(){
        double s = rainfall[0];

        for (int i = 1; i < rainfall.length; i++){
            if (rainfall[i] < s){
                s = rainfall[i];
            }
        }

        return s;
    }

    public double mediaMesiEstivi(){
        double s;
        int contatore = 0;

        for (int i = 0; i < rainfall.length; i++){
            s = 10;
        }
        s = 5;
        return s;
    }
}
