import java.util.*;

public class linkedlist {
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(4);
        ll.add(6);
        ll.add(1);
        ll.add(8);
        // them phan tu 

        ll.addFirst(11);
        ll.addFirst(22);
        // them o dau 

        ll.remove(3);
        // xoa phan tu o vi tri x
    
        ll.removeFirst();
        ll.removeLast();
        // xoa o dau va cuoi

        ll.peekFirst();
        ll.peekLast();
        // lay phan tu cuoi cung va dau tien

        ll.set( 2 , 5);
        // thay the phan tu o vi tri duoc chon 

        System.out.println(ll.size());
        // lay do dai cua linkList

        // ll.clear();
        // xoa tat ca phan tu 

        System.out.println(ll);
    }
}
