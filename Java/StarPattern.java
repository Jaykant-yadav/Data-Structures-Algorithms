import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        /*
         *
         * *
         * * *
         * * * *
         */

        /* for(int line=1; line<=n; line++){
            for(int star=1; star<=line; star++){
                System.out.print("Jay Shree Ram" + " ");
            }
            System.out.println();
        } */


        /* 
        * * * *
        * * *
        * *
        * 
         */

       /*  for(int line=n; line>=1; line--){
            for(int star=1; star<=line; star++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for(int line=1; line<=n; line++){
            for(int star=1; star<=n-line+1; star++){
                System.out.print("*" + " ");
            }
            System.out.println();
        } */

        
        /* 
        1   
        1 2
        1 2 3
        1 2 3 4
         */
        /* for(int line=1; line<=n; line++){
            for(int num=1; num<=line; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        } */


        /* 
        A
        B C
        D E F
        G H I J
         */

        char ch = 'A';
        for(int line=1; line<=n; line++){
            for(int cha=1; cha<=line; cha++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
