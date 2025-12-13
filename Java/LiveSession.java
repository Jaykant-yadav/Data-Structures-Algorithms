public class LiveSession {
    public static void main(String[] args) {
        // Fibbnacci Number
        int first = 0, second = 1, third = 0;
        int n = 5;
        for(int i=0; i<n; i++){
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
