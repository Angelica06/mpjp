package s021;

public class MoreStrings {
    public static void main(String[] args) {
        String s = new String("hello"); //creami un oggetto di tipo string, new è solo per tipo reference e gli dico di metterlo in regerence e come parametro gli dico cosa mettere nell' oggetto
        System.out.println(s);

        s = "Tom"; //creato la reference in s, allora da s non posso più accedere a hello di riga5 MA essendo stringa immutabile occupa comunque spazio ed è memoria occupata (garbage collector che però occupa risorse)
        System.out.println(s); 
        
        String t = "hello"; // è uguale a quello in riga 5, piu compatto
        System.out.println(t);
        
        String x = t; //creo variabile in stack e gli dico di mettere dentro il reference di t, quindi abbiamo un'altra variabile con lo stesso indirizzo
        System.out.println(x); //mi stampa anche qua hello
        
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
    }
}
