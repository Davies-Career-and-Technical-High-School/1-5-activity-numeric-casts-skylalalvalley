import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two digit number: ");
        int x = scan.nextInt();
        System.out.println("Here are your 2 digits: ");
        System.out.println(x / 10);
        System.out.println(x % 10);


    }
}