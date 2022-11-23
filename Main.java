/*  Activity 3
    CS 211: Object-Oriented Programming
    Submitted by: Garcia, Berlie Jaye T.
    Section: IT 2102
    Submitted to: Ms. Fatima Marie P. Agdon
    Course Instructor
*/

import Shapes.*;

public class Main {
    public static void main(String[] args){
        Shape shape1 = new Rectangle("apricot", 4, 5);
        System.out.println("Rectangle");
        System.out.println(shape1);
        System.out.println("Area is: " + shape1.getArea());

        Shape shape2 = new Triangle("magenta", 4, 5);
        System.out.println("\nTriangle");
        System.out.println(shape2);
        System.out.println("Area is: " + shape2.getArea());
 
        Shape shape3 = new Circle("powder blue", 6);
        System.out.println("\nCircle");
        System.out.println(shape3);
        System.out.println("Area is: " + shape3.getArea());
    }   
}