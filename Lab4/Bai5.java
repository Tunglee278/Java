package Lab4;
import java.util.*;

class sinhvien{
    public String id, name, svclass;
    public Scanner sc = new Scanner(System.in);

    public sinhvien(){

    }

    public void Nhap(){
        sc.nextLine();
        System.out.print("Nhap ma sinh vien : ");
        id = sc.nextLine();
        System.out.print("Nhap ten sinh vien : ");
        name = sc.nextLine();
        System.out.print("Nhap lop sinh vien : ");
        svclass = sc.nextLine();
    }

    public void In(){
        System.out.println("Id : " + id);
        System.out.println("Name :" + name);
        System.out.println("Class : " + svclass);
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So sinh vien ban muon nhap la : ");
        ArrayList<sinhvien> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i < n; ++i){
            sinhvien svien = new sinhvien();
            svien.Nhap();
            arr.add(svien);
        }

        System.out.print("Ten lop ban muon nhap : ");
        String tenLop = sc.nextLine();
        System.out.println("Nhung sinh vien thuoc lop " + tenLop + " la : ");
        for(sinhvien sv : arr){
            if(sv.svclass.equals(tenLop))
                System.out.println(sv.name);
        }

        System.out.print("Ma sinh vien ban muon nhap : ");
        String maSv = sc.nextLine();
        System.out.print("Ten va lop cua sinh vien voi ma sinh vien " + maSv + " la : ");
        for(sinhvien sv : arr){
            if(sv.id.equals(maSv))
                System.out.println(sv.name + ", " + sv.svclass);
        }
    }
}