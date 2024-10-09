import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        System.out.println("hello world");
        int x;
        Scanner nhapX = new Scanner(System.in);
        System.out.println("nhap X:");
        x = nhapX.nextInt();

        System.out.println("can X la:" + Math.sqrt(x));
    }
}
