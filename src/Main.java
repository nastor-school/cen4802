/**
 * @author Nick Astor
 */
public class Main {
    public static void main(String[] args)
    {
        int n = 10;
        int result = fib(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }

    /**
     * This method allows a user to supply a number as input and return the matching index within the Fibonacci sequence
     * @param n a number representing which index in the fibonacci sequence the user would like to return
     * @return an index of the fibonacci sequence determined by the users input
     */
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