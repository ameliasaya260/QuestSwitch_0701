import java.until.Scanner;
public class TUGAS{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System out.println("masukkan nilai struktur data : ");
        double strukturData = ns.nextDouble();

        System.out.println("masukkan nilai pemrograman berorientasi objek : ");
        double pemrogramanBerorientasiObjek = input.nextDouble();

        
        System.out.println("masukkan nilai basis data : ");
        double basisData = input.nextDouble();

        System.out.println("algoritma dan pemrograman : ");
        double algoritmaDanPemrograman = input.nextDouble();

        System.out.println("masukkan nilai rekayasa perangkat lunak : ");
        double rekayasaPerangkatLunak = input.nextDouble();

        double rataRata = (struktur data + pemrogramanBerorientasiObek + basisData + algoritmaPemrograman + rekayasaPerangkatLunak) / 5;
        double ipk = (rataRata/100)*4; 

        String predikat;
        if (ipk >= 3.75) {
            predikat = "A (sangat baik)";
        } else if (ipk >= 3.5) {
            predikat = "AB (baik sekali)";
        } else if (ipk >= 3.0) {
            predikat = "B (baik)";
        } else if (ipk >= 2.5) {
            predikat = "BC (cukup)";
        } else {
            predikat = "C (kurang)";
        }
        
    }

}