import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i <= 6; i++) {
            map.put(i, scan.nextLine());
        } 
        whileLoop(map);
        enhancedForLoop(map);
        scan.close();
    }
    private static void whileLoop(Map<Integer,String> map) {
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        System.out.println("While loop: ");
        while(itr.hasNext()) {
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    private static void enhancedForLoop(Map<Integer,String> map) {
        System.out.println("enhanced for loop: ");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        } 
    }
}