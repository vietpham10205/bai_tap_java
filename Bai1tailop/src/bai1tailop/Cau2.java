//Viết hàm Nhập vào 2 số a, b. Xuất ra màn hình kết quả a/b (lấy số 3 lẻ)
//Hướng dẫn: sử dụng hàm printf để in ra. System.out.printf("%.3f", x);
package bai1tailop;

import java.util.Scanner;
public class Cau2 {
    public static void nhapab ()
    {
        Scanner scan= new Scanner (System.in);
        System.out.print("Nhap so a: ");
        double a = scan.nextDouble();
        System.out.print("Nhap so b: ");
        double b = scan.nextDouble();
        double c = a/b;
        System.out.printf("%.3f", c);
    }
    
}
