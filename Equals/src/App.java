public class App {
    public static void main(String[] args) throws Exception {
        
        String s = "ciao"; //String = classe // non tipo elementare/primitivo come int
        String c = "cavolo"; //Quindi == funziona con elementari, ma no con classi(con classi solo indirizzo)
 
        /* 
        if (s==c){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
             == confronta indirizzo (java mette stringhe con stesso testo su stesso indirizzo)
            ERRORE SEMANTICO!!!!!

            al posto di == usare metodo .equals (s.equals(s1))
        */        

        // equals = implementazione confronto tra due oggetti (indirizzo, tipo, contenuto)

        // Dichiarazione oggetto di tipo Atleta
        
        Atleta daniel = new Atleta("Daniel","Basket",20.6);
        System.out.println(daniel);

        Atleta pietro = new Atleta("Pietro","Motocross",17.5);
        System.out.println(pietro);
        
        //if == da che sono diversi pk indirizzi diversi
        //if equals sono diversi perchè hanno indirizzi diversi, non abbiamo ancora riscritto il metodo per adattarlo alla nostra classe
        Atleta cloneDanielAtleta = daniel;
        if (daniel.equals(cloneDanielAtleta)){
            System.out.println("uguali");
        } else {
            System.out.println("diversi");
        }
    }
}
