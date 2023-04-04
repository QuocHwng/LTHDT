package doan;
public class QuanLy{

    ArrayList<Nguoi> person; 
    ArrayList<ThiSinh> dsTrungTuyenNganh; 
    ArrayList<NguyenVong> nvTrungTuyen; 
 
    public QuanLy() { 
        person = new ArrayList<>(); 
    } 
 
    public void themDSNguoi(Nguoi a) {         
        Scanner sc = new Scanner(System.in);         
        System.out.print("Nhập số lượng cần thêm: "); 
        int n = sc.nextInt();         
        for (int i = 0; i < n; i++) { 
            System.out.println("Lần nhập thứ " + (i + 1) + ": ");             
            if (a instanceof ThiSinh) {                 
                a = new ThiSinh();                 
                a.nhap(); 
            } 
            else if (a instanceof GiamThi) {                 
                a = new GiamThi();                 
                a.nhap();             
                } 
            person.add(a); 
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
            System.out.println("7. Xoa hang ton"); 
            System.out.println("----------- Chon so 0 đe thoat ----------");
        } 
 
    public void SuaDoi() { 
        Scanner sc = new Scanner(System.in);         
        int n; 
        do { 
            menuSuaDoi(); 
            System.out.print("Chọn: "); 
            n = sc.nextInt();             
            switch (n) {                 
                case 1: {                     
                    String sbd; 
                    System.out.print("Nhập SBD của thí sinh cần sửa: ");                     
                    sc.nextLine();                     
                    sbd = sc.nextLine();                     
                    suaThiSinh(sbd); 
                    break;                 
                    }                 
                    case 2: {                     
                        String sbd; 
                    System.out.print("Nhập SBD của thí sinh cần sửa: ");                     
                    sc.nextLine();                     
                    sbd = sc.nextLine();                     
                    xoaThiSinh(sbd); 
                    break;                 
                    }                 
                    case 3: {                     
                        String maGT; 
                    System.out.print("Nhập mã giám thị cần sửa thông tin: ");                     
                    sc.nextLine();                     
                    maGT = sc.nextLine(); 
                    suaGiamThi(maGT);                     
                    break;              
                    }                 
                    case 4: {                     
                        String maGT; 
                    System.out.print("Nhập mã giám thị cần sửa thông tin: ");                     
                    sc.nextLine();                     
                    maGT = sc.nextLine(); 
                    xoaGiamThi(maGT); 
                    break;                 
                    }                 
                    case 5: { 
                    System.out.println("Nhập SBD của thí sinh: ");                     
                    sc.nextLine(); 
                    String sbd = sc.nextLine(); 
                    System.out.println("Nhập mã nguyện vọng"); 
                    int maNv = sc.nextInt();                     
                    suaNguyenVong(maNv, sbd); 
                    break;                 
                    }                 
                    case 6: { 
                    System.out.println("Nhập SBD của thí sinh: ");                     
                    sc.nextLine(); 
                    String sbd = sc.nextLine(); 
                    themNguyenVong(sbd); 
                    break;                 
                    }                 
                    case 7: { 
                    System.out.println("Nhập SBD của thí sinh: ");                     
                    sc.nextLine(); 
                    String sbd = sc.nextLine(); 
                    System.out.println("Nhập mã nguyện vọng"); 
                    int maNv = sc.nextInt();                     
                    xoaNguyenVong(maNv, sbd);                     
                    break;                 
                    }                 
                    default:                     
                    break; 
            } 
 
        } 
        while (n != 0); 
    } 
 
    public void suaNguyenVong(int maNV, String sbd) {         
        for (Nguoi x : person) { 
            if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) { 
                for (int i = 0; i < ((ThiSinh) x).getNv().size(); i++) {                     
                    if (((ThiSinh) x).getNv().get(i).getMaNv() == maNV) { 
                        ((ThiSinh) x).getNv().get(i).nhapNguyenVong(); 
                    } 
                } 
            } 
        } 
    } 
 
    public void xoaNguyenVong(int maNV, String sbd) {         
        for (Nguoi x : person) { 
            if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) { 
                for (int i = 0; i < ((ThiSinh) x).getNv().size(); i++) {                     
                    if (((ThiSinh) x).getNv().get(i).getMaNv() == maNV) { 
                        ((ThiSinh) x).getNv().remove(i); 
                    } 
                } 
            } 
        } 
    } 
 
    public void themNguyenVong(String sbd) { 
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) { 
                ((ThiSinh) x).nhapDSNguyenVong(); 
            } 
        } 
    } 
 
    public void suaThiSinh(String sbd) {         
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) { 
                if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) { 
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
        for (Nguoi x : person) {             
            if (x instanceof GiamThi) { 
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
 
    public void hienDSGiamThi() { 
        System.out.println("----------------------------------------------");         
        for (Nguoi x : person) { 
            if (x instanceof GiamThi) {                 
                x.hien(); 
            } 
        } 
    } 
 
    public void hienDS() { 
        System.out.println("----------------------------------------------");         
        for (Nguoi x : person) {             
            x.hien(); 
        } 
    } 
 
    public void hienDSHoSoThiSinh() { 
        System.out.println("----------------------------------------------");         
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) { 
                ((ThiSinh) x).hien(); 
            } 
        } 
    } 
 
    public void hienDSThiSinh() { 
        System.out.println("----------------------------------------------");         
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) {                 
                x.hien(); 
            } 
 
        } 
    } 
 
    public void ghiFile(String fileName) {         
        try { 
            FileOutputStream fileOut = new FileOutputStream(fileName);             
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);             
            objOut.flush();             
            objOut.writeObject(person); 
            objOut.close();             
            fileOut.close(); 
            System.out.println("Luu file thanh cong, ten file: " + fileName); 
        } 
        catch (Exception ex) { 
            ex.printStackTrace(); 
 
        } 
    } 
 
    public void docFile(String fileName) {         
        try { 
            person = new ArrayList<>(); 
            FileInputStream fin = new FileInputStream(fileName);             
            ObjectInputStream fout = new ObjectInputStream(fin); 
            person = (ArrayList) fout.readObject();             
            hienDS();             
            fin.close(); 
            fout.close(); 
 
        } catch (FileNotFoundException e) { 
            System.out.print("\nKhong thay file.\n"); 
        } 
        catch (Exception ex) {             
            ex.printStackTrace(); 
        } 
    } 
 
    public void hienDSTrungTuyen(String maNganh, float diemChuan) {         
        dsTrungTuyenNganh = new ArrayList<>();         
        nvTrungTuyen= new ArrayList<>(); 
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) { 
                for (int i = 0; i < ((ThiSinh) x).getNv().size(); i++) {                     
                    if (((ThiSinh) x).getNv().get(i).getMaNganh().compareTo(maNganh) == 0 && ((ThiSinh) x).getNv().get(i).getDiemXetTuyen() >= diemChuan) { 
                        ((ThiSinh) x).hienThongtinTS(); 
                        ((ThiSinh) x).getNv().get(i).hienNguyenVong();                         
                        dsTrungTuyenNganh.add((ThiSinh) x);                         
                        nvTrungTuyen.add(((ThiSinh) x).getNv().get(i)); 
                    } 
                } 
            } 
        } 
    } 
    public void hienDSTTNganh() 
    { 
        for(NguyenVong x: nvTrungTuyen) 
        { 
            x.hienNguyenVong(); 
        } 
    } 
    public void SapXepTheoDiem() 
    {    
        Collections.sort(nvTrungTuyen, new SapXepTheoDiemThi());         
        System.out.println("Danh sach trung tuyen sau khi sap xep");         
        hienDSTTNganh(); 
    } 
 
    public void hienGiamThioHaNoi() { 
        for (Nguoi x : person) {             
            if (x instanceof GiamThi && ((GiamThi) x).getQueQuan().equalsIgnoreCase("Ha Noi") == true) { 
                x.hien(); 
            } 
        } 
 
    } 
 
    public void menuChinh() { 
        System.out.println("------CHUONG TRINH QUAN LY KHO------"); 
        System.out.println("1. Nhap danh sach dien thoai di dong và hang ton cua dien thoai di dong"); 
        System.out.println("2. Nhập danh sách dien thoai thong minh va hang ton cua dien thoai thong minh "); 
        System.out.println("3. Hien thi danh sach cac dien thoai di dong"); 
        System.out.println("4. Hien thi danh sach cac dien thoai thong minh"); 
        System.out.println("5. Chinh sua thong tin (Dien Thoai Di Dong, Dien Thoai Thong Minh, Hang Ton)"); 
        System.out.println("6. Luu file đa nhap"); 
        System.out.println("7. Doc du lieu tu file"); 
        System.out.println("8. Hien ra danh sach ( input: mã ngành, điểm chuẩn)"); 
        System.out.println("9. Sắp xếp danh sách trúng tuyển theo điểm thi giảm dần( Sau khi chay chuc nang 8"); 
        System.out.println("10. Thống kê các giám thị quê quán ở Hà Nội"); 
        System.out.println("-----Nhấn phím 0 để thoát chương trình, xin cảm ơn!-----"); 
    } 
} 