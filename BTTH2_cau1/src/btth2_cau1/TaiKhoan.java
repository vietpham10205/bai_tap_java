/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btth2_cau1;
import javax.swing.JFrame;
/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.util.*; // Khai báo tất cả các lớp trong package java.util


public class TaiKhoan {
    private long soTK;
    private String tenTK;
    private double soTien;
    //
    
    public TaiKhoan ()
    {
        
    }
    
    public TaiKhoan(long soTK, String tenTK, double soTien)
    {
        this.soTK=soTK;
        this.soTien=soTien;
        this.tenTK= tenTK;
    }
    public void inTaiKhoan()
    {
        System.out.println("Thông tin tài khoản:\n");
        System.out.println("Số tài khoản: " + this.soTK);
        System.out.println("Tên tài khoản: " + this.tenTK);
        System.out.println("Số dư tài khoản: " + this.soTien);
    }
    
    public boolean napTien (double st)
    {
        if (st > 0)
        {
            this.soTien += st;
            System.out.println("Nạp tiền thành công. Số dư hiện tại: "+this.soTien);
            return true;
        }
        else 
        {
            System.out.println("Số tiền không hợp lệ!");
            return false;
        }
    }
    
    public boolean chuyenKhoan (TaiKhoan a, double st )
    {
        if( st>0 && st<=this.soTien)
        {
            this.soTien -= st;
            a.soTien += st;
            System.out.println("Chuyển tiền thành công. Số dư còn lại: "+ this.soTien);
            return true;
        }
        else if(st<=0)
        {
            System.out.println("Số tiền không hợp lệ!");
            return false;
        }
        else 
        {
            System.out.println("Số dư không đủ!");
            return false;
        }
    }
}
