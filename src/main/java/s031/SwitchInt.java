package s031;

public class SwitchInt {
    public static void main(String[] args) {
        int value = 2;

        // ...

        switch (value) {//saltami all' etichetta che da il valore indicato in value, e vai avanti finche non trovi break 
        case 1:
            System.out.println("value is one");
            break; //senza break > fall thorough, cade finche non trova il break
        case 2:
            System.out.println("value is two");
            break;
        default:
            System.out.println("value is neither one nor two");
            break;
        }
    }
}
