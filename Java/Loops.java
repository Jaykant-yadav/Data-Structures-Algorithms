import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* int i=0; 
        while (i < 10) {
            System.out.print("Hello Ji" + " ");
            i++;
        } */


        // Print Number from 1 to 10
        /* int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        } */

        // Print Number from 1 to n
        /* int count = 1;
        int range = sc.nextInt();
        while (count <= range) {
            System.out.print(count + " ");
            count++;
        } */

        // Print sum of first n natural numbers
        /* int count = 1;
        int sum = 0;
        int range = sc.nextInt();
        while (count <= range) {
            sum += count;
            count++;
        }

        System.out.println("sum of Natural Number : " + sum); */

        // Print Square Star Pattern
        /* for(int i=0; i<4; i++){
            System.out.println("* * * *");
        } */

        // Print Reverse of a Number
        /* int n = 2546;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        } */


        // Reverse the Given NUmber
        int n = 15542;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }

        System.out.println(rev);

    }
}
