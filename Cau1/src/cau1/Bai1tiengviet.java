/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

/**
 *
 * @author admin
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class Bai1tiengviet {
     public static void nhap() {
        // Tạo đối tượng BufferedReader
        try (BufferedReader nhap = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
            String ten = "";
            System.out.print("Nhập tên: ");

            // Nhập từ bàn phím dùng BufferedReader
            ten = nhap.readLine();

            // Hiển thị tên
            System.out.println("Hello " + ten + "!");
        } catch (IOException ex) {
            System.out.println("Lỗi nhập dữ liệu: " + ex.getMessage()); // Thêm thông báo lỗi chi tiết
        }
    }
    
}
