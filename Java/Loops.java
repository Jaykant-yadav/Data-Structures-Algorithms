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
        /* int n = 15542;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }

        System.out.println(rev); */

        // Do while loop
        /* int count = 1;
        do{
            System.out.println("Hey Guru Ji");
            count++;
        }while(count <= 5); */

         Scanner scn = new Scanner(System.in);
        /* do{
            System.out.print("Enter your number : ");
            int num = scn.nextInt();
            if(num % 5 == 0) {
                break;
            }
            System.out.println(num);
        }while(true); */

        // Continue Statement
        /* for(int i=1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        } */


        /* do{
            System.out.println("Enter your Number : ");
            int n = scn.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println("number was : " + n);
        }while(true); */

        // Prime Number
        System.out.print("Enter Number : ");
        int n = scn.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime NUmber");
        }

    }
}
