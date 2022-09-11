class HocSinh {
    private String hoTen;
    private String lop;
    private float dtb;

    public String getHoTen() {
        return this.hoTen.toUpperCase();
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return this.lop.toUpperCase();
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public void Show() {
        System.out.printf("Ho ten: %-20s | Lop: %-10s | Diem trung binh: %-5.2f\n", this.getHoTen(), this.getLop(),
                this.getDtb());
    }
}

public class bai5 {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        hs.setHoTen("Phan Linh Vu");
        hs.setLop("DHMT13A1HN");
        hs.setDtb(9.85823749f);
        hs.Show();
    }
}
