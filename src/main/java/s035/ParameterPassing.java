package s035;

import java.util.Objects;

public class ParameterPassing {
    static void primitive(int parameter) {
        parameter += 1;
        System.out.println("parameter is " + parameter);
    }

    static void immutableReference(String parameter) {
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: if parameter is null throws a NullPointerException
        Objects.requireNonNull(parameter, "Parameter should not be null");

        System.out.println("parameter id was " + System.identityHashCode(parameter));//mi ritorna il numero che rappresenta l' identità dell'oggetto
        parameter += " there";
        //ha fatto parameter=parameter+"there"
        //parameter=newString(parameter+"there")
        System.out.println("Now parameter id is " + System.identityHashCode(parameter));
        System.out.println("parameter value is " + parameter);
    }

    static void reference(StringBuilder parameter) {
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: if parameter is null throws a NullPointerException
        // Objects.requireNonNull(parameter, "Parameter should not be null");

        parameter.append(" there");
        System.out.println("parameter value is " + parameter);
    }

    static void reference(int[] data) {
        if (data == null || data.length == 0) {
            System.out.println("Nothing to do here");
            return;
        }

        data[0] += 1;
        System.out.println("data[0] is " + data[0]);
    }

    public static void main(String[] args) {
        int primitiveValue = 12;//abbiamo inizializzato la variabile primitiveValue di tipo intero assegnandogli il valore 12

        System.out.println("primitiveValue has been initialized to " + primitiveValue);//abbiamo richiamato il metodo println per stampare il suo valore
        primitive(primitiveValue);//cambia il valore della copia
        //il metodo primitive aveva come input un intero e gli aggiunge il vlaore uno (lo incrementa)
        //si lavora sulla copia
        System.out.println("primitiveValue is still " + primitiveValue);

        String string = "Hi";

        System.out.println("string has been initialized to " + string);
        immutableReference(string); //cambiato oggetto nello heap
        //richiamo il metodo immutableReference(String)
        //controlla che non sia stato richiamato un parametro nullo, se cosi fosse stato stampa "noting to do here" vedi riga 11
        System.out.println("string is still " + string);

        StringBuilder referenceValue = new StringBuilder("Hi");

        System.out.println("referenceValue has been initialized to " + referenceValue);
        reference(referenceValue); //stringbuilder ora la variabile è mutabile
        //non ha creato un nuovo oggetto, ho modificato il mio oggetto corrente
        System.out.println("referenceValue now is " + referenceValue);

        int[] array = { 42 }; //è un oggetto, quindi se modifico qualcosa dentro l' array, lo modifico dentro

        System.out.println("array[0] is " + array[0]);
        reference(array);
        System.out.println("array[0] now is " + array[0]);
    }
}
