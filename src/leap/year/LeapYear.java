package leap.year;

/**
 * @author: Veysel Dogan 
 * Date: 06-Aug-2018
 * Console Application: Leap Year
 * Main Class
 */
public class LeapYear {

    public static void main(String[] args) {
        int month = 2;
        int years = 2016;
        int day = 31;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if (((years % 4 == 0) || (years % 100 == 0) || (years % 400 == 0))) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            default:
                System.out.println("Wrong Chose");
                break;
        }

        System.out.println("Days- " + day);

    }

}
