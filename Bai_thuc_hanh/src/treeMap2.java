import java.util.*;
public class treeMap2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, String> tree = new TreeMap();
        tree.put("France", "Paris");
        tree.put("Germany", "Berlin");
        tree.put("Japan", "Tokyo");
        tree.put("Canada", "Ottawa");
        tree.put("Brazil", "Brasilia");
        tree.put("India", "New Delhi");
       System.out.println("cac phan tu co trong treemap:");
       Set<Map.Entry<String, String>> setTreeMap = tree.entrySet();
       System.out.println(setTreeMap);
       tree.replace("Japan", "VietNam");
       tree.replace("France", "Paris", "TungLe");
       System.out.println("cac phan tu trong TreeMap sau khi thay the:");
       setTreeMap = tree.entrySet();
       System.out.println(setTreeMap);
    }
}