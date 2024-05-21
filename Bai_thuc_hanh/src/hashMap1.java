import java.util.*;

public class hashMap1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(1, 2);
        hash.put(3, 5);
        hash.put(4, 6);
        hash.put(7, 9);
        hash.put(5, 8);
        Set<Map.Entry<Integer, Integer>> setHashMap = hash.entrySet();

        System.out.println("cac entry co trong setHashMap: ");
        System.out.println(setHashMap);

    }
}
