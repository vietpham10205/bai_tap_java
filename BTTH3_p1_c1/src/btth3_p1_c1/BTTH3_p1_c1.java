/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btth3_p1_c1;

/**
 *
 * @author admin
 */

/*
Câu 1: Viết chương trình nhập vào một mảng cố định 5 phần tử các số nguyên dương
từ bàn phím. Yêu cầu sử dụng khối lệnh try…catch để xử lý ngoại lệ có thể xảy ra với
mảng này như là: nhập quá số lượng phần tử của mảng và nhập vào một số không phải số
nguyên dương.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class BTTH3_p1_c1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Mảng cố định 5 phần tử
        int count = 0;

        System.out.println("Nhập vào 5 số nguyên dương:");

        while (count < 5) {
            try {
                System.out.print("Nhập số thứ " + (count + 1) + ": ");
                int num = scanner.nextInt();

                if (num <= 0) {
                    throw new IllegalArgumentException("Số phải là số nguyên dương!");
                }

                numbers[count] = num;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên!");
                scanner.nextLine(); // Xóa bộ nhớ đệm (buffer)
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Lỗi: Vượt quá giới hạn của mảng!");
                break; // Thoát khỏi vòng lặp nếu vượt giới hạn
            }
        }

        // In ra mảng sau khi nhập thành công
        System.out.println("Mảng bạn vừa nhập là:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
        System.out.println("\nChương trình đã kết thúc.");
        System.exit(0); // thoát chương trình

    }
  
  }
    

