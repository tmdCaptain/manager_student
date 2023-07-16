package QuanLySinhVien;
import java.util.ArrayList;
import java.util.Scanner;

public class TestSinhVien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> a = new ArrayList<SinhVien>();
		SinhVien x;
		int chon;
		String tt = "end";
		do {
			
			System.out.println("---------Mời bạn chọn-----------");
			System.out.println("----1.Nhập danh sách sinh viên----");
			System.out.println("----2.Hiển thị thông tin sinh viên---- ");
			System.out.println("----3.Hiển thị các sinh viên không có học bổng----");
			System.out.println("----4.Hiển thị các sinh viên có học lực loại giỏi----");
			System.out.println("----5.Những học sinh phải học lại----");
			System.out.println("----6.Xóa một sinh viên theo mã sinh viên----");
			System.out.println("----7.Tìm sinh viên theo tên sinh viên----");
			System.out.println("----8.Tìm sinh viên theo mã sinh viên----");
			System.out.println("----9.Hiển thị các sinh viên là nam----");
			System.out.println(" Nhập lựa chọn của bạn");
			chon = sc.nextInt();
			switch(chon) {
				case 1:
					System.out.println(" Nhập thông tin cho sinh viên");
					do {
						x = new SinhVien();
						x.nhapTT();
						sc.nextLine();
						a.add(x);
						System.out.println(" Nhập end để kết thúc nhập");
						tt = sc.nextLine();
					}while(!tt.equals("end"));
					break;
				case 2:
					
					for(SinhVien s : a) {
						System.out.println(" Thông tin của sinh viên " + s.getHoTen());
						s.xuatThongTin();
					}
					break;
					
				case 3:
					System.out.println(" Những sinh viên không có học bổng");
					for(SinhVien s : a) {
						if(s.getDiemThuongKy()>4&&s.getDiemCuoiKy()>4&&s.diemTrungBinh()<8) {
							System.out.println(" Thông tin của sinh viên " + s.getHoTen());
							s.xuatThongTin();
						}
						else if(s.getDiemThuongKy()<4&&s.getDiemCuoiKy()<4)
							System.out.println(" Thông tin của sinh viên " + s.getHoTen());
							s.xuatThongTin();
					}
					break;
					
				case 4:
					
					System.out.println(" Những sinh viên có học lực loại giỏi");
					for(SinhVien s : a) {
						if(s.diemTrungBinh()>=9)
							System.out.println(" Thông tin của sinh viên " + s.getHoTen());
							s.xuatThongTin();
					}
					break;
				case 5:
					System.out.println(" Các học sinh phải học lại");
					for (SinhVien s : a) 
					{
						if(s.diemTrungBinh()<=4)
							System.out.println(" Thông tin của sinh viên " + s.getHoTen());
							s.xuatThongTin();
				    }
					break;
				case 6:
					System.out.println("Nhập mã số sinh viên cần xóa: ");
					int mscx = sc.nextInt();
					for (int i = 0; i < a.size(); i++) {
					    if (a.get(i).getMaSV()==mscx) {
					    	a.remove(i);
					    	System.out.println(" Xóa thành công!");
					    }
					    else {
					    System.out.println(" Không hợp lệ!");
					    }
					}
					
					break;
					
				case 7:
					sc.nextLine();
					System.out.println("Nhập tên sinh viên cần tìm: ");
					String ten = sc.nextLine();
					for (int i = 0; i < a.size(); i++) {
					    if (a.get(i).getHoTen().equals(ten)) {
					        a.get(i).xuatThongTin();
					    }
					    else
					    	System.out.println(" Không tồn tại!!");
					}
					
					break;
					
				case 8:
					
					System.out.println("Nhập mã sinh viên cần tìm: ");
					int msct = sc.nextInt();
					for (int i = 0; i < a.size(); i++) {
					    if (a.get(i).getMaSV()==msct) {
					        a.get(i).xuatThongTin();
					    }
					    else
					    	System.out.println(" Không tồn tại!!");
					}
					
					break;
				case 9:
					
					System.out.println(" Những sinh viên có giới tính là Nam");
					for(SinhVien s : a) {
						if(s.isGioiTinh()==true)
							s.xuatThongTin();
					}
					
					break;
					
				default:
					System.out.println(" Thoát chương trình");
			}
		}while(chon<=9);
	}

}
