public class FibonacciIterative implements Fibonacci {

    // testing implementation
    public static void main(String[] args) {
        FibonacciIterative newFib = new FibonacciIterative();
        System.out.println("fibonnacci for 10 is " + newFib.fibonacci(10));
        System.out.println("fibonacci for 20 is " +  newFib.fibonacci(20));
    }

    public int fibonacci(int n){
        // if gets to end of series
        if(n <= 1) {
			return n;
        }
        // current number
        int currentFibonacci = 1;

        // starting series
		int initialSeries = 1;
        
        // loop to add
		for(int i=2; i<n; i++) {
			int counter = currentFibonacci;
			currentFibonacci+= initialSeries;
			initialSeries = counter;
		}
		return currentFibonacci;
    }

}