/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan49.biayaemaskawin;

/**
 *
 * @author Firman Alfinas
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk menghitung biaya emas kawin 
 */
public class PBO11K10118904Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas e =new Emas();
        
        e.setMahar(15.7);
        
        e.setHarga(570000);
        System.out.println("====Program Menghitung Mahar======");
        System.out.println("Harga Emas : Rp."+e.getHarga());
        System.out.println("Jumlah Emas : "+e.getMahar()+" Gram");
        System.out.println("Jumlah harga yang harus dibayar : Rp."+ e.hitungHarga(e.getMahar(), e.getHarga()));
        
        
    }
    
}
