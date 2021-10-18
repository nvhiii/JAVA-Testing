/** 2/24/2021
 * This is version 1 of the Rectangle class.
 * It uses constructors, and this
 *
 */
package rectangleapp;
/**
 * class has state (data) and behavior (methods)
 * 1st major rule of Object Oriented Programming:
 * Data Hiding or Encapsulation
 * we use keyword (access specifier) private to hide data
 * this means that outside the class anything that is private is
 * NOT accessible
 * 2nd major concept of OOP:
 * safety of our objects
 *  a. we can check values in setters and only set fields to valid values
 *  b. the class can initialize object's fields by writing constructors
 *
 * this -- 1. allows you to call another constructor 
 * 2. it is used as a reference to the receiver object (calling object/ object bef DOT
 * ie the object that got you into the method)
 * so you say this.length to refer to the length field of the object that brought you here
 */
public class Rectangle {
    private double length;
    private double width;
   /* notes: the default constructor is provided by the compiler only when there
   are no constructors in the class
   it has no arguments and it zeros/null all values
   */

    /** Constructor
     *  a method that is responsible for initializing fields of a newly created object
     *  called automatically (new Rectangle)
     *  name of constructor is IDENTICAL to name of class
     *  no return type
     *  @param l  length
     *  @param w  width
     */
    public Rectangle(double l, double w) {
        System.out.println("we are in parameter constructor");
        // check if values in parameters are valid
        if (l >= 0 && w >= 0) {
            length = l;
            width = w;
        }
        else {
            // throw exception
        }
    }
    /** no-arg constructor
     *  initialize both length and width to 1
     */
    public Rectangle() {
        this(1, 1);
        System.out.println("we are in no-arg constructor");
        // length = width = 1;
    }
    /** instance method acts on an instance variable
     *  accessor is a method that returns that value of a field also called
     *  "getters"
     *  getLength()
     *  @return length field of the Rectangle object
     */
    public double getLength() {
        return this.length;
    }
    /**
     * sets length instance field
     * @param len
     */
    public void setLength(double length) {
        if (length >=0)
            this.length = length; // disambiguates: this.length is my instance field
            // called length, and plain length is the parameter
        else {
            // throw an exception
        }
    }
    /**
     *  getWidth()
     *  "setters" or mutators
     *  @return width field of the Rectangle object
     */
    public double getWidth() {
        return this.width;
    }
    /**
     *
     * @param wid
     */
    public void setWidth(double width) {
        if (width >= 0)
            this.width = width; // my instance field width should be set to parameter width
        else {

        }
    }
}