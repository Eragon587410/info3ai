import java.util.ArrayList;;
public class App {
    public static void main(String[] args) throws Exception {
        Barca prov2a = new Barca("Caciarona", "Israeliana", 12, 100, "Terroristi");
        Porto porto = new Porto();
        porto.addBarca(prov2a);
        System.out.println(porto);
        
    }
}
