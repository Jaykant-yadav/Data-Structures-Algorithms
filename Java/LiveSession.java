import java.util.Scanner;

public class LiveSession {
    // Fizz Buzz
    public static void fizzBuzz(int nums) {
        if (nums % 15 == 0) {
            // only multiple of 3
            System.out.println("FizzBuzz");
        } else if (nums % 5 == 0) {
            // only multiple of 5
            System.out.println("Buzz");
        } else if (nums % 3 == 0) {
            // multiple of 3 & 5
            System.out.println("Fizz");
        } else {
            System.out.println(nums);
        }
    }

    // Weekday or Weekend
    public static void Weekday(int DayNum){
        switch (DayNum) {
            case 1, 2, 3, 4, 5: {System.out.println("Weekday"); break;}
            case 6, 7: {System.out.println("Weekend"); break;}
            default: {System.out.println("Invalid Day");}
        }
    }

    // TimeZone GMT -> IST
    public static void timeZoneConvert(int day, int hour, int minute){
        hour += 5;
        minute += 30;

        if(minute >= 60){
            hour++;
            minute -= 60;
        }

        if(hour >= 24){
            day++;
            hour -= 24;
        }

        System.out.println("day : " + day + ", hour : " + hour + ", minute : " + minute);
    }

    // Fibbonacci Number
    public static void fib(int nums) {
        int first = 0, second = 1, third = 0;
        int n = 5;
        for (int i = 0; i < n; i++) {
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();
        int hour = scn.nextInt();
        int minute = scn.nextInt();

        timeZoneConvert(day, hour, minute);

    }
}
