class Temp {
    private static int x = 10;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        Temp.x = x;
    }

    public void show() {
        System.out.println(x);
    }
}

public class bai4 {
    public static void main(String[] args) {
        Temp t = new Temp();
        t.show();
        Temp t2 = new Temp();
        t2.setX(20);
        t.show();
    }
}
