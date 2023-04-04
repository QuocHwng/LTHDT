package doan;
import java.util.Scanner;
public class DienThoaiDiDong extends DienThoai
{
    private String loaiBanPhim;

    public DienThoaiDiDong(){

    }
    public DienThoaiDiDong(String loaiBanPhim){
        super(soSeri,mauSac,giaBan,heDieuHanh,thongSoKT);
        this.loaiBanPhim= loaiBanPhim;
    }  
    public String getLoaiBanPhim(){
        return loaiBanPhim;
    }
    public void setLoaiBanPhim(){
        this.loaiBanPhim= loaiBanPhim;
    }
    @Override
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.println("Loai Ban Phim");
        loaiBanPhim= sc.nextLine();
    }
    @Override
    public void hien(){
        super.hien();
        System.out.println("\nloaiBanPhim:"+ getLoaiBanPhim());
        henDSHangTon();
    }
    public void nhapDSKhoHang(){
        Scanner sc = new Scanner(System.in);
        System.out,println("nhap them kho hang: ");

    }
    public void hienThongTinDienThoaiDiDong(){
        super.hien();
        System.out.println("\nSo Seri:"+ getSoSeri()+"\nMau Sac:"+ getMauSac()+"\nGia Ban"+ getGiaBan()+"\nHe Đieu Hanh:"+ getHeDieuHanh()+"\nThong So Ky Thuat:"+ getThongSoKT()+"\nLoai Ban Phim"+ getLoaiBanPhim());
    }
}