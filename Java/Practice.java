import java.util.Scanner;

public class Practice {
    // Avarage of 3 Numbers
    public static void AvgThreeNum(int A, int B, int C) {
        double avg = (A + B + C) / 3;
        System.out.println("Avg of : " + A + ", " + B + ", " + C + " : " + avg);
    }

    // Area of the Square
    public static void areaOfSquare(float side) {
        double areaOfSqu = side * side;
        System.out.println("area of square : " + areaOfSqu);
    }

    // 3 items and on add 18% gst
    public static void addGst(float pencil, float pen, float eraser) {
        float totalPrice = pencil + pen + eraser;
        double addOnGst = totalPrice * 1.18;
        System.out.println("total Price: " + totalPrice + " and 18% gst : " + addOnGst);
    }

    // get positive or negative
    public static void getPosAndNeg(int nums) {
        if (nums > 0) {
            System.out.println("Positive");
        } else if (nums < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    // Get number wise day name
    public static void getDay(int DayNum) {
        switch (DayNum) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Frieday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong Number");
        }
    }

    // takes a year and print leap year or not
    public static void getLeapYear(int year) {
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    // Check prime number
    public static boolean primeNumber(int nums) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(nums); i++) {
            if (nums % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;

        // System.out.println(isPrime == true ? "prime" : "Not Prime");
    }

    public static void rangeBasePrime(int nums){
        for(int i=2; i<=nums; i++){
            if(primeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
         * int A = scn.nextInt();
         * int B = scn.nextInt();
         * int C = scn.nextInt();
         * 
         * AvgThreeNum(A, B, C);
         */

        /*
         * System.out.print("Enter side : ");
         * float side = scn.nextFloat();
         * areaOfSquare(side);
         */

        /*
         * System.out.print("Enter prices : ");
         * int pencil = scn.nextInt();
         * int pen = scn.nextInt();
         * int eraser = scn.nextInt();
         * addGst(pencil, pen, eraser);
         */

        /*
         * byte b = 4;
         * char c = 'a';
         * short s = 512;
         * int i = 1000;
         * float f = 3.14f;
         * double d = 99.9954;
         * double result = (f * b) + (i % c) - (d * s);
         */
        // System.out.println(result);

        int $ = 24;

        /*
         * int x = 2, y = 5;
         * 
         * int exp1 = (x * y / x);
         * int exp2 = (x * (y / x));
         * 
         * System.out.print(exp1 + " , ");
         * System.out.print(exp2);
         */

        /*
         * int x = 200, y = 50, z = 100;
         * if(x > y && y > z){
         * System.out.println("Hello");
         * }
         * 
         * if(z > y && z < x){
         * System.out.println("Java");
         * }
         * 
         * if((y+200) < x && (y+150) < z){
         * System.out.println("Hello Java");
         * }
         */

        /*
         * int x, y, z;
         * x = y = z = 2;
         * x += y;
         * y -= z;
         * z /= (x + y);
         * System.out.println(x + " " + y + " " + z);
         */

        /*
         * int x = 9, y = 12, a = 2, b = 4, c = 6;
         * int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
         * System.out.println(exp);
         */

        /*
         * int x = 10, y = 5;
         * int exp1 = (y * (x / y + x / y));
         * int exp2 = (y * x / y + y * x / y);
         * 
         * System.out.println(exp1);
         * System.out.println(exp2);
         */

        /*
         * int nums = scn.nextInt();
         * getPosAndNeg(nums);
         */

        /*
         * int DayNum = scn.nextInt();
         * getDay(DayNum);
         */

        /*
         * int year = 2004;
         * getLeapYear(year);
         */

        rangeBasePrime(20);

        scn.close();
    }
}
