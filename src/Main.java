import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initialized scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");

        // take input from scanner/user
        int input = scan.nextInt();

        //start of control statements (if odd print "odd number")
        if ((input % 2) != 0) {
            System.out.println("You have entered the Odd number " + input);
        //control statement and print for if even and less than 25
        } else if (input >= 2 && input <= 25) {
            System.out.println("Even and less than 25");
        //control statement for between 26 and 60 and even
        } else if (input >= 26 && input <= 60) {
            System.out.println("Even");
        //control statement for larger than 60
        } else if (input > 60) {
            System.out.println("You have entered an Even number " + input);
        //control statement for odd and over 60
        } else if (input > 60 && (input % 2 != 0) ) {
            System.out.println("You have entered an Odd number and over 60");
        }
    }
}

// saved for later to practice switch method
//        switch (input) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("");
//            case 4:
//                System.out.println(input);
//            case 5:
//                System.out.println("");
//                break;
//            default: