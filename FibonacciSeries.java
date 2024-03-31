public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Change the value as needed
        System.out.println("Fibonacci series for first " + n + " numbers:");
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}