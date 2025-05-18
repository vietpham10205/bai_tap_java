//Viết hàm nhập 2 phân số. Tính tổng, hiệu, tích, thương của 2 phân số nói trên
package bai1tailop;

import java.util.Scanner;

 class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon();
    }
    

    public void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        this.tuSo = scanner.nextInt();
        System.out.print("Nhập mẫu số: ");
        this.mauSo = scanner.nextInt();
        rutGon();
    }

    public void hienThiPhanSo() {
        System.out.print(tuSo + "/" + mauSo);
    }

    private int ucln(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    private void rutGon() {
        if (mauSo == 0) {
            System.out.println("Mẫu số phải khác 0.");
            return;
        }
        int ucln = ucln(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    public PhanSo cong(PhanSo ps) {
        int tuSoMoi = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo tru(PhanSo ps) {
        int tuSoMoi = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo nhan(PhanSo ps) {
        int tuSoMoi = this.tuSo * ps.tuSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo chia(PhanSo ps) {
        if (ps.tuSo == 0) {
            System.out.println("Không thể chia cho 0.");
            return null;
        }
        int tuSoMoi = this.tuSo * ps.mauSo;
        int mauSoMoi = this.mauSo * ps.tuSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }
 }
public class Cau3 {
    
    public static void nhap2ps()
    {
         PhanSo ps1 = new PhanSo(1, 1);
        PhanSo ps2 = new PhanSo(1, 1);

        System.out.println("Nhập phân số thứ nhất:");
        ps1.nhapPhanSo();

        System.out.println("Nhập phân số thứ hai:");
        ps2.nhapPhanSo();

        System.out.print("Phân số thứ nhất: ");
        ps1.hienThiPhanSo();
        System.out.println();
        System.out.print("Phân số thứ hai: ");
        ps2.hienThiPhanSo();
        System.out.println();

        PhanSo tong = ps1.cong(ps2);
        System.out.print("Tổng: ");
        tong.hienThiPhanSo();
        System.out.println();

        PhanSo hieu = ps1.tru(ps2);
        System.out.print("Hiệu: ");
        hieu.hienThiPhanSo();
        System.out.println();

        PhanSo tich = ps1.nhan(ps2);
        System.out.print("Tích: ");
        tich.hienThiPhanSo();
        System.out.println();

        PhanSo thuong = ps1.chia(ps2);
        System.out.print("Thương: ");
        if(thuong != null){
            thuong.hienThiPhanSo();
        }
        System.out.println();

    }
    }
    

