package s034;

public class MethodCaller {
    public static void main(String[] args) {
        System.out.println(Simple.h());// è un metodo statico, quindin posso chiamarlo tranquillamente
        //posso anche usarla senza reference perchè è static
        Simple reference = new Simple(); //dentro la variabile reference ho un oggetto nuovo
        // i metodi f e g posso richiamarli solo se richiamo l' oggetto, cioè con reference
        //nella riga precedente (7) ho creato un reference
        int result = reference.f(7, 6); //dichiaro la variabile di tipo intero, dentro questa variabile metto uso l' oggetto reference
        System.out.println(result);  // .f è il metdo nella classe simple, vedi riga 8
        
//        System.out.println(Simple.f(7, 6)); se 
        reference.g(true);
        reference.g(false);
        //prendo il metodo g nell' oggetto reference
    }
}
