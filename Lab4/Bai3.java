package Lab4;
import java.util.*;

class SinhVien{
    public String name;
    public double mark;
    public Scanner sc = new Scanner(System.in);

    public SinhVien(){
        this.name = "Le Tung";
        this.mark = 6.1;
    }

    public SinhVien(String name, double mark){
        this.name = name;
        this.mark = mark;
    }

    public boolean thiLai(){
        return this.mark <= 5;
    }

    public void In(){
        System.out.println("\nName : " + name);
        System.out.println("Mark : " + mark);
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<SinhVien> ll = new LinkedList<>();
        while(true){
            System.out.print("Nhap ten sinh vien : ");
            String name = sc.nextLine();
            if(name.equals(""))
                break;
            System.out.print("Nhap diem sinh vien : ");
            double mark = sc.nextDouble();
            SinhVien sv = new SinhVien(name , mark);
            ll.add(sv);
            sc.nextLine();
        }

        System.out.print("Danh sach sinh vien thi lai : ");
        boolean check = true;
        for(SinhVien sv : ll){
            if(sv.thiLai()){
                check = false;
                sv.In();
            }
        }
        if(check)
            System.out.println("0");

        double highestMark = -1;
        for(SinhVien sv : ll)
            highestMark = Math.max(highestMark , sv.mark);

        System.out.print("Danh sach sinh vien co diem cao nhat : ");
        for(SinhVien sv : ll)
            if(sv.mark == highestMark)
                sv.In();
        System.out.print("Nhap ten sinh vien muon tim : ");
        String tenMuonTim = sc.nextLine();
        SinhVien sinhVien = new SinhVien();
        check = true;
        for(SinhVien sv : ll){
            if(sv.name.equals(tenMuonTim)){
                sinhVien = new SinhVien(sv.name, sv.mark);
                check = false;
            }
        }
        if(check)
            System.out.println("Thong tin khong trung khop");
        else{
            System.out.println("Thong tin sinh vien ban muon tim la : ");
            sinhVien.In();
        }
    }
}