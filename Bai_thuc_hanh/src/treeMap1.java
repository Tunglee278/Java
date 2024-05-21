import java.util.*;

import javax.swing.RowFilter.Entry;
public class treeMap1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> hash = new TreeMap<>();
        hash.put(1, "apple");
        hash.put(2,"mango");
        hash.put(3, "orange");
        hash.put(4,"grape");
        hash.put(5, "pandan");
        hash.put(6,"peach");
        Set<Map.Entry<Integer, String>> setTreeMap = hash.entrySet();
        System.out.println("cac entry co trong setTreemMap:");
        System.out.println(setTreeMap);


        
    }
}