import java.util.Scanner;

class HocVien {
    private String MaHV;
    private String HoTen;
    private String QueQuan;
    private float DiemThi;

    public HocVien() {
        this.MaHV = "";
        this.HoTen = "";
        this.QueQuan = "";
        this.DiemThi = 0;
    }

    public HocVien(String MaHV, String HoTen, String QueQuan, float DiemThi) {
        this.MaHV = MaHV;
        this.HoTen = HoTen;
        this.QueQuan = QueQuan;
        this.DiemThi = DiemThi;
    }

    public String getMaHV() {
        return this.MaHV;
    }

    public void setMaHV(String maHV) {
        this.MaHV = maHV;
    }

    public String getHoTen() {
        return this.HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public String getQueQuan() {
        return this.QueQuan;
    }

    public void setQueQuan(String queQuan) {
        this.QueQuan = queQuan;
    }

    public float getDiemThi() {
        return this.DiemThi;
    }

    public void setDiemThi(float diemThi) {
        this.DiemThi = diemThi;
    }
}

public class Test {
    private int n;
    private int k;
    private HocVien dshv[];
    private static Scanner s = new Scanner(System.in);

    public Test() {
        do {
            System.out.print("Nhap do dai danh sach hoc vien: ");
            this.n = Integer.parseInt(s.nextLine());
        } while (this.n <= 0 || this.n > 100);
        this.k = 0;
        this.dshv = new HocVien[this.n];
    }

    public void finalize() {
        s.close();
    }

    public void NhapHocVien() {
        System.out.printf("\nNhap thong tin hoc vien thu %d\n", this.k + 1);
        HocVien hv = new HocVien();
        System.out.print("Nhap ma hoc vien: ");
        hv.setMaHV(s.nextLine());
        System.out.print("Nhap ho ten hoc vien: ");
        hv.setHoTen(s.nextLine());
        System.out.print("Nhap que quan hoc vien: ");
        hv.setQueQuan(s.nextLine());
        System.out.print("Nhap diem thi hoc vien: ");
        hv.setDiemThi(Float.parseFloat(s.nextLine()));
        this.dshv[this.k++] = hv;
    }

    public void HienThiHocVien() {
        System.out.println("\n\n\n\t\t\t===Danh sach hoc vien===");
        System.out.printf("%-10s|%-30s|%-20s|%-10s\n", "Ma HV", "Ho ten", "Que quan", "Diem thi");
        System.out.println("-".repeat(73));
        for (int i = 0; i < this.k; i++) {
            System.out.printf("%-10s|%-30s|%-20s|%-10.2f\n", this.dshv[i].getMaHV().toUpperCase(),
                    this.dshv[i].getHoTen().toUpperCase(), this.dshv[i].getQueQuan().toUpperCase(),
                    this.dshv[i].getDiemThi());
        }
        System.out.println("-".repeat(73));
    }

    public void TimKiemHocVien() {
        boolean check = true;
        System.out.print("\n\n==>Nhap ho ten hoc vien can tim: ");
        String hoTen = s.nextLine();
        System.out.println("\n\n\n\t\t\t===Danh sach hoc vien ten \"" + hoTen.toUpperCase() + "\"===");
        System.out.printf("%-10s|%-30s|%-20s|%-10s\n", "Ma HV", "Ho ten", "Que quan", "Diem thi");
        System.out.println("-".repeat(73));
        for (int i = 0; i < this.k; i++) {
            if (this.dshv[i].getHoTen().toUpperCase().contains(hoTen.toUpperCase())) {
                System.out.printf("%-10s|%-30s|%-20s|%-10.2f\n", this.dshv[i].getMaHV().toUpperCase(),
                        this.dshv[i].getHoTen().toUpperCase(), this.dshv[i].getQueQuan().toUpperCase(),
                        this.dshv[i].getDiemThi());
                check = false;
            }
        }
        if (check)
            System.out.println("Khong co hoc vien ten \"" + hoTen.toUpperCase() + "\" trong danh sach!");
        System.out.println("-".repeat(73));
    }

    public static void main(String[] args) {
        Test test = new Test();
        do {
            test.NhapHocVien();
            System.out.printf("Tiep tuc nhap (y/n)? ");
        } while (!s.nextLine().equals("n"));
        test.HienThiHocVien();
        test.TimKiemHocVien();
    }
}
