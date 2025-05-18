/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btth2_cau1 ;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class BTTH2_cau1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaiKhoan a = new TaiKhoan(100100,"Thuong Trung Nguyen", 100000);
        TaiKhoan b = new TaiKhoan(100101,"Pham Viet", 1000000);
            a.inTaiKhoan();
            b.napTien(500000);
            b.chuyenKhoan(a, 50000);
    }
    
}
  