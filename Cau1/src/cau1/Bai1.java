
package cau1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class Bai1 {
    public static void nhap () {
    // Tạo đối tượng BufferedReader
BufferedReader nhap = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
String ten = "";
System.out.print("Nhập tên: ");
    
//Nhập từ bàn phím dùng BufferedReader
try {
 ten = nhap.readLine();
} catch (IOException ex) {
 System.out.println("loi");
}
//Hiển thị tên
System.out.println("Hello " + ten +" !");
}
}
