package doan;
import java.util.Scanner;
public class DienThoaiThongMinh extends DienThoai{
    private String loaiManHinh, caMera, loaiTanNhiet, tinhNangDacBiet;
    
    public DienThoaiThongMinh(){
        super();
    }
    public DienThoaiThongMinh(String loaiManHinh, String caMera, String loaiTanNhiet, String tinhNangDacBiet){
        super(soSeri, mauSac, giaBan, heDieuHanh, thongSoKT);
        this.loaiManHinh= loaiManHinh;
        this.caMera= caMera;
        this.loaiTanNhiet= loaiTanNhiet;
        this.tinhNangDacBiet= tinhNangDacBiet;
    }
    public String getLoaiManHinh(){
        return loaiManHinh;
    }
    public void setLoaiManHinh(){
        this.loaiManHinh= loaiManHinh;
    }
    public String getCamera(){
        return caMera;
    }
    public void setCamera(){
        this.caMera= caMera;
    }
    public String getLoaiTanNhiet(){
        return loaiTanNhiet;
    }
    public void setLoaiTanNhiet(){
        this.loaiTanNhiet= loaiTanNhiet;
    }
    public String getTinhNangDacBiet(){
        return tinhNangDacBiet;
    }
    public void setTinhNangDacBiet(){
        this.tinhNangDacBiet= tinhNangDacBiet;
    }
    @Override
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.println("Loai Man Hinh");
        loaiManHinh= sc.nextLine();
        System.out.println("Camera");
        caMera= sc.nextLine();
        System.out.println("Loai Tan Nhiet");
        loaiTanNhiet= sc.nextLine();
        System.out.println("Tinh Nang Dac Biet");
        tinhNangDacBiet= sc.nextLine();
    }
    @Override
    public void hien()
    {
        super.hien();
        System.out.println("\nLoai Man Hinh:"+ getLoaiManHinh()+"\nCamera"+ getcaMera()+"\nLoai Tan Nhiet"+ getLoaiTanNhiet()+"\nTinh Nang Dac Biet"+ getTinhNangDacBiet());
    }

    {

    }
    public void hienThongTinDienThoaiThongMinh(){
        System.out.println("\nSo Seri:"+ getSoSeri()+"\nMau Sac:"+ getMauSac()+"\nGia Ban"+ getGiaBan()+"\nHe Đieu Hanh:"+ getHeDieuHanh()+"\nThong So Ky Thuat:"+ getThongSoKT()+ "\nLoai Man Hinh"+ getLoaiManHinh()+"\nCamera"+ getCamera()+"\nLoai Tan Nhiet"+ getLoaiTanNhiet()+"\nTinh Nang Dac Biet"+ getTinhNangDacBiet());
    }
}