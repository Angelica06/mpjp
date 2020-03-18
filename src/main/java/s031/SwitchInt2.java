package s031;

public class SwitchInt2 {
	public static void main(String[] args) {
		int value = 42;

		// ...

		// voglio che mi stampi pari se è pari e dispari se dispari
		if (value % 2 == 0) {
			System.out.println("è pari");
		} else {
			System.out.println("è dispari");
		}

		switch (value) {
		case 1:
		case 3:
		case 5:
			System.out.println("value is one");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("value is two");
			break;
		default:
			System.out.println("value is neither one nor two");
			break;
		}
	}
}
