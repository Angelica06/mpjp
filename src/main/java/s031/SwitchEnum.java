package s031;

public class SwitchEnum {

    public static void main(String[] args) {
        WeekendDay day = WeekendDay.SATURDAY;

        // enum tiene insieme costanti che stanno insieme.
        //classe.valore, la classe è il nome della classe dell' enum

        switch (day) { //con switch se tolgo una delle due opzione mi dava un errore
        case SATURDAY:
            System.out.println("No alarm clock today");
            break;
        case SUNDAY:
            System.out.println("Ready for a new week?");
            break;
        }
    }
}