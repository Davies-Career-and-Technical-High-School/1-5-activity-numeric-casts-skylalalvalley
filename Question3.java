import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two integers: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        System.out.println("The average is: " + (x*1.0 + y*1.0)/ 2 );

    }
}