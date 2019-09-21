/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan5.kambingglobal;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk membuat dan mengakses
 *                     variabel global jumlahKambing
 * 
 */
public class PBO210118071Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    // variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    // method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing : " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210118071Latihan5KambingGlobal kambingSusu = new PBO210118071Latihan5KambingGlobal();
        
        // menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // menambah satu kambing
        kambingSusu.tambahKambing();
        
        // menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
