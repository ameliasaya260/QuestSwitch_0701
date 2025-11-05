import java.until.Scanner;
public class TUGAS {
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

        System.out.println("\n=== HASIL PENILAIAN ===");
        System.out.printf("Rata-rata nilai:%.2f\n", rataRata);
        System.out.printf("IPK (sederhana): %.2f\n", ipk);
        System.out.println("Predikat: " + predikat);
        
        if (predikat.startsWith("A")) { // A atau AB
            System.out.println("\nAnda memenuhi syarat untuk mendaftar sebagai Asisten Dosen.");
            System.out.println("Pilih mata kuliah yang ingin diajukan:");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pemrograman Berorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dan Pemrograman");
            System.out.println("5. Rekayasa Perangkat Lunak");

            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = ns.nextInt();
            double nilaiPilihan = 0;

            switch (pilihan) {
                case 1:
                    nilaiPilihan = strukturData;
                    break;
                case 2:
                    nilaiPilihan = pbo;
                    break;
                case 3:
                    nilaiPilihan = basisData;
                    break;
                case 4:
                    nilaiPilihan = algoritma;
                    break;
                case 5:
                    nilaiPilihan = rpl;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    ns.close();
                    return;
            }
    }

}