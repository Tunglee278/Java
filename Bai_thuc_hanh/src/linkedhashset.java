import java.util.*;

public class linkedhashset{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> linkedHashset = new LinkedHashSet<>();
        linkedHashset.add(1);
        linkedHashset.add(3);
        linkedHashset.add(5);
        linkedHashset.add(6);
        linkedHashset.add(8);
        System.out.println("nhap phan  tu ban muon xoa:");
        int number = sc.nextInt();
        System.out.println("HashSet truoc khi xoa:" + linkedHashset);
        if (linkedHashset.contains(number)){
            linkedHashset.remove(number);
            System.out.println("HashSet sau khi xoa la:" + linkedHashset);
        }else{
            System.out.println("khong co phan tu trong hashset");
        }

    }
}