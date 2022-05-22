public class Main {
    public static void main(String[] args)
    {
        int n = 10;
        int result = fib(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }

    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1)
                + fib(n - 2);
    }
}