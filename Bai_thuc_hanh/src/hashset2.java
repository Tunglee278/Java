import java.util.*;

public class hashset2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        
        hashSet.add("Tung");
        hashSet.add("Linh");
        hashSet.add("Ly");
        hashSet.add("An");
        hashSet.add("Hoang");
        // them cac phan tu vao HashSet
        System.out.println("cac phan tu trong hashSet la:");
        System.out.println(hashSet);
        System.out.println("nhap phan tu can xoa:");
        String name = sc.nextLine();
        if (hashSet.contains(name)){
            hashSet.remove(name);
            System.out.println("da xoa thang cong");
            System.out.println("cac phan tu con lai trong hashSet:");
            System.out.println(hashSet);
        }else{
            System.out.println("xoa that bai");
        }
    }
}