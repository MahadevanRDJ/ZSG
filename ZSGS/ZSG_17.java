import java.util.Scanner;

public class ZSG_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float R = scan.nextFloat(), r = scan.nextFloat();
        scan.close();
        AreaBetweenConCentricCircles(R, r);
    }
    private static void AreaBetweenConCentricCircles(float R, float r) {
        System.out.printf( "Area between the two concentric circles : %.4f", Math.PI * ((R * R) - (r * r)));
    }
}
