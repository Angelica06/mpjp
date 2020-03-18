package s037;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));
       //metodo charat mi restituisce il carattere alla posizione che passa per parametro
        System.out.println("s < t: " + s.compareTo(t)); //tra h e w ci sono 15 caratteri
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));
        //contains chiede. t contiene u?, cioè t=world contiene u?
        String u2 = t.substring(1, 3);
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3));

        System.out.println("u equals u2? " + u.equals(u2)); //mettere a confronto il contenuto
        System.out.println("u == u2? " + (u == u2)); //compara gli indirizzi, u e u2 sono lo stesso oggetto?

        System.out.println("First index of 'o' is s: " + t.indexOf('l'));
        System.out.println("Last index of 'e' is s: " + s.lastIndexOf('l'));//indice dell'ultima lettera della stringa
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));//se faccio passare una lettera che non cè, restituisce -1 perchè non cè l' indice -1 e quindi dice che nn cè
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty()); //applico direttamente il metodo isEmpty sulla stringa appena creata, che è vuota

        System.out.println("s length: " + s.length());

        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);
//fa replace all tutte le l le scambia con q
        String[] splits = "one for me, one for you".split(" ");
        System.out.println("Splitting: ");
        for (String token : splits) { //equivale a for toke in split di python
            System.out.println(token);
        }
        String joined = String.join(" ", splits);
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase());
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]");//elimina spazi solo all' inizio e alla fine, quelli in mezzo no

        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
        //valueOf mi stampa anche se è vuota, anche se ha null e quindi non è una vera stringa. mi stampa infatti null
    }
}
