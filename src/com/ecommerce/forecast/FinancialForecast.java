package com.ecommerce.forecast;

import java.util.Scanner;

public class FinancialForecast {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double[] expenses = new double[6];

	        System.out.println("Enter expenses for the last 6 months:");
	        double total = 0;

	        // Input and store in array
	        for (int i = 0; i < expenses.length; i++) {
	            System.out.print("Month " + (i + 1) + ": ₹");
	            expenses[i] = scanner.nextDouble();
	            total += expenses[i];
	        }

	        // Calculate average
	        double average = total / expenses.length;

	        // Forecast next month
	        System.out.printf("\nAverage Monthly Expense: ₹%.2f\n", average);
	        System.out.printf("Forecasted Expense for Next Month: ₹%.2f\n", average);

	        // Display all data
	        System.out.println("\n--- Expense Summary ---");
	        for (int i = 0; i < expenses.length; i++) {
	            System.out.printf("Month %d: ₹%.2f\n", i + 1, expenses[i]);
	        }
	        System.out.printf("Forecast (Month 7): ₹%.2f\n", average);
	    }
	}
