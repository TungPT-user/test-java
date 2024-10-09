import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.println("hello world");
        int x;
        Scanner nhapX = new Scanner(System.in);
        System.out.println("nhap X:");
        x = nhapX.nextInt();

        System.out.println("X mu 3 la:" + Math.pow(x,3));
    }
}
