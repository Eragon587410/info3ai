public class App {
    public static void checkAge(int age){
        if (age<18){
            System.out.println("accesso negato");
        }
    }
    public static void main(String[] args) throws Exception {
        checkAge(12);
        Age ciao = new Age();
        ciao.checkAge(12);
        App prova = new App();
     
    }
}
