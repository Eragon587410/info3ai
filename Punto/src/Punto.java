public class Punto {
    
    private double x;
    private double y;

    public Punto(){}

    public Punto(double x, double y){
        setX(x);
        setY(y);
    }

    public Punto(Punto p){
        this(p.x,p.y);
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distanza(Punto p){
        double dist = 0;
        dist = Math.sqrt(Math.pow((x-p.x),2)+Math.pow((y-p.y),2));
        return dist;
    }

    public boolean equals(Punto p){
        boolean out = false;
        if (x==p.x && y==p.y){
            out = true;
        }
        return out;
    }

    public String toString(){
        String s = "x: "+x+"\ny: "+y+"\n";
        return s;
    }

}
