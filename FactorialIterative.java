/**
 * implements factorial iteratively
 * @author Jake Ols
 * @version 0.1.0
 */
public class FactorialIterative implements Factorial {

    // test implementation
    public static void main(String[] args) {
        FactorialIterative newFact = new FactorialIterative();
        System.out.println("factorial for 3 is " + newFact.factorial(3));
        System.out.println("factorial for 4 is " +  newFact.factorial(4));
    }

    /**
     * @param int
     * @return int
     */
    public int factorial(int n){
        int counter=1;
        // let i represent 1 until i reaches the value of n
        int i=1;
        // continue adding until you get to n
		while(i <=n ){

            counter = counter*i;

            i++;
		}
		return counter;
    }

}