package Lab4;

import java.util.*;
public class Bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("so phan tu ban muon nhap la:");
      int n = sc.nextInt();
      for(int i = 0; i < n; ++i){
        int num = sc.nextInt();
        arr.add(num);
      }
      int MaxV = -1;
      for(int value : arr)
      MaxV = Math.max(MaxV , value);
      System.out.println("gia tri lon nhat la:");
      System.out.println(MaxV);

      ArrayList<Integer> array = new ArrayList<>();
      System.out.println("gia tri muon xoa la:");
      int num = sc.nextInt();
      array.add(num);
      arr.removeAll(array);

      Collections.sort(arr);
      System.out.println(arr);


    }
}