public class FibonacciRecursive implements Fibonacci {

    // testing implementation
    public static void main(String[] args) {
        FibonacciRecursive newFib = new FibonacciRecursive();
        System.out.println("fibonnacci for 10 is " + newFib.fibonacci(10));
        System.out.println("fibonacci for 6 is " +  newFib.fibonacci(20));
    }

    public int fibonacci(int n){
        // base case
        if(n <= 1){
            return n;
        }   
        // get next numbers
            int nextFibonacci = fibonacci(n-1) + fibonacci(n-2);
            return nextFibonacci;
        
    }

}