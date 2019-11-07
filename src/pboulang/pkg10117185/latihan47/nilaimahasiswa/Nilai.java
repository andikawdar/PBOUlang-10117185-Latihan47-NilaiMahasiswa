/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan47.nilaimahasiswa;

/**
 *
 * @author user
 * Nama  : Andhyka Widariyanto
 * NIM   : 10117185
 * Kelas : PBO-Ulang
 * Tugas : Latihan 47 - Nilai Mahasiswa
 */
public class Nilai {
    //Atribute
    double nilaiQuiz;
    double nilaiUts;
    double nilaiUas;
    double nilaiAkhir;
    String keterangan;
    String index;
    
    //Construction
    Nilai (double nilaiQuiz, double nilaiUts, double nilaiUas){
        this.nilaiQuiz = nilaiQuiz;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    //Function

    public double getNilaiQuiz() {
        return nilaiQuiz;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getIndex() {
        return index;
    }
    
    public double hitungTotal(double nQuiz, double nUts, double nUas){
        nilaiAkhir = (0.2*nQuiz)+(0.3*nUts)+(0.5*nUas);
        return nilaiAkhir;
    }
     public String setIndex(double nilaiAkhir) {

        if(80 <= nilaiAkhir && nilaiAkhir <= 100 ) {

            index = "A";

        } else if(68 <= nilaiAkhir && nilaiAkhir < 80 ) {

            index = "B";

        } else if(56 <= nilaiAkhir && nilaiAkhir < 68 ) {

            index = "c";

        } else if(45 <= nilaiAkhir && nilaiAkhir < 56 ) {

            index = "D";

        } else {

            index = "E";

        }

        

        return index;

    }

    

    public String setKeterangan(String index) {

        switch (index) {
            case "A":
                keterangan = "Sangat Baik";
                break;
            case "B":
                keterangan = "Baik";
                break;
            case "C":
                keterangan = "Cukup";
                break;
            case "D":
                keterangan = "Kurang";
                break;
            case "E":
                keterangan = "Sangat Kurang";
                break;
            default:
                break;
        }

        

        return keterangan;

    }
    
}
