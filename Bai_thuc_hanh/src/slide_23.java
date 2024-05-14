import java.util.*;

public class slide_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Nhap so phan tu : ");
        int n = sc.nextInt();
        for(int i = 0;i < n; ++i){
            System.out.print("Phan tu thu " + (i + 1) + " : ");
            int num = sc.nextInt();
            arr.add(num);
        }
        int maxV = Integer.MIN_VALUE;
        for(int i = 0;i < n; ++i){
            if(arr.get(i) > maxV)
                maxV = arr.get(i);
        }
        System.out.println("Phan tu lon nhat la : " + maxV);
    }
}