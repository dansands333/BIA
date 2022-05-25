package main;

import java.util.Scanner;

public class Acceleration {
	
	 /*
	 * 1. Declaring variables
	 * 2. Initialize OR Getting User's input
	 * 3. Black Box (magic) - Calculating Acceleration
	 * 4. Store the answer (acceleration value)
	 * 5. Print acceleration.
	 */
	
	static double v0; // Initial velocity
	static double v1; // Final velocity
	static double t;  // Time
	static double a;  // Acceleration
	
	static Scanner scanner;
	

	public static void main(String[] args) {
		// v0 = 5.5;
		// v1 = 50.9;
		// t  = 4.5;
		scanner = new Scanner(System.in); // Creating a new scanner
		
		/*
		 * Getting input from user
		 * 1. Create Scanner
		 * 2. What type of variable we want to read.
		 * 3. Save/store any value read scanner.
		 * 4. Use our algorithm to calculate a.
		 */
		
		v0 = scanner.nextDouble();
		System.out.println(v0);
		
		v1 = scanner.nextDouble();
		System.out.println(v1);
		
		t = scanner.nextDouble();
		System.out.println(t);
		
		
		/*
		 * BlackBox: Calculates the acceleration.
		 * A. It needs 3 variables (v0, v1, t).
		 * B. a = v1 - v0 / t
		 * C. save value of acceleration (step 4)
		 */
		
		a = (v1 - v0) / t; // 10.0888888...
		System.out.println(a);
		
	}

}
