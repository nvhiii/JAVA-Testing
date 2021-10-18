/*
 * This file is part of the RectangleApp package.
 * It contains the main method. ONLY one file in a package (ie project) will
 * have a main method.
 * This App uses the Rectangle class which is included in this project.
 * */
package rectangleapp;
/**
 *
 * @author
 */

import java.awt.*;
/** 2/24/2021
 * We are going to use this class as a TEST class to try out our
 * new datatype Rectangle
 * @author
 */
public class RectangleApp {

    /** main method -- this class has access ONLY to the public members
     * of the Rectangle class
     */
    public static void main(String[] args) {
        // someone might write code:
        // instantiates a new object of type Rectangle
        // constructor gets called each time an object is created with new
        Rectangle box = new Rectangle(2.0, 2.0);
        box.setLength(5.7);
        box.setWidth(9.9);
        // call an instance method using DOT operator on object
        System.out.println("length of box is: " + box.getLength() + " width of"
                + " box is: " + box.getWidth());
        // compiler error if you try box.width since width has private access
        Rectangle diningRoom = new Rectangle(17.5, 13.4);
        System.out.println("length of diningRoom is: " + diningRoom.getLength() + " width of"
                + " box is: " + diningRoom.getWidth());
        Rectangle kitchen = new Rectangle();
        kitchen.setLength(17.0);
        kitchen.setWidth(14.6);
        int x = 0;
        int num = x; // compiler error of UNINITIALIZED VARIABLE
        // soon uniniti ref var
    }
}


