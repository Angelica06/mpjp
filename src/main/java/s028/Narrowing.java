package s028;

public class Narrowing {
	public static void main(String[] args) {
		double d = 42;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;

		System.out.println(b);
		char c = (char) i; // prendimi l' intero 42 e convertimilo in carattere, 42 in carattere codice
							// ASCII è l' asterisco
		short s2 = (short) c;
		System.out.println(c + " " + s2); // mi stampa asterisco spazio 42, perchè c è un asterisco
		System.out.println((float) c);// se lo vedo come carattere, mi stampa l' asterisco se lo vedo come float me lo
										// stampa come float cioè 42.0
		char x = '*';
		int x2 = x; //posso fare anche la trasformaizone al contrario, cioè da char * a numero 42
		System.out.println("Ciao");
		System.out.println(x2);
		
		byte neg = -1;
		int neg2=neg;
		
		System.out.println(neg+","+neg2);// ha convertito correttamente, tenendo il segno di byte (nota che er + (-1))
		
	}
}
