package testingProject;

public class Calculator {

	  public static int add(int numOne, int numTwo) {
	    int result = numOne + numTwo;
	    System.out.println(numOne + " + " + numTwo + " = " + result);
	    return result;
	  }

	  public static int subtract(int numOne, int numTwo) {
	    int result = numOne - numTwo;
	    System.out.println(numOne + " - " + numTwo + " = " + result);
	    return result;
	  }

	  public static int multiply(int numOne, int numTwo) {
	    int result = numOne * numTwo;
	    System.out.println(numOne + " * " + numTwo + " = " + result);
	    return result;
	  }

	  public static double divide(int numOne, int numTwo) {
		try{
			double result = numOne / numTwo;
		    System.out.println(numOne + " / " + numTwo + " = " + result);
		    return result;
		}catch(ArithmeticException ae){
			System.out.println("Cannot divide an integer with 0");
			return Double.POSITIVE_INFINITY;
		}
		
	    
	  }

	  public static void main(String[] args) {
	    int numOne = 12;
	    int numTwo = 13;
	    
	    add(numOne, numTwo);
	    subtract(numOne, numTwo);
	    multiply(numOne, numTwo);
	    divide(numOne, numTwo);
	  }
	}
