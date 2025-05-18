/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btth3_p1_c2;

import static btth3_p1_c2.random.getElementAt;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author admin
 */

/*

*/
public class BTTH3_p1_c2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        // Tạo mảng ngẫu nhiên
        System.out.print("Mảng gồm 10 số ngẫu nhiên: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Số từ 0 đến 99
            System.out.print(numbers[i] + " ");
        }

        System.out.println(); // Xuống dòng

        // Nhập chỉ số từ người dùng
        try {
            System.out.print("Nhập chỉ số (từ 0 đến 9): ");
            int index = scanner.nextInt();

            int value = getElementAt(numbers, index); // gọi phương thức có throws
            System.out.println("Giá trị tại chỉ số " + index + " là: " + value);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
    }
    

