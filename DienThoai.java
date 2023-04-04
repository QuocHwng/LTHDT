package doan;
import java.util.Scanner;
public class DienThoai {
        private double soSeri, giaBan;
        private String mauSac, heDieuHanh, thongSoKT;
    public DienThoai()
    {

    }
    public DienThoai(Double soSeri, String mauSac, Double giaBan, String heDieuHanh, String thongSoKT)
    {
        this.soSeri = soSeri;
        this.mauSac = mauSac;
        this.giaBan = giaBan;
        this.heDieuHanh = heDieuHanh;
        this.thongSoKT = thongSoKT;
    }
    
    public double getSoSeri() 
    { 
        return soSeri; 
    } 
 
    public void setSoSeri(Double soSeri) 
    { 
        this.soSeri = soSeri; 
    } 
    
    public String getMauSac() { 
        return mauSac; 
    } 
 
    public void setMauSac(String mauSac  ) 
    { 
        this.mauSac = mauSac; 
    } 
    public double getGiaBan() 
    { 
        return giaBan; 
    } 
 
    public void setGiaBan(Double giaBan ) 
    { 
        this.giaBan = giaBan; 
    } 
    public String getHeDieuHanh() { 
        return heDieuHanh; 
    } 
 
    public void setHeDieuHanh(String heDieuHanh ) 
    { 
        this.heDieuHanh = heDieuHanh; 
    } 
    public String getThongSoKT() { 
        return thongSoKT; 
    } 
 
    public void setThongSoKT(String thongSoKT ) 
    { 
        this.thongSoKT = thongSoKT; 
    }
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("So Seri");
        soSeri=sc.nextDouble();
        System.out.println("Mau Sac");
        mauSac=sc.nextLine();
        System.out.println("Gia Ban");
        giaBan=sc.nextDouble();
        System.out.println("He Đieu Hanh");
        heDieuHanh=sc.nextLine();
        System.out.println("Thong So Ky Thuat");
        thongSoKT=sc.nextLine();

    }
    public void hien()
    {
        System.out.println("\nSo Seri:"+ getSoSeri()+"\nMau Sac:"+ getMauSac()+"\nGia Ban"+ getGiaBan()+"\nHe Đieu Hanh:"+ getHeDieuHanh()+"\nThong So Ky Thuat:"+ getThongSoKT());
    }
}    