package BaiKiemTra.src;

import java.util.*;
public class LTT111Person2{
    Scanner sc = new Scanner(System.in);
    class Person{
        public String name;
        public Integer id;
        public Double mark;
   
     public void Nhap(){ 
     System.out.println("nhap ten:");
     name = sc.nextLine();
     System.out.println("nhap id:");
     id = sc.nextInt();
     System.out.println("nhap diem: ");
     mark = sc.nextDouble();
     }
   public void Xuat(){
    System.out.println("in ten:" + name);
    System.out.println("in id:" + id);
    System.out.println("in diem" + mark);
   }
}
}
