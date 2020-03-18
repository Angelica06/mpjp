package s038;

public class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();//creami uno stringBuilder
        StringBuilder sb2 = new StringBuilder(20); //crea uno StringBuilder con 20 caratteri
        StringBuilder sb3 = new StringBuilder("hello"); //crea uno StringBuilder a partire da questa stringa Hello
        
        System.out.println("capacity 1: " + sb.capacity());//mi dice capacità corrente dello stringbuilder, anche se poi lo posssiamo modificare
        System.out.println("capacity 2: " + sb2.capacity());
        System.out.println("capacity 3: " + sb3.capacity());
        
        System.out.println("appending: " + sb3.append(' ').append("world"));//appendo alla stringa, caratteri o stringhe. Mi ritorna uno stringbuilder con stesso indirizzo di heap
        
        System.out.println("char at position 1 in sb3 is '" + sb3.charAt(1) + "'");
        
        System.out.println("deleting: " + sb3.delete(5, 10).deleteCharAt(2));//elimina caratter dalla posizione 5 alla 10 e poi anche il carattera alla posizione 2
        //gli insieme in java sono all' inizio chiuso e alla fine aperto quindi 5 compreso e 10 escluso
        System.out.println("index of \"elo\": " + sb3.indexOf("elo"));
        
        System.out.println("inserting \"lo c\" at 3: " + sb3.insert(3, "lo c"));
        
        System.out.println("current sb3 length: " + sb3.length());
        
        System.out.println("replace section 2-7 with \"r r\": " + sb3.replace(2, 7, "r r"));
        
        System.out.println("reversing: " + sb3.reverse());
        
        sb3.setCharAt(5, 'a');
        System.out.println("setCharAt: " + sb3);
        
        sb3.setLength(3);
        System.out.println("setLength: " + sb3);
    }
}
