package Lab4;

import java.util.*;
public class Bai4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hash = new HashSet<>();
        System.out.print("so trai cay can nhap:");
        int n =sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.print("loai trai cay thu:" + (i+1) + "la:");
            String tenTraiCay = sc.nextLine();
            hash.add(tenTraiCay);
        }
        System.out.println("tong so trai cay vua nhap la:" + hash.size());
        System.out.println("loai trai cay ban muon kiem tra la:");
        String loaiMuonKiemTra = sc.nextLine();
        boolean check = true;
        for(String traicay : hash){
            if(traicay.equals(loaiMuonKiemTra)){
                check = false;
                break;
            }
        }
        if(check)
        System.out.println("khong tim thay loai trai cay nay");
        else
        System.out.println("da tim thay loai trai cay nay ");
        Random random = new Random();
        int randomNumber = sc.nextInt((hash.size() - 1));
        int cnt = 0;
        for(String ten : hash){
            if(cnt == randomNumber)
            hash.remove(ten);
            ++cnt;
        }
        System.out.println("danh sach cac loai trai cay la:");
        for(String ten : hash)
        System.out.print(ten + " ");

        List<String> list = new ArrayList<>(hash);
        for(String ten : list){
            hash.add(ten);
        }
        Iterator<String> iterator = hash.iterator();
        System.out.println("cac loai trai cay la:");
        while (iterator.hasNext())
         System.out.println(iterator.next() + " ");
         hash.removeAll(list);
         for(String ten : hash)
          System.out.print(ten + " ");
    }
}