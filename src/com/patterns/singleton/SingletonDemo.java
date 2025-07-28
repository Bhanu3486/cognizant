package com.patterns.singleton;

public class SingletonDemo {
	 private static SingletonDemo instance;

	    // Private constructor to prevent instantiation
	    private SingletonDemo() {
	        System.out.println("Singleton instance created");
	    }

	    // Public method to return the single instance
	    public static SingletonDemo getInstance() {
	        if (instance == null) {
	            instance = new SingletonDemo();
	        }
	        return instance;
	    }

	    public void showMessage() {
	        System.out.println("Hello from Singleton!");
	    }

	    public static void main(String[] args) {
	        SingletonDemo s1 = SingletonDemo.getInstance();
	        SingletonDemo s2 = SingletonDemo.getInstance();

	        s1.showMessage();

	        if (s1 == s2) {
	            System.out.println("Both objects are the same instance.");
	        } else {
	            System.out.println("Objects are different instances.");
	        }
	    }
}
