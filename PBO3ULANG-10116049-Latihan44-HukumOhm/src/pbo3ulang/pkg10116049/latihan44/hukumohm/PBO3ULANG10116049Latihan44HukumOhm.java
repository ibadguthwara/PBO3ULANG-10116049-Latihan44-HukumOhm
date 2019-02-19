/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan44.hukumohm;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Menetukan nilai dalam hukum ohm
 *  
 */
public class PBO3ULANG10116049Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      
      Baterai objBaterai = new Baterai(3, 12);
      Baterai objBaterai2 = new Baterai();
      System.out.println("");
      System.out.println("Kuat Arus : " + objBaterai.getKuatArus() + "ampere");
      System.out.println("Hambatan  : " + objBaterai.getHambatan() + "ohm");
      System.out.println("Hasil Tegangan : " + objBaterai.hitungTegangan() 
                         + "volt");
    
    }
    
}
