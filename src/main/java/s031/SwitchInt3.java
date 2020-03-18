package s031;

public class SwitchInt3 {
	public static void main(String[] args) {
		int value = 6;

		// ...
		if (value%2!=0 & value<7) {
			System.out.println("value is odd and small");
		}
		else if (value%2==0 & value <7) {
			System.out.println("value is even and small");
		}
		else {
			System.out.println("value is something else");
		}
		
		/*switch (value) {
		case 1:
		case 3:
		case 5:
			System.out.println("value is odd and small");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("value is even and small");
			break;
		default:
			System.out.println("value is something else");
			break;
			
		}*/
	}
}
