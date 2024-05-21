import java.util.*;

public class treeset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> Treeset = new TreeSet<>();

        Treeset.add(4);
        Treeset.add(5);
        Treeset.add(9);
        Treeset.add(1);
        Treeset.add(6);
        System.out.println("Cac phan tu la:");
        System.out.println(Treeset);
        System.out.println("nhap phan tu can them:");
        int number = sc.nextInt();
        if(Treeset.contains(number)){
            Treeset.add(number);
            System.out.println("them thanh cong");
            System.out.println("cac phna tu trong treeset sau khi them:");
            System.out.println(Treeset);   
        }else{
            System.out.println("phan thu" +  number  +  "da ton tai");
        }

    }
}