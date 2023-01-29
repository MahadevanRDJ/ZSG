import java.util.HashSet;

public class ConvertHashsetToArray {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 6; i++) set.add(i + 1);
        convertHashsetToArray(set);
    }
    private static void convertHashsetToArray(HashSet<Integer> set) {
        int A[] = new int[set.size()], i = 0;
        for (int n : set) A[i++] = n;
        for (int n : A) System.out.print(n + " "); 
    }
}
