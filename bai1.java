import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua mang a: ");
        String temp = sc.nextLine();
        String arrTemp[] = temp.split(" ");
        a = new int[arrTemp.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(arrTemp[i]);
        }
        System.out.println("Mang vua nhap vao:");
        for (int item : a) {
            System.out.print(item + " ");
        }
        sc.close();
    }
}