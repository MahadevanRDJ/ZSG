import java.util.Scanner;

public class Count_2{
    public static void main(String[] args) {
        Count_2 count = new Count_2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("No of inputs : ");

        int n = scanner.nextInt();
        System.out.println("Enter the values : ");

        String values[] = new String[n];
        for (int i = 0; i < n; i++)  values[i] = scanner.next();
        String newValues[] = count.addDash(values);

        count.countSort(newValues);
        scanner.close();
    }

    private String[] addDash(String values[]) {
        String newValues[] = new String[values.length];
        for (int i = 0; i < values.length / 2; i++)   newValues[i] = values[i].charAt(0) + "-";
        for (int i = values.length / 2; i < values.length; i++) newValues[i] = values[i];
        return newValues;
    }

    private void countSort(String[] values) {
        int count[] = count(values);
        sort(values, count);
    }

    private void sort(String values[], int count[]) {
        String sorted[] = new String[values.length];
        for (int i = values.length - 1; i >= 0; i--) sorted[--count[values[i].charAt(0) - '0']] = values[i];
        for (int i = 0; i < sorted.length; i++)  System.out.print(sorted[i].substring(1) + " ");
    }

    private int[] count(String values[]) {
        int count[] = new int[10];
        for (int i = 0; i < values.length; i++) count[(values[i].charAt(0)) - '0']++;
        for (int i = 1; i < count.length; i++) count[i] = count[i] + count[i - 1];
        return count;
    }
}
