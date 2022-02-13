/**
 * 
 */
package methodsAssignments;

/**
 * @author amer.sangha
 * @ date: February 15, 2022
 * @ title: methodsAssignments
 * @ description: Java file with multiple methods that execute different things, 
 * basic methods to help understand java language
 */

import java.util.*;

public class MethodsAssignment_AmerSangha {

	/**
	 * Pre: a and b must be integers
	 * Post: returns the sum inclusive from a to b
	 * @param a
	 * @param b
	 * @return sum
	 */
	public static int sum (int a, int b) {
		
		int sum = 0; // initialize sum
		
		for (int n = a; n <= b; n++) { // create for loop to add all numbers between a and b
			sum += n; // increase sum
		}
		return sum; // return sum
	}
	
	/**
	 * Pre: n must be an integer
	 * Post: returns the factorial
	 * @param n
	 * @return num 
	 */
	public static int factorial (int n) {
		
		int count, num = 1; // initialize count and number
		for(count=1;count<=n;count++){ // loop to increase number multiplied 
		      num=num*count;    
		  }
		return num;  // return factorial
	}
	
	/**
	 * Pre: n must be an integer
	 * Post: returns a boolean
	 * @param n
	 * @return True or False
	 */
	public static boolean isPrime (int n) {
		
	    boolean flag = false; // create a false variable
	    
	    for (int i = 2; i <= n / 2; ++i) {
	      
	      if (n % i == 0) { // condition for non-prime number
	        flag = true;
	        break;
	      }
	    }

	    if (!flag) 
	      return true; // if number is prime
	    else
	      return false; // if number is false
	  }
	
	/**
	 * Pre: a and b must be integers
	 * Post: returns gcf
	 * @param a
	 * @param b
	 * @return gcf
	 */
	public static int gcf (int a, int b) {
		
		int gcf = 0; // initialize gcf
		
		for(int i = 1; i <= a && i <= b; i++) {
		 
		if(a%i==0 && b%i==0)  // find the gcf
		 
		gcf = i;  // assign gcf 
		}  
		
		return gcf; //return gcf
	}
	
	/**
	 * Pre: a and b are doubles
	 * Post: returns the average of the two numbers
	 * @param a
	 * @param b
	 * @return avg
	 */
	public static double average (double a, double b) {
		
		double avg = 0; // initialize average variable
		
		avg = (a + b)/2; // calculate the average of two numbers 
		
		return avg; // return average
		
	}
	
	/**
	 * Pre: a, b, and c are doubles
	 * Post: return the area as a double
	 * @param a
	 * @param b
	 * @param c
	 * @return Area
	 */
	public static double triangleArea (double a, double b, double c) {
		
		double s; // initialize s
	
		s = (a + b + c)/2; // calculate the s value
		
		double Area; // initialize the area
		
		Area = (s*(s-a)*(s-b)*(s-c)); // calculate area
		
		Area = Math.sqrt(Area);
		
		return Area; // return area
		
	}
	
	/**
	 * Pre: n is a double
	 * Post: returns the root as a double 
	 * @param n
	 * @return root
	 */
	public static double mySqrt (double n) {
		
		double temp = n; // set up a temp variable 
        double root; // initialize the root 

        while (true) // loop calculations for the root
        {
            root = 0.5 * (temp + (n / temp)); // calculation loop for the root
            if (Math.abs(root - temp) < 0.0001)
                break;
     
            temp = root; // update the temp
        }
     
        return root; // return the root
		
	}
	
	/**
	 * Pre: a and b are doubles
	 * Post: returns the area
	 * @param a
	 * @param b
	 * @return area
	 */
	public static double rectangleArea (double a, double b) {
		
		double area = 0; // initialize area
		
		area = a*b; // calculate area
		
		return area; // return area
		
	}
	
	/**
	 * Pre: r is a double
	 * Post: returns the area
	 * @param r
	 * @return area
	 */
	public static double circleArea (double r) {
		
		double pi = Math.PI; // initialize variable for pi
		double area = 0; // initialize area
		
		area = pi*(Math.pow(r, 2)); // calculate area 
		
		return area; // return area
	}
	
	/**
	 * Pre: r is a double
	 * Post: returns the volume
	 * @param r
	 * @return
	 */
	public static double sphereVolume (double r) {
		
		double pi = Math.PI; // initialize variable for pi
		double volume = 0; // initialize volume
		
		volume = (4.0/3.0) * pi * (Math.pow(r, 3)); // calculate area 
			
		return volume; // return area
	}
	
	public static double coneVolume (double r, double h) {
		
		double pi = Math.PI; // initialize variable for pi
		double volume = 0; // initialize volume 
		
		volume = (1.0/3.0) * pi * (Math.pow(r, 2)) * h; // calculate volume 
		
		return volume; // return volume 
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		while (true) {
			
		try {
		
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    
	    System.out.println("Enter two integers to find the inclusive sum."); // take inputs for sum method
	    System.out.print("Enter first integer: ");
	    
	    if (!sc.hasNextInt()) {
	       System.out.println("Not an integer."); // check if there is an integer
	    }
	    
	    int x = sc.nextInt();
	    System.out.print("Enter second integer: "); // assign x
	    
	    if (!sc.hasNextInt()) {
	       System.out.println("Not an integer.");
	    }
	    
	    int y = sc.nextInt(); // assign y
	    
	    if (x > y) {
	    	System.out.println("Second number is smaller than first. Unable to calculate."); // check
	    }
	    
	    if (x < y) {
	    	System.out.println("The sum of the numbers inclusive is " + sum(x,y) + "."); // execute method
	    }
	    
	    System.out.println(" ");
	    System.out.print("Enter an integer to check the factorial: ");
	    if (!sc.hasNextInt()) {
		       System.out.println("Not an integer."); // check
		    }
	    
	    x = sc.nextInt(); // reassign x
	    
	    if (x < 0) {
	    	System.out.println("Number is negative."); // check
	    }
	    
	    if (x == 0) {
	    	System.out.print("The factorial of 0 is 1."); // check
	    }
	    
	    if (x >= 1) {
	    System.out.println("The factorial of " + x + " is " + factorial(x) + "."); // execute  factorial method
	    }
	    
	    System.out.println(" ");
	    System.out.print("Enter an integer to see if it is prime: ");
	    if (!sc.hasNextInt()) { // check
		       System.out.println("Not an integer.");
		    }
	    
	    x = sc.nextInt(); // reassign x
	    
	    if (x < 1) {
	    	System.out.println(false); // check
	    }
	    
	    if (x >= 1) {
	    	System.out.println(isPrime(x)); // execute isPrime method
	    }
	    
	    System.out.println(" ");
	    System.out.println("Enter two integers to find the GCF between them.");
	    System.out.print("Enter first integer: ");
	    if (!sc.hasNextInt()) { // check
		       System.out.println("Not an integer.");
	    }
	    
	    x = sc.nextInt(); // reassign x
	    
	    System.out.print("Enter second integer: ");
	    if (!sc.hasNextInt()) { // check
		       System.out.println("Not an integer.");
	    }
	    
	    y = sc.nextInt(); // reassign y
	    
	    System.out.println("The greatest common factor of " + x + " and " + y + " is " + gcf(x,y) + "."); // execute gcf method
	    
	    System.out.println(" ");
	    System.out.println("Enter two numbers to find the average between them.");
	    System.out.print("Enter first number: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    double a = sc.nextDouble(); // create a variable
	    
	    System.out.print("Enter second number: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    double b = sc.nextDouble(); // create b variable
	    
	    System.out.printf("The average of the two numbers is " + "%.4f %n", average(a,b)); // execute average method
	    
	    System.out.println(" ");
	    System.out.println("Enter three numbers to find the area of a triangle.");
	    System.out.print("Enter first number: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    a = sc.nextDouble(); // reassign a
	    
	    System.out.print("Enter second number: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    b = sc.nextDouble(); // reassign b
	    
	    System.out.print("Enter thrid number: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    double c = sc.nextDouble(); // create c
	    
	    // execute triangleArea method
	    System.out.println("The area of the triangle is " + (double)Math.round(triangleArea(a,b,c) * 10000d) / 10000d + " units squared.");
	    
	    System.out.println(" ");
	    System.out.print("Enter a number to find the square root of it: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    a = sc.nextDouble(); // reassign a
	    
	    if (a <= 0) { // check
	    	System.out.println("Number is negative.");
	    }
	    
	    if (a > 0) { // check
	    System.out.printf("The root of " + a + " is " + "%.4f %n", mySqrt(a)); // execute mySqrt method
	    }
	    
	    System.out.println(" ");
	    System.out.println("Enter two numbers to find the area of a rectangle.");
	    System.out.print("Enter first number: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    a = sc.nextDouble(); // reassign a
	    
	    System.out.print("Enter second number: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    b = sc.nextDouble(); // reassign b
	    
	    System.out.println("The area of the rectangle is " + rectangleArea(a,b) + " units squared."); // execute rectangleArea method
	    
	    System.out.println(" ");
	    System.out.print("Enter the radius of a circle : ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    a = sc.nextDouble(); // reassign a
	    
	    //execute circle area Method
	    System.out.println("The area of the circle is " + (double)Math.round(circleArea(a) * 10000d) / 10000d + " units squared.");
	    
	    System.out.println(" ");
	    System.out.print("Enter the radius of a sphere: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    a = sc.nextDouble(); // reassign a
	    
	    
	    // execute sphereVolume method
	    System.out.println("The volume of the circle is " + (double)Math.round(sphereVolume(a) * 10000d) / 10000d + " units cubed.");
	    
	    System.out.println(" ");
	    System.out.print("Enter the radius of a cone: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    a = sc.nextDouble(); // reassign a
	    
	    System.out.print("Enter the height of a cone: ");
	    
	    if (!sc.hasNextDouble()) { // check
	    	System.out.println("Not a number.");
	    }
	    
	    b = sc.nextDouble(); // reassign b
	    
	    //execute coneVolume method
	    System.out.println("The volume of the cone is " + (double)Math.round(coneVolume(a,b) * 10000d) / 10000d + " units cubed.");
	    System.out.println("Program ended.");
	    break;
			}
		// check for string entries
		catch (Exception e) {
			System.out.println("Invalid Entry.");
			}
		}
	}
} 
