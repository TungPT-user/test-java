import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println();
        Scanner nhapNgay = new Scanner(System.in);
        int day;
        Scanner nhapThang = new Scanner(System.in);
        int month;
        Scanner nhapNam = new Scanner(System.in);
        int year;

        System.out.println("nhap ngay");
        day = nhapNgay.nextInt();
        System.out.println("nhap thang");
        month = nhapNgay.nextInt();
        System.out.println("nhap nam");
        year = nhapNgay.nextInt();

        System.out.println(day+"/"+month+"/"+year);
    }
}
