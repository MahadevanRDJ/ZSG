import java.util.Scanner;

public class ZSG_13_to_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Side of Square : ");
        int side = scan.nextInt();
        AreaOfSquare(side);
        System.out.println("Enter the length and breadth of Rectangle : ");
        double length = scan.nextDouble(), breadth = scan.nextDouble();
        AreaOfRectangle(length, breadth);
        System.out.println("Enter the Radius and height of Cylinder : ");
        double radius = scan.nextDouble(), height = scan.nextDouble();   
        AreaOfCylinder(radius, height);
        scan.close();
    }
    private static void AreaOfSquare(double side) {
        System.out.println("Area of the Sqaure : " + side * side);
    }
    private static void AreaOfRectangle(double length, double breadth) {
        // System.out.println("Area of Rectangle : " + length * breadth);
        System.out.println( "Area of the Rectangle : " + length * breadth);
    }
    private static void AreaOfCylinder(double radius, double height) {
        System.out.println("Area of the Cylinder : " + (2 * Math.PI * radius * (radius + height)));
    }
}
