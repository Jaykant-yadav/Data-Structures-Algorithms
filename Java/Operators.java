public class Operators {
    public static void main(String[] args) {
        // Types of Operators
        /*
         * - Arithmetic Operators (Binary / Unary)
         * - Relational Operators
         * - Logical Operators
         * - Bitwise Operators (Bit Manipulation)
         * - Assignment Operators
         */

        // Binary -> 2 operands
        int A = 53;
        int B = 87;
        System.out.println("add = " + (A+B));
        System.out.println("substract = " + (A-B));
        System.out.println("multi = " + (A*B));
        System.out.println("Div = " + (A/B));
        System.out.println("modulo = " + (A%B));


        // Unary Operators
        // a = a + 1 , ++ -> a++, ++a
        // a = a - 1 , -- -> a--, --a
        /* int a = 10;
        int b = ++a;
        System.out.println(a); //11
        System.out.println(b); //11 */

        /* int a = 10;
        int b = a++;
        System.out.println(a); //11
        System.out.println(b); //10 */

        /* int a = 10;
        int b = --a;
        System.out.println(a); //9
        System.out.println(b); //9 */

        int a = 10;
        int b = a--;
        System.out.println(a); //9
        System.out.println(b); //10
    }
}
