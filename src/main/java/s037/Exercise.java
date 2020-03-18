package s037;

public class Exercise {
	final static int GAP = 'a' - 'A';

//final vuol dire che è una costante quindi che non cambierà
	// è un intero che è la differenza tra a piccolo e A grande
	public static void main(String[] args) {
		exercise("Bob"); // richiamo il metodo exercise a riga 90
		exercise("ciAo");

		System.out.println("toUpper(): " + toUpper("Bob"));
		System.out.println("toUpper2(): " + toUpper2("Bob"));
		System.out.println("toUpper3(): " + toUpper3("Bob"));
		System.out.println("toUpper4(): " + toUpper4("Bob"));

		System.out.println("ecncryptCaesar1(): " + encryptCaesar1("CIAO"));
		System.out.println("ecncryptCaesar1(): " + encryptCaesar1("ZOO"));

		System.out.println("ecncryptCaesar2(): " + encryptCaesar2("STUVWXYZA", 1));
		System.out.println("ecncryptCaesar2(): " + encryptCaesar2("STUVWXYZ", 1));
		System.out.println("ecncryptCaesar2(): " + encryptCaesar2("OPQRSTU", -1));
		System.out.println("ecncryptCaesar2(): " + encryptCaesar2("WXYYYYZ", -1));
	}

	/**
	 * (commento - descrizione del metodo) Algrotimo di Cesare (+1 version)
	 * 
	 * CIAO DLBP
	 * 
	 * ZOO APP
	 * 
	 * @param s an uppercase-only string //dice che s è una stringa solo uppercase
	 * @return encrypted version of the input string//cosa restituisce? valore attes
	 */

	public static String encryptCaesar1(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder sb = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'A' && cur < 'Z') {
				sb.append((char) (cur + 1)); // alternativa: sb.append(++cur)
				// il ++ incrementa cioè se era A diventa B direttamente
				// se metto current++ mi passa current e poi lo converte
				// invece a me serve incrementarlo prima di passarlo come variabile
			} else {
				sb.append((char) (cur - 25)); // sb.append('A'); è con apici singoli perchè è un carattere non una
												// stringa
			}
		}
		return sb.toString();
	}

	/**
	 * (commento - descrizione del metodo) Algrotimo di Cesare (+1 version)
	 * 
	 * shift = 1 CIAO -> DLBP ZOO -> APP
	 * 
	 * shift = -1 DLBP -> CIAO APP -> ZOO
	 * 
	 * @param s        an uppercase-only string //dice che s è una stringa solo
	 *                 uppercase
	 * @param shifting gap
	 * @return encrypted version of the input string//cosa restituisce? valore attes
	 */
	public static String encryptCaesar2(String s, int shift) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		
		StringBuilder sb = new StringBuilder(s.length());
	
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'A' && cur <= 'Z') {
				int delta = (cur - 'A' + shift) % 26;
				if (delta < 0) {
					delta += 26;
				}
				sb.append((char) ('A' + delta));
			}
		}
		return sb.toString();
	}

	public static String toUpper(String s) {
		if (s == null || s.isEmpty()) { // || vuol dire OR, prima delle due linee se è vera non valuto la frase dopo le
										// righe
			return s;
		}

		StringBuilder sb = new StringBuilder(s.length()); // s.length crea i posti, riserva lo spazio, posso anche non
															// metterlo e lasciare le parentesi vuote. ci metterà però
															// piu tempo per girare

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				sb.append((char) (cur - GAP));
			} else {
				sb.append(cur);// con append aggiungo a s. ma non allungo s, cioè s.length è uguale
			}
		}

		return sb.toString();
	}

	public static String toUpper2(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				sb.setCharAt(i, (char) (cur - GAP));
			}
		}

		return sb.toString();
	}

	public static String toUpper3(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder sb = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				sb.insert(i, (char) (cur - GAP));
			} else {
				sb.insert(i, cur);
			}
		}

		return sb.toString();
	}

	public static String toUpper4(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				String x = Character.toString((char) (cur - GAP));
				sb.replace(i, i + 1, x);
			}
		}

		return sb.toString();
	}

	public static void exercise(String sample) {
		if (sample == null || sample.isEmpty()) {
			return;
		}

		System.out.println(sample + " to uppercase and lowercase");
		for (int i = 0; i < sample.length(); i++) {// scope inizia qua efinisce alla graffa successiva
			char cur = sample.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				System.out.print((char) (cur - GAP)); // print al posto di println, mi stampa sempre sulla stessa riga,
														// NON VA A CAPO
			} else {
				System.out.print(cur);
			}
		}

		System.out.print(", ");

		for (int i = 0; i < sample.length(); i++) {
			char cur = sample.charAt(i);
			if (cur >= 'A' && cur <= 'Z') {
				System.out.print((char) (cur + GAP));
			} else {
				System.out.print(cur);
			}
		}

		System.out.println();
	}
}
