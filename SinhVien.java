package QuanLySinhVien;

import java.util.Scanner;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private int namSinh;
	private boolean gioiTinh;
	private String noiSinh;
	private double diemThuongKy;
	private double diemCuoiKy;
	
	public SinhVien() {

	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getDiemThuongKy() {
		return diemThuongKy;
	}

	public void setDiemThuongKy(double diemThuongKy) {
		this.diemThuongKy = diemThuongKy;
	}

	public double getDiemCuoiKy() {
		return diemCuoiKy;
	}

	public void setDiemCuoiKy(double diemCuoiKy) {
		this.diemCuoiKy = diemCuoiKy;
	}
	
//	Method dùng để tính điểm trung bình của sinh viên
	public double diemTrungBinh() {
		return (this.getDiemThuongKy() * 60 + this.getDiemCuoiKy() * 40)/100;
	}
	
//	Method dùng để xét học lực cho sinh viên
	
	public void hocLuc() {
		if(this.diemTrungBinh()<10 || this.diemTrungBinh() >=9)
			System.out.println(" Học Lực Giỏi ");
		else if(this.diemTrungBinh()>=8 || this.diemTrungBinh()<=9)
			System.out.println(" Học Lực Khá");
		else if(this.diemTrungBinh()>=6.5||this.diemTrungBinh()<=8)
			System.out.println(" Học lực Trung Bình");
		else if(this.diemTrungBinh()>=4 || this.diemTrungBinh()<=6.5)
			System.out.println(" Học Lực Yếu");
		else
			System.out.println(" Rớt Môn");
	}
	
//	Method dùng để xét học bổng cho sinh viên
	
	public void hocBong() {
		if(this.diemThuongKy>4&&this.diemCuoiKy>4&&this.diemTrungBinh()>=9)
			System.out.println(" Học Bổng Loại Giỏi");
		else if(this.diemThuongKy>4&&this.diemCuoiKy>4&&this.diemTrungBinh()>=8)
			System.out.println(" Học Bổng Loại Khá");
		else if(this.diemThuongKy>4&&this.diemCuoiKy>4&&this.diemTrungBinh()<8)
			System.out.println(" Không Có Học Bổng");
		else if(this.diemThuongKy<4&&this.diemCuoiKy<4)
			System.out.println(" Không có học bổng");
	}
	
//	Method để nhập thông tin
	
	public void nhapTT() {
		Scanner sc = new Scanner(System.in); 
		System.out.println(" Nhập mã số sinh viên: ");
		this.maSV = sc.nextInt();
		sc.nextLine();
		System.out.println(" Nhập họ tên của sinh viên: ");
		this.hoTen = sc.nextLine();
		System.out.println(" Nhập năm sinh của sinh viên: ");
		this.namSinh = sc.nextInt();
		System.out.println(" Nhập giới tính của sinh viên nam thì "
				+ "nhập true nữ thì nhập fasle: ");
		this.gioiTinh = sc.nextBoolean();
		System.out.println(" Nhập nơi sinh của sinh viên: ");
		this.noiSinh = sc.nextLine();
		sc.nextLine();
		System.out.println(" Nhập điểm thường kỳ : ");
		this.diemThuongKy = sc.nextDouble();
		System.out.println(" Nhập điểm cuối kỳ : ");
		this.diemCuoiKy = sc.nextDouble();
	}
	
//	Method xuất thông tin của sinh viên
	
	public void xuatThongTin() {
		
		System.out.println(" Mã số sinh viên: " + this.getMaSV());
		System.out.println(" Họ tên: " + this.getHoTen());
		System.out.println(" Năm sinh: " + this.getNamSinh());
		if(this.gioiTinh==true) {
			System.out.println(" Giới Tính: Nam");
		}
		else {
			System.out.println(" Giới Tính: Nữ ");
		}
		
		System.out.println(" Nơi Sinh: " + this.getNoiSinh());
		System.out.println(" Điểm thường kỳ: " + this.getDiemThuongKy());
		System.out.println(" Điểm cuối kỳ: " + this.getDiemCuoiKy());
		System.out.println(" Điểm trung bình: " + this.diemTrungBinh());
		this.hocLuc();
		this.hocBong();
	}
	
	
}
