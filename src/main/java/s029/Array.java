package s029;
/* Array è un insieme di valori
 * creo l' array e devo dire anche la dimensione
 * tipo[] array= new tipo[lunghezza]
 * in automatico viene inizializzato mettendo in ogni cella quello che sembr apiu sensato, cioè uno 0, un False o un null 
*/

public class Array {
    public static void main(String[] args) {
        int[] array = new int[12];//new creo l' array e con int[12] dico che è lungo 12
        array[0] = 7; //in questo comando invece gli diciamo di mettre il numero 7

        System.out.println(array[0] + ", " + array[11]);

        int value = array[5]; //prendo l' elemento che c'è nela posizione 5 (cioe sesto elemento dato che inizia da 0, e lo metto in value
        System.out.println(value); //mi stampa lo zero perchè è  stato inizializzato così
        
        System.out.println(array);// [ vuol dire che hai provato a stampare un array, I che è un aray di interi,in genere non hanno pensato a come pensare l' array in maniera piu sensata
//se voglio stamparlo devo usare una classe definita in java utile, che converte l' array in una stringa
        // value = array[12]; // exception
        
      
    }
}
