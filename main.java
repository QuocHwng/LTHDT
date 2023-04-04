package doan;
public class Main {     
        public static void main(String[] args) {        
            QuanLy a= new QuanLy(); 
            Nguoi b;         int n; 
            Scanner sc= new Scanner(System.in); 
            do { 
                a.menuChinh();             
                System.out.print("Lựa chọn: "); 
                n= sc.nextInt(); 
                switch(n)             
                {                 
                    case 1: { 
                    b= new ThiSinh(); 
                    a.themDSNguoi(b); 
                    break;                 
                    }                 
                    case 2: { 
                    b= new GiamThi(); 
                    a.themDSNguoi(b); 
                    break;                 
                    }                 
                    case 3: { 
                    a.hienDSHoSoThiSinh(); 
                    break;                 
                    }                 
                    case 4: { 
                    a.hienDSGiamThi(); 
                    break; 
                    }                 
                case 5: { 
                    a.SuaDoi();                     
                    break;                 
                    }                 
                    case 6: { 
                    String tenfile; 
                    System.out.print("Nhập tên file muốn lưu: "); 
                    sc.nextLine();                     
                    tenfile = sc.nextLine();                     
                    a.ghiFile(tenfile); 
                    break;                 
                    }                 
                    case 7: { 
                    String tenfile; 
                    System.out.print("Nhập tên file muốn đọc: "); 
                    sc.nextLine();                     
                    tenfile = sc.nextLine();                     
                    a.docFile(tenfile); 
                    break;                 
                    }                 
                    case 8: { 
                    System.out.print("Nhập mã ngành: ");                     
                    sc.nextLine(); 
                    String maNganh = sc.nextLine();                     
                    System.out.print("Nhập điểm chuẩn: ");                     
                    float diemChuan = sc.nextFloat(); 
                    a.hienDSTrungTuyen(maNganh, diemChuan);                     
                    break;                 
                    }                 
                    case 9: { 
                    System.out.println("-------------------------------");                     
                    a.SapXepTheoDiem(); 
                    break; 
                    }                 
                    case 10: { 
                    a.hienGiamThioHaNoi(); 
                    break;                 }                 
                    default:                     
                    break; 
            } 
        } 
        while(n!=0); 
    }