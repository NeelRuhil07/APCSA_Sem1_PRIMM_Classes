/**
 * Driver class for the shapes
 * @author
 * @version 1.0
 * @since 2024-09
 */


class ShapeDriver {
    public static void main(String args[]) {

        Square sq1 = new Square(2.0);

        System.out.printf("Side: %.2f\n", sq1.getSide());
        //Print out perimeter, area
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());
        // Change the side length
        sq1.setSide(3.0);
        // Print out side length, perimeter, area
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());

        // Change the perimeter
        sq1.setPerimeter(16.0);
        // Print out side length, perimeter, area
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());
        // Change the area
        sq1.setArea(25.0);
        // Print out side length, perimeter, area
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());
        // After implementing a constructor that takes a side length
        // create a new square with side length 4.5
        sq1.setSide(4.5);
        // Print out side length, perimeter, area
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());

        // TODO: After implementing a new shape of your choosing


    }


}