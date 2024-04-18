public class App {
    public static void main(String[] args) throws Exception {
        String [] game = {"g","a","4a","chi"};
        Giochi prova = new Giochi(4, game);
        System.out.println(prova);
        prova.aggiungiTitolo("L'ombra della Guerra");
        System.out.println(prova);
        prova.rimuoviGioco("chi");
        System.out.println(prova);
        System.out.println(prova.cercaTipo("om"));
        ;

    }
}
