package s030;

public class If {
    public static void main(String[] args) {
        
        if (args.length==1) { //è uguale a scrivere condition==true
            System.out.println("Hello "+ args[0]+"!");
        } else { //questa graffa non deve essere per forza scritta
        	System.out.println("Hello");
        }
        	System.out.println("always printed");
        
    }
}
