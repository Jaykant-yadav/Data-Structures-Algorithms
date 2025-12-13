import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        // datatype = type of value
        // Java datatypes are mainly 2 types:
        /* 
        - Primitive -> All ready created like - int, boolean, float
        - Non-Primitive -> Own Created like - Arrays, Strings ......
         */

        // Primitive data types
        /* byte b = 8;
        System.out.println(b);
        char ch = 'A';
        System.out.println(ch);
        boolean var = true;
        System.out.println(var);
        float price = 10.6f;
        int num = 10;
        long l = 5985;
        double d = 85.5;
        short s = 54;  */

        // Sum of a & c
        /* int a = 10;
        int c = 52;
        System.out.println("Sum of a & c : " + (a + c)); */

        // Comments in Java -> none executable line, compilar ignore all things
        // Hi there!
        /* Hi There! */

        // Input in Java
        Scanner scn = new Scanner(System.in);
        /* String input = scn.nextLine();
        System.out.println(input);

        int number = scn.nextInt();
        System.out.println(number);

        float prices = scn.nextFloat();
        System.out.println(prices);

        long equity = scn.nextLong();
        System.out.println(equity);

        short less = scn.nextShort();
        System.out.println(less);

        boolean workDone = scn.nextBoolean();
        System.out.println(workDone); */

        // Sum of a & b
        /* int a1 = scn.nextInt();
        int b1 = scn.nextInt();
        System.out.println(a1 + b1);
        System.out.println(a1 * b1); */

        // Area of circle
        /* float radius = scn.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.println(area); */

        /* char a = 'a';
        char b = 'b';
        System.out.println((int) (a)); //97
        System.out.println((int) (b)); //98
        System.out.println(b-a); // 1 */

        // char c = a - b;

        /* short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a + b + c);
        System.out.println(bt); */

        // byte b = (byte) (b * 2);
        // System.out.println(b);
    }
}
