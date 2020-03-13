package s027;

public class Concatenation {
    public static void main(String[] args) {
    	System.out.println(5+7);
    	System.out.println("5"+"2");
    	System.out.println("5"+7); //se uno è intero e uno è stringa, la nn stringa lo converte in intero. lo forza. NON da errore
    	
        System.out.println("Resistence" + " is " + "useless");
        System.out.println("Solution: " + 42);
        System.out.println(true + " or " + false);

        System.out.println("Vogons".repeat(3)); // solo da Java 11, mi moltiplica la stringa
        
    }
}
