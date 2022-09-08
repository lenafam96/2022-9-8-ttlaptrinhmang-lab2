import java.util.Arrays;

class PhepTinh {
    private int th1;
    private int th2;
    private char toantu;

    public PhepTinh() {
        this.th1 = 0;
        this.th2 = 0;
        this.toantu = '+';
    }

    public PhepTinh(int th1, int th2, char toantu) {
        String tt[] = new String[] { "+", "-", "*", "/", "%", "^" };
        this.th1 = th1;
        this.th2 = th2;
        this.toantu = Arrays.asList(tt).contains(Character.toString(toantu)) ? toantu : '+';
    }

    public int getTh1() {
        return th1;
    }

    public void setTh1(int th1) {
        this.th1 = th1;
    }

    public int getTh2() {
        return th2;
    }

    public void setTh2(int th2) {
        this.th2 = th2;
    }

    public char getToantu() {
        return toantu;
    }

    public void setToantu(char toantu) {
        this.toantu = toantu;
    }

    private int tinhToan() {
        switch (this.toantu) {
            case '-':
                return this.th1 - this.th2;
            case '*':
                return this.th1 * this.th2;
            case '/':
                return this.th1 / this.th2;
            case '%':
                return this.th1 % this.th2;
            case '^':
                return (int) Math.pow(this.th1, this.th2);
            default:
                return this.th1 + this.th2;
        }
    }

    public void Show() {
        System.out.println(Integer.toString(this.getTh1()) + this.getToantu() + Integer.toString(this.getTh2()) + "="
                + this.tinhToan());
    }
}

public class bai6 {
    public static void main(String[] args) {
        PhepTinh pt1 = new PhepTinh();
        pt1.Show();
        PhepTinh pt2 = new PhepTinh(2, 5, '^');
        pt2.Show();
    }
}
