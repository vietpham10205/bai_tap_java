/* Viết hàm nhập vào 2 chuỗi x và y. (Hướng dẫn: sử dụng hàm nextLine() của lớp
Scanner). Thực hiện các thao tác sau:
• Cho biết tổng chiểu dài của chuỗi x. (Hướng dẫn: sử dụng hàm length)
• Cho biết 3 kí tự đầu tiên của chuỗi x. (Hướng dẫn: sử dụng hàm substring)
• Cho biết 3 kí tự cuối của chuỗi x.
• Cho biết kí tự thứ 6 của chuỗi x. (Hướng dẫn: sử dụng hàm charAt)
• Tạo chuỗi mới gồm 3 kí tự đầu tiên của chuỗi x và 3 kí tự cuối của chuỗi y.
• Kiểm tra 2 chuỗi x, y có bằng nhau hay không (phân biệt chữ hoa, thường)?
(Hướng dẫn: sử dụng hàm equals)
• Kiểm tra 2 chuỗi x, y có bằng nhau hay không (không phân biệt chữ hoa,
h.thường)? (Hướng dẫn: sử dụng hàm equalsIgnoreCase)
• Cho biết y có xuất hiện trong x hay không? Nếu có, tại vị trí nào? (Hướng dẫn: sử
dụng hàm indexOf)
• Cho biết tất cả các vị trí xuất hiện của y trong x.*/
package bai1tailop;
import java.util.Scanner;

public class Cau4 {
    public static void chuoixvay()
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Nhập chuỗi x: ");
        String x= scan.nextLine();
        System.out.print("Nhập chuỗi y: ");
        String y= scan.nextLine();
        int lengthX = x.length();
        
        System.out.print("Độ dài chuỗi x là: "+ lengthX +"\n");
        if (lengthX >= 3)
        System.out.print("3 chữ đầu chuỗi x là: "+ x.substring(0,3)+"\n");
    }
}
