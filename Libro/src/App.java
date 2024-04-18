public class App {
    public static void main(String[] args) throws Exception {

        Libro prova = new Libro("Le due torri", "Tolkien",592);
        Libro prova4 = new Libro("La compagnia dell'anello", "Tolkien",566);
       

        Libro prova2 = new Libro(prova);

        System.out.println(prova.getTitolo()+": "+prova.prezzo());
        Libro.setCostoPagina(20);
        System.out.println(prova.getTitolo()+": "+prova.prezzo());
        Mensola prova3 = new Mensola();
        prova3.setVolume(prova, 0);
        prova3.setVolume(prova, 3);
        prova3.setVolume(prova4, 5);
        System.out.println(prova3);
        System.out.println(prova3.volumeXParolaInTitolo("Le due toRRI"));
        System.out.println(prova3.contaVocali(0));
        prova3.scambioPosizioneLibri(3, 5);
        System.out.println(prova3);
        Mensola prova44 = new Mensola(prova3, prova3);
        System.out.println(prova44);
        

    }
}
