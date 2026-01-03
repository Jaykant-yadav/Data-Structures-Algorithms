import java.util.Scanner;

public class Functions {
    // Function := it is a block of code to perform some specific task after calling
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    // Calculate Sum
    public static int calculateSum(int a, int b){
        return a + b;
    }

    // Call by value
    public static void swap(int a, int b){
        // Swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Product of a * b
    public static void product(int a, int b){
        System.out.println("a * b = " + a*b);
    }

    // Factorial of a number, n
    public static int factNum(int n){
        int fac = 1;
        for(int i=1; i<=n; i++){
            fac = fac * i;
        }

        return fac;
    }

    // binomial coefficient
    public static int binoCoeff(int n, int r){
        int n_fact = factNum(n);
        int r_fact = factNum(r);
        int nmr_fact = factNum(n-r);
        int binoCoeff = n_fact / (r_fact * nmr_fact);
        return binoCoeff;
    }

    // Function overloading
    // fun. to cal 2 num
    public static int sum(int a, int b){
        return a+b;
    }

    // fun. to cal 3 num
    public static float sum(int a, int b, int c){
        return a+b+c;
    }

    // Prime Number or not
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    // Print Prime number into range
    public static void printPrimeNumber(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    // Binary To Decimal
    public static void binToDec(int binNum){
        int decNum = 0;
        int pow = 0;

        int binNums = binNum;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (int) (lastDigit * Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + binNums + " is : " + decNum);
    }


    // Decimal To Binary
    public static void decToBin(int decNum){
        int binNum = 0;
        int pow = 0;
        int myNum = decNum;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }

        System.out.println("Binary of " + myNum + " is : " + binNum);
    }

    public static void main(String[] args) {
        // printHelloWorld();
        /* int sum = calculateSum(4, 6);
        System.out.println(sum); */

        // Swap - Value Exchange
        /* int a = 5;
        int b = 10;
        swap(a, b);
        
        System.out.println("a = " + a);
        System.out.println("b = " + b); */

        Scanner scn = new Scanner(System.in);
        /* int a = scn.nextInt();
        int b = scn.nextInt();
        product(a, b); */

        // int n = scn.nextInt();
        // int r = scn.nextInt();
        // factNum(n);
        // System.out.println(binoCoeff(n, r));
        /* System.out.println(sum(5, 3));
        System.out.println(sum(5, 2, 1)); */

        int n = scn.nextInt();
        /* if(isPrime(n) == true){
            System.out.println("True");
        }else{
            System.out.println("False");
        } */

        // printPrimeNumber(n);
        
        // binToDec(n);

        decToBin(n);

    }
}
