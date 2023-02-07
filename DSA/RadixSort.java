import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RadixSort {
	
	public static void main(String... args)
	{		
		List<Integer> list = new ArrayList<>();
        Random random = new Random();
		int max = 0;

        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(1000));
        }

		for (Integer integer : list) {
			if(max < integer) max = integer;
		}
        System.out.println(list);
		
		for (int exp = 0; max / (int) Math.pow(10, exp) > 0 ; exp ++) {			
			sort(list, exp);
		}
		
		System.out.println(list);
	}
	
	public static void sort(List<Integer> list, int exp) {
		List<List<Integer>> buckets = new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			buckets.add(new ArrayList<>());
		}
		
		for (Integer num: list) {
			int x = num / (int) Math.pow(10, exp) % 10;
			buckets.get(x).add(num);
		}
		
		list.clear();
		
		for (int i=0; i<10; i++) {
			List<Integer> bucket = buckets.get(i);
			for (Integer num: bucket) {
				list.add(num);
			}
		}
	}

}
