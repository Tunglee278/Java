package Lab4;

import java.util.*;
public class Bai2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> link = new LinkedList<>();
        System.out.print("nhap so phan tu:");
        int n = sc.nextInt();
        int tmp = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.println("nhap phan tu thu " + (i+1) + ":");
            int num = sc.nextInt();
            link.add(num);
            if (num % 2 ==0){
                ++tmp;
                sum += num;

            }
        }
        System.out.println("phan tu trong LinkedList la:");
        System.out.println(link);
        double tbc = (double)sum/tmp;
        System.out.println("trung binh cong cua cac so chan la:");
        System.out.println(tbc);
    
    }
}