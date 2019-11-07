/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan47.nilaimahasiswa;
import java.util.Scanner;
/**
 *
 * @author user
 * Nama  : Andhyka Widariyanto
 * NIM   : 10117185
 * Kelas : PBO-Ulang
 * Tugas : Latihan 47 - Nilai Mahasiswa
 */
public class PBOUlang10117185Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner operNilai = new Scanner(System.in);
        Nilai masukan = new Nilai(75, 45, 34);
        
        System.out.print("QUIZ = ");
        double getNilaiQuiz = operNilai.nextDouble();
        System.out.print("UTS  = ");
        double getNilaiUts = operNilai.nextDouble();
        System.out.print("UAS  = ");
        double getNilaiUas = operNilai.nextDouble();
        System.out.println("\nNilai Akhir = "+masukan.hitungTotal(masukan.getNilaiQuiz(), masukan.getNilaiUts(), masukan.getNilaiUas()));
        System.out.println("\nIndex = "+masukan.setIndex(masukan.getNilaiAkhir()));
        System.out.println("Keterangan = "+masukan.setKeterangan(masukan.getIndex()));
    
    }
}
