public class App {
    public static void main(String[] args) throws Exception {
        //persona = nome classe, indirizzo oggetto persona nella classe persona
        Persona cavolo = new Persona();
        // System.out.println(cavolo.nome); solo se public nome è età
        System.out.println(cavolo);
        System.out.println(cavolo.getEtà());
        System.out.println(cavolo.getNome());

        cavolo.setNome("Marconi");
        System.out.println(cavolo);
        cavolo.setEtà(23);
        System.out.println(cavolo);

        Persona cavolo2 = new Persona();
        System.out.println(cavolo2);


        Sedia s = new Sedia("gialla");
        System.out.println(s);
        Sedia s1 = new Sedia();
        System.out.println(s1);

        Quadrato ciao = new Quadrato();
        ciao.setLato(3);
        System.out.println(ciao);
        Quadrato ciao2 = new Quadrato(4);
        System.out.println(ciao2);
        System.out.println("area = "+ ciao.area());

        Triangolo trin = new Triangolo(10,10,10);
        trin.setLato1(20);
       System.out.println( trin.getLato1());;
        System.out.println(trin);
        
    }
}
