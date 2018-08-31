/**
 * implements factorial recursively 
 * @author Jake Ols
 * @version 0.1.0
 */
public class FactorialRecursive implements Factorial {

    // test implementation
    public static void main(String[] args) {
        FactorialRecursive newFact = new FactorialRecursive();
        System.out.println("factorial for 3 is " + newFact.factorial(3));
        System.out.println("factorial for 4 is " +  newFact.factorial(4));
    }

    /**
     * @param int
     * @return int
     */
    public int factorial(int n){
        // base case - n = 1, you've reached the end of the factorial
        if(n <= 1){
			return 1;
        }
        // next number in the factorial
        int newFactorial = n*factorial(n-1);
        return newFactorial;
		
    }
}