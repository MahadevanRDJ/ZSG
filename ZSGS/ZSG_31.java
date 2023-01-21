import java.util.Scanner;

public class ZSG_31 {
    //Roots of Quadratic equation
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat(), b = scan.nextFloat(), c = scan.nextFloat();
        double x1 = 0, x2 = 0;
        scan.close();
        
        if(a > 0) {
            double determinant = (b * b) - (4 * a * c);
            if (determinant == 0) {
                x1 = x2 = (-(b / (2 * a)));
            }
            else if (determinant > 0) {
                x1 = ((-b + SquareRoot(determinant)) / 2 * a);
                x2 = ((-b - SquareRoot(determinant)) / 2 * a);
            }
            else {
                double real = (-(b / (2 * a)));
                double imaginary = SquareRoot(-(determinant)) / (2 * a);
                System.out.printf( "x1 : %.3f + j%.3f\n", real, imaginary);
                System.out.printf( "x2 : %.3f - j%.3f\n ", real, imaginary);
                return;
            }
        }
        System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
    }
    private static double SquareRoot(double n) {
        double t;
        double s = n / 2;
        do {
            t = s;
            s = (t + (n/t)) / 2;
        } while((t - s) != 0);
        return s;
    }
}
