import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three digit number: ");
        int x = scan.nextInt();
        System.out.println(x / 100);
        System.out.println((x % 100) / 10);
        System.out.println( x % 10);


    }
}