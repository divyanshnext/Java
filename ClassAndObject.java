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