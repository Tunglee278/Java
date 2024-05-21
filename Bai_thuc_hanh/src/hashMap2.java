import java.util.*;
public class hashMap2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "Dog");
        hash.put(2, "Cat");
        hash.put(3, "Mouse");
        hash.put(4, "Bird");
        hash.put(5, "Lion");
        System.out.println("cac key va value trong HashMap:");
        Set<Map.Entry<Integer, String>> sethashmap = hash.entrySet();
        System.out.println(sethashmap);
        System.out.println("1:" + hash.get("1"));
        System.out.println("7:" + hash.get("7"));
        if(hash.containsValue("Bird")){
            System.out.println("da xuat hien value trong map");
        }
    }
}