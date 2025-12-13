import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*
         * int age = scn.nextInt();
         * if (age >= 18) {
         * System.out.println("Adult : " + age);
         * } else if (age > 13 && age < 18) {
         * System.out.println("Teenager : " + age);
         * } else {
         * System.out.println("Not Adult : " + age);
         * }
         */

        // Print the Largest of 2
        /*
         * int A = scn.nextInt();
         * int B = scn.nextInt();
         * if (A >= B) {
         * System.out.println("A is largest of 2");
         * } else {
         * System.out.println("B is largest of 2");
         * }
         */

        // Print if a Number is Odd or Even
        /*
         * int num = scn.nextInt();
         * if(num % 2 == 0){
         * System.out.println("Even");
         * }else{
         * System.out.println("Odd");
         * }
         */

        // Income Tax Calculator
        /*
         * System.out.print("Enter a Income : ");
         * int income = scn.nextInt();
         * int tax;
         * if (income < 500000) {
         * tax = 0;
         * } else if (income >= 500000 && income < 1000000) {
         * tax = (int) (income * 0.2);
         * } else {
         * tax = (int) (income * 0.3);
         * }
         * 
         * System.out.println("Your tax is : " + tax);
         */

        // Print the largest of 3
        /*
         * int A = 1;
         * int B = 3;
         * int C = 6;
         * if (A >= B && A >= C) {
         * System.out.println(A);
         * } else if (B >= C) {
         * System.out.println(B);
         * } else {
         * System.out.println(C);
         * }
         */

        // Ternary Operator
        int nums = 10;
        String type = (nums % 2 == 0) ? "Even" : "Odd";
        // System.out.println(type);

        /*
         * int marks = scn.nextInt();
         * String RC = (marks >= 33) ? "Pass" : "Fail";
         * System.out.println(RC);
         */

        // Switch Statement
        /*
         * int number = 2;
         * switch (number) {
         * case 1:
         * System.out.println("Samosa");
         * break;
         * case 2:
         * System.out.println("Burger");
         * break;
         * case 3:
         * System.out.println("Mango Shake");
         * break;
         * default:
         * System.out.println("We wake up");
         * }
         */

        // Calculator
        int a = scn.nextInt();
        char op = scn.next().charAt(0);
        int b = scn.nextInt();

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("none of operator Exits");
        }
    }
}
