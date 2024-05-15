 import java.util.*;

 public class hashset{
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     HashSet<Integer> hashSet = new HashSet<>();
      
     hashSet.add(2);
     hashSet.add(3);
     hashSet.add(4);
     hashSet.add(5);
     hashSet.add(6);
     // them phan tu 

     System.out.println(" cac phan tu trong hashSet la:");
     System.out.println(hashSet);
     System.out.println("nhap phan tu can them:");
     int number = sc.nextInt();
     if (hashSet.contains(number)){
        hashSet.add(number);
        System.out.println("them thanh cong");
        System.out.println("cac phan tu trong hashSet sau khi them:");
        System.out.println(hashSet);
     }else{
        System.out.println("phan tu " + number + " da ton tai");
     }

 }
 }
 

