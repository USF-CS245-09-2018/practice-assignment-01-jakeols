public class FactorialRecursive implements Factorial {

    // test implementation
    public static void main(String[] args) {
        FactorialRecursive newFact = new FactorialRecursive();
        System.out.println("factorial for 3 is " + newFact.factorial(3));
        System.out.println("factorial for 4 is " +  newFact.factorial(4));
    }

    public int factorial(int n){
        // base case
        if(n <= 1){
			return 1;
		}
        
        return n*factorial(n-1);
		
    }
}