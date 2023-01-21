import java.util.Scanner;

public class ZSG_54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), arr[] = new int[x], m = x / 2, odd[] = new int[m], even[] = new int[x - m];
        int ei = 0, oi = 0;
        

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) even[ei++] = arr[i];
            else odd[oi++] = arr[i];
        }
        Sort(even);
        Sort(odd);
        ei = 0; oi = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) arr[i] = even[m - ei++];
            else arr[i] = odd[oi++];
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + "  ");
    }
    private static void Sort(int[] A) {
        int t, i, j;
	    for (i = 0; i < A.length - 1; i++) {
		for (j = i + 1; j < A.length; j++) {
			if (A[i] > A[j]) {
				t = A[i]; A[i] = A[j]; A[j] = t;
			}
		}
	}	
    }

}
