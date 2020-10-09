import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a decimal number: ");
        double x = scan.nextDouble();
        double y = (x + 0.5);
        System.out.println("Answer: " + (int)y );

    }
}