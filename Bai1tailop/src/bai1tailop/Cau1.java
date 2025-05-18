
package bai1tailop;

// Viết hàm nhập vào bán kính của đường tròn, tính chu vi đường tròn đó.
//Hướng dẫn: sử dụng hằng số Math.PI để tính chu vi.

import java.util.Scanner;

public class Cau1 {
    public static void tinhchuvi()
    {
        Scanner scanthongso =new Scanner(System.in);
        System.out.print("Nhập bán kính đường tròn: ");
        double r = scanthongso.nextDouble();
        double C = 2* Math.PI * r;
        System.out.print("Chu vi là: "+ C+"\n");
       
    }
}
