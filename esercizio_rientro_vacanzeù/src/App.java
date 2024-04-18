public class App {
    public static void main(String[] args) throws Exception {
        double v[];
        double[] v1;

        v = new double[10];
        int n = 10;
        v1 = new double[n];
        System.out.println(v1.length);
        v1[0] = 3.1;
        v1[1] = 16.5;
        for(int i = 0; i<v1.length;i++){
            System.out.printf("%2d = %6.2f "+ System.lineSeparator(),i,v1[i]);
        }
    }
}
