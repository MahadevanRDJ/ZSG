import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), height[] = new int[n];
        for (int i = 0; i < height.length; i++)
            height[i] = scan.nextInt();
        System.out.println(findArea(height));
    }

    private static int findArea(int[] height) {
        int area = 0, i = 0, j = height.length-1, total = 0;
        while(i<j) {
        	total = (j-i) * (Math.min(height[i],height[j]));
        	area = Math.max(area, total);

        	if(height[i] < height[j]) i++;
        	else j--;
        }
        return area;
    }
}