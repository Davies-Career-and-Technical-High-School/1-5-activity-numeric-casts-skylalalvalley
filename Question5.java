import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a decimal number: ");
        double num = scan.nextDouble();
        double x = (num * 10) % 10 ;
        double y = (num * 100) % 10;
        System.out.println("Answer: " + (int)x + " " + (int)y);
        

    }
}