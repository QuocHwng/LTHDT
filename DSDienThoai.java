public class DSDienThoai{
        ArrayList<DienThoai>phone;
        public DSDienThoai(){
            phone = new ArrayList<>();
        }
        public void them DSDienThoai(DienThoai h){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap So Luong Dien Thoai Can Them: ");
            int n = sc.nextInt();
            for (int i=0; i<n; i++){
                System.out.println("Nhap Dien Thoai Thu"+(i+1)+":");
                h.nhap();
                phone.add(h);
            }
        }
        public void menuSuaDoi(){
            System.out.println("------------- Moi lua chon -----------"); 
            System.out.println("1. Sua thong tin dien thoai di dong"); 
            System.out.println("2. Xoa dien thoai di dong"); 
            System.out.println("3. Sua thong tin dien thoai thong minh"); 
            System.out.println("4. Xoa dien thoai thong minh"); 
            System.out.println("5. Sua hang ton"); 
            System.out.println("6. Them hang ton"); 
            System.out.println("7. X0a hang ton"); 
            System.out.println("----------- Chon so 0 đe thoat ----------");
        }
        public void SuaDoi(){
            Scanner sc = new Scanner(System.in);
            int n;
            do{
                menuSuaDoi();
                System.out.println("Chon:");
                n = sc.nextInt();
                switch (n){
                    case 1:{
                        Double seri;
                        System.out.println("Nhap so seri cua dien thoai di dong can sua:");
                        sc.nextDouble();
                        seri = sc.nextDouble();
                        suaDienThoaiDiDong(seri);
                        break;
                    }
                    case 2:{
                        Double seri;
                        System.out.println("Nhap so seri cua dien thoai di dong can xoa:");
                        sc.nextDouble();
                        seri = sc.nextDouble();
                        xoaDienThoaiDiDong(seri);
                        break;
                    }
                    case 3:{
                        Double seri;
                        System.out.println("Nhap so seri cua dien thoai thong minh can sua:");
                        sc.nextDouble();
                        seri = sc.nextDouble();
                        suaDienThoaiThongMinh(seri);
                        break;
                    }
                    case 4:{
                        Double seri;
                        System.out.println("Nhap so seri cua dien thoai thong minh can xoa:");
                        sc.nextDouble();
                        seri = sc.nextDouble();
                        xoaDienThoaiThongMinh(seri);
                        break;
                    }
                    case 5:{
                        System.out.println("Nhap so seri cua dien thoai:");
                        sc.nextDouble();
                        Double seri = sc.nextDouble();
                        System.out.println("Nhap ma loai dien thoai ton:");
                        Double maDienThoaiTon = sc.nextDouble();
                        suaHangTon(maDienThoaiTon, seri);
                        break;
                    }
                    case 6:{
                        System.out.println("Nhap so seri cua dien thoai:");
                        sc.nextDouble();
                        Double seri = sc.nextDouble();
                        themHangTon(maDienThoaiTon, seri);
                        break;
                    }
                    case 7:{
                        System.out.println("Nhap so seri cua dien thoai:");
                        sc.nextDouble();
                        Double seri = sc.nextDouble();
                        System.out.println("Nhap ma loai dien thoai ton:");
                        Double maDienThoaiTon = sc.nextDouble();
                        xoaHangTon(maDienThoaiTon, seri);
                        break;
                    }
                    default;
                break;
                }
            }
            while(n!=0);
        }
        public void suaHangTon(Double maDienThoaiTon, seri){
            for(DienThoai x : phone){
                if(((DienThoai)x).getSoSeri().compareTo(seri)==0){
                    for(int i=0; i<((DienThoai)x).getMaDienThoaiTon().size();i++){
                        if((())){
                            (());
                        }
                    }
                }
            }
        }
        public void xoaHangTon(Double maDienThoaiTon, Double seri) {         
            for (DienThoai x : phone) { 
                if ((() x).get().compareTo() == 0) { 
 
                for (int i = 0; i < (() x).get().size(); i++) {                    
                     if (((ThiSinh) x).getNv().get(i).getMaNv() == maNV) { 
                        (() x).get().remove(i); 
                        } 
                    } 
                } 
            } 
        }
        public void themHangTon(Double seri) { 
            for (DienThoai x : phone) {             if (x instanceof ThiSinh) { 
                (() x).nhapDSHangTon(); 
                } 
            } 
        }
        public void suaDienThoaiDiDong(Doublen seri) {         
            for (DienThoai x : phone) {             
                if (x instanceof ThiSinh) { 
                    if (((DienThoaiDiDong) x).getSoSeri().compareTo(seri) == 0) { 
                        x.nhap(); 
                    } 
                } 
            } 
        }
        public void xoaThiSinh(String sbd) {         
            for (Nguoi x : person) {             
                if (x instanceof ThiSinh) { 
                    if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) {                     
                        person.remove(x); 
                    } 
                } 
            } 
        } 
 
    public void suaGiamThi(String maGT) { 
        for (Nguoi x : person) {             if (x instanceof GiamThi) { 
                if (((GiamThi) x).getMaGT().compareTo(maGT) == 0) { 
                    x.nhap(); 
                } 
            } 
        } 
    } 
 
    public void xoaGiamThi(String maGT) { 
        for (Nguoi x : person) {             
            if (x instanceof GiamThi) { 
                if (((GiamThi) x).getMaGT().compareTo(maGT) == 0) {                     
                    person.remove(x); 
                } 
            } 
        } 
    } 
 
    public void hienDSGiamThi(Nguoi a) { 
        System.out.println("----------------------------------------------");          
            for (Nguoi x : person) { 
                if (x instanceof GiamThi) {                 
                    x.hien(); 
            } 
        } 
    } 
 
    public void hienDS(Nguoi a) { 
        System.out.println("----------------------------------------------");         
            for (Nguoi x : person) {             
                x.hien(); 
            } 
    } 
 
    public void hienDSThiSinh(Nguoi a) { 
        System.out.println("----------------------------------------------");         
            for (Nguoi x : person) {             
                if (x instanceof ThiSinh) {                 
                    x.hien(); 
            } 
        } 
    } 
    public void menuChinh() 
    { 
        System.out.println("------CHUONG TRINH QUAN LY KHO DIEN THOAI------"); 
        System.out.println("1. Nhập danh sách thí sinh và nguyện vọng của thí sinh"); 
        System.out.println("2. Nhập danh sách giám thị coi thi"); 
        System.out.println("3. Hiển thị danh sách các hồ sơ dự thi"); 
        System.out.println("4. Hiển thị danh sách các giám thị"); 
        System.out.println("5. Chỉnh sửa thông tin (Thí Sinh, Nguyện Vọng, Giám Thị)"); 
        System.out.println("6. Lưu file đã nhập"); 
        System.out.println("7. Đọc dữ liệu từ file"); 
        System.out.println("8. Hiện ra danh sách trúng tuyển( input: mà ngành, điểm chuẩn)"); 
        System.out.println("9. Sắp xếp danh sách trúng tuyển theo điểm thi giảm dần"); 
        System.out.println("10. Thống kê các giám thị công tác ở Hà Nội"); 
        System.out.println("-----Nhấn phím 0 để thoát chương trình, xin cảm ơn!-----"); 
    } 
}