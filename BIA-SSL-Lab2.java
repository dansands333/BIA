package main;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AccelerationCalculator {

	static double v0;
	static double v1;
	static double t;
	static double a;

	public static void main(String[] args) {
		calculateAcceleration();
	}

	private static double getScannerInput() {

		try (Scanner scanner = new Scanner(System.in)) {

			v0 = scan(scanner, "Initial Velocity (m/s)");
			v1 = scan(scanner, "Final Velocity (m/s)");
			t  = scan(scanner, "Total Time (s)");

		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
		} catch (Exception e) {
			System.err.println("Invalid Format!");
		}
		
		return (v1 - v0) / t;
	}
	
	private static double scan (Scanner scanner, String valueName) {
		
		double temporal_value = 0.0;
		
		System.out.println("\n\nPlease input the " + valueName);
		temporal_value = scanner.nextDouble();
		System.out.println("> Input Received: " + valueName + " = " + temporal_value + ".");
		
		return temporal_value;
	}
	
	private static void calculateAcceleration() {
		a = getScannerInput();
		System.out.println(".\n.\n.\n>>> Acceleration = " + a + " m/s2.");
	}

	private void getInput_fromBuffer() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// int i = Integer.parseInt(br.readLine());
			// String s = br.readLine();
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
		}
	}

}
