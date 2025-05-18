/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btth3_p1_c2;

/**
 *
 * @author admin
 */
public class random {
    // Phương thức trả về phần tử tại chỉ số, sử dụng throws
    public static int getElementAt(int[] array, int index) throws Exception {
        if (index < 0) {
            throw new Exception("Lỗi: Chỉ số không được nhỏ hơn 0.");
        } else if (index >= array.length) {
            throw new Exception("Lỗi: Chỉ số vượt quá kích thước mảng (tối đa là " + (array.length - 1) + ").");
        }
        return array[index];
    
}
}
