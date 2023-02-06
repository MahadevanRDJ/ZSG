import java.util.*;

public class BucketSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(1000));
        }
        System.out.println(list);

        int bucket = list.size(), max = 0, digit = 0;
        for (Integer integer : list) {
            if(max < integer) max = integer;
        }
        
        while(max > 0 && ++digit > 0) max /= 10;
        
        sort(list, bucket, digit);
        System.out.println(list);
        
    }

    private static void sort(List<Integer> list, int bucket, int digit) {
        List<List<Integer>> buckets = new ArrayList<>();
        int place = 0, exp = (int) Math.pow(10, digit);
        for (int i = 0; i < bucket; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i = 0; i < list.size(); i++) {
            place = (bucket * list.get(i)) / exp;
            insert(buckets.get(place),list.get(i));
        }
        list.clear();

        for (int i = 0; i < bucket; i++) {
            List<Integer> chunk = buckets.get(i);
            for (Integer integer : chunk) {
                list.add(integer);
            }
        }
    }

    private static void insert(List<Integer> chunk, int data) {
        if(chunk.isEmpty()) chunk.add(data);
        else {
            int i = 0;
            for (Integer integer : chunk) {
                if(data < integer) break;
                ++i;
            }
            chunk.add(i, data);
        }
    }
}
