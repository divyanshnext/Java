// public class ClassAndObject {
    
//     // Data Fields
//     double radius;  // default value 0 , boolean --> false , char --> \u0000 , string --> null

//     //Constructors --> Intialise when object is created
//     //Empty Constructor or No-arg Constructor
//     Circle(){
//         radius = 1.0;
//     }

//     //parameterized constructor 


//     //methods
//     double getArea(){
//         return Math.PI * radius * radius;
//     }

//     double getPerimeter(){
//         return Math.PI * 2 * radius;
//     }

//     double setRadius(double newRadius)
// }

/*
 * package objectsAndClasses;

import java.util.Scanner;

public class TestCircle {

public static void main(String[] args) {

// Variable storing the reference to the Object -> Object (new)
// Scanner inputScanner = new Scanner(System.in);
Circle circle1 = new Circle(); // new -> create objects

System.out.println("Radius: " + circle1.radius); // access data fields
System.out.println("Area: " + circle1.getArea()); // invoking a method
System.out.println("Perimeter: " + circle1.getPerimeter()); // invoking a method

Circle circle2 = new Circle(25.0); // new -> create objects

System.out.println("Radius: " + circle2.radius); // access data fields
System.out.println("Area: " + circle2.getArea()); // invoking a method
System.out.println("Perimeter: " + circle2.getPerimeter()); // invoking a method

Circle circle3 = new Circle(125.0); // new -> create objects

System.out.println("Radius: " + circle3.radius); // access data fields
System.out.println("Area: " + circle3.getArea()); // invoking a method
System.out.println("Perimeter: " + circle3.getPerimeter()); // invoking a method
}

}
 */







// No main method inside it - normal class
// public class Circle {

// // Data Fields
// double radius; // default value of 0, boolean -> false, char -> \u0000, String, Person -> null

// // Constructors -> Initialise when object is created
// // Empty Constructor or No-arg constructor
// Circle() {
// radius = 1.0;
// }

// // Parameterized Constructor
// Circle(double newRadius) {
// radius = newRadius;
// }


// // Methods
// double getArea() {
// return Math.PI * radius * radius;
// }

// double getPerimeter() {
// return Math.PI * 2 * radius;
// }

// void setRadius(double newRadius) {
// radius = newRadius;
// }
// }



/*
 * package objectsAndClasses;

import java.util.Random;

public class TestRandom {

public static void main(String[] args) {
// TODO Auto-generated method stub

// Math.random()
// for(int i=0; i<10; i++) {
// System.out.print((int)(Math.random() * 100) + " ");
// }

Random generator1 = new Random(3);
System.out.println("From gen1: ");
for(int i=0; i<10; i++) {
// [0, 1000)
System.out.print(generator1.nextInt(1000) + " ");
}

Random generator2 = new Random(3);
System.out.println("From gen2: ");
for(int i=0; i<10; i++) {
// [0, 1000)
System.out.print(generator2.nextInt(1000) + " ");
}

}

}
 */


 /*
  * package objectsAndClasses;

import java.util.Date;

public class TestDate {

public static void main(String[] args) {

// System.currentTimeMillis();
Date date = new Date(); // constructs a date objects with milliseconds
// elapsed since Jan 1, 1970;

System.out.println(date.toString());

// set a specific elapsed time since jan 1, 1970
Date date2 = new Date(200000000000000L);
System.out.println(date2.toString());

}

}
  */

/*
 * 
 * package objectsAndClasses;

import java.util.Random;

public class TestRandom {

public static void main(String[] args) {
// TODO Auto-generated method stub

// Math.random()
// for(int i=0; i<10; i++) {
// System.out.print((int)(Math.random() * 100) + " ");
// }

Random generator1 = new Random(3);
System.out.println("From gen1: ");
for(int i=0; i<10; i++) {
// [0, 1000)
System.out.print(generator1.nextInt(1000) + " ");
}

Random generator2 = new Random(3);
System.out.println("From gen2: ");
for(int i=0; i<10; i++) {
// [0, 1000)
System.out.print(generator2.nextInt(1000) + " ");
}

}

}
 */







 /*
  * 
import java.util.Date;

public class Loan {

// Data fields - loanAmount, numberOfYears, Date, interestRate
private double annualInterestRate;
private int numberOfYears;
private double loanAmount;
private Date loanDate;

// Constructors
/**
* Default Constructor
*/


public Loan() {
  this(2.5, 1, 1000);
  }
  
  
  /**
  * Constructing a loan object with specified interest rate,
  * number of years and loan amount
  */
  public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
  this.annualInterestRate = annualInterestRate;
  this.numberOfYears = numberOfYears;
  this.loanAmount = loanAmount;
  this.loanDate = new Date();
  }
  
  // Getters and Setters
  public double getAnnualInterestRate() {
  return annualInterestRate;
  }
  
  
  public void setAnnualInterestRate(double annualInterestRate) {
  this.annualInterestRate = annualInterestRate;
  }
  
  
  public double getLoanAmount() {
  return loanAmount;
  }
  
  
  public void setLoanAmount(double loanAmount) {
  this.loanAmount = loanAmount;
  }
  
  
  public int getNumberOfYears() {
  return numberOfYears;
  }
  
  
  public Date getLoanDate() {
  return loanDate;
  }
  
  // Methods
  /** Find monthly payment */
  public double getMonthlyPayment() {
  double monthlyInterestRate = annualInterestRate / 1200;
  
  double monthlyPayment = loanAmount * monthlyInterestRate / (1
  - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
  
  return monthlyPayment;
  }
  
  
  /**
  * Find total payment
  */
  public double getTotalPayment() {
  double totalPayment = getMonthlyPayment() * 12 * numberOfYears;
  return totalPayment;
  }
  

  */








  /*
   * 
   * import java.util.Scanner;

import oops.Loan;

public class TestLoan {

public static void main(String[] args) {
// TODO Auto-generated method stub

// Create a Scanner
Scanner input = new Scanner(System.in);

// Enter the annual Interest Rate
System.out.println("Enter annual interest rate (in percentage): ");
double annualInterestRate = input.nextDouble();

System.out.println("Enter number of years (integer): ");
int numberOfYears = input.nextInt();

// Enter a loan amount
System.out.println("Enter loan amount or principal: ");
double loanAmount = input.nextDouble();

// Created a loan object here
Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

// Display the loan date, monthly payment and total payment
System.out.printf("The loan created on %s\n" +
"The monthly payment is %.2f\nThe total payment is %.2f\n",
loan.getLoanDate().toString(), loan.getMonthlyPayment(),
loan.getTotalPayment());
}

}
   */