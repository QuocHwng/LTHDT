package doan;
public class KhoHang{
        private Double maKhoHangDienThoai, soLuong;
        private String ngayNhapKho, ngayXuatKho;
    public HangTon(){

    }
    public HangTon(Double soLuong, Double maKhoHangDienThoai, String ngayNhapKho, String ngayXuatKho)
    {
        this.maKhoHangDienThoai= maKhoHangDienThoai;
        this.soLuong= soLuong;
        this.ngayNhapKho= ngayNhapKho;
        this.ngayXuatKho= ngayXuatKho
    }    
   
    public Double getMaKhoHangDienThoai()
        {
        return maKhoHangDienThoai;
        }
    public void setMaKhoHangDienThoai(Double maDienThoaiTon)
        {
        this.maKhoHangDienThoai = maKhoHangDienThoai;
        }
    public Double getSoLuong()
        {
        return soLuong;
        }
    public void setSoLuong(Double soLuong)
        {
        this.soLuong = soLuong;
        }
    public String getNgayNhapKho()
        {
        return ngayNhapKho;
        }
    public void setNgayNhapKho(String ngayNhapKho)
        {
        this.ngayNhapKho = ngayNhapKho;  
        }
    public String getNgayXuatKho()
        {
        return ngayXuatKho;
        }
    public void setNgayXuatKho(String ngayXuatKho)
        {
        this.ngayXuatKho=ngayXuatKho;
        }
    public void nhapHangTon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma Kho Hang Dien Thoai: ");
        maLoaiDienThoaiTon = sc.nextDouble();
        System.out.println("So Luong: ");
        soLuong = sc.nextDouble();
        System.out.println("Ngay Nhap Kho: ");
        ngayNhapKho = sc.nextLine;
        System.out.println("Ngay Xuat Kho");
        ngayXuatKho = sc.nextLine();
    }
    public void hienHangTon(){
        System.out.println("\nMa Kho Hang Dien Thoai:"+getMaKhoHangDienThoai()+"\nSo Luong"+getSoLuong()+"\nNgay Nhap Kho"+getNgayNhapKho()+"\nNgay Xuat Kho"+getNgayXuatKho())
    }
 }