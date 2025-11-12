import java.util.Scanner;

public class tugas {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai Struktur Data : ");
        double strukturData = input.nextDouble();

        System.out.println("Masukkan nilai Pemrograman Berorientasi Objek : ");
        double pemrogramanBerorientasiObjek = input.nextDouble();
        
        System.out.println("Masukkan nilai Basis Data : ");
        double basisData = input.nextDouble();

        System.out.println("Masukkan nilai Algoritma dan Pemrograman : ");
        double algoritmaDanPemrograman = input.nextDouble();

        System.out.println("Masukkan nilai Rekayasa Perangkat Lunak : ");
        double rekayasaPerangkatLunak = input.nextDouble();

        double rataRata = (strukturData + pemrogramanBerorientasiObjek + basisData + algoritmaDanPemrograman + rekayasaPerangkatLunak) / 5;
        double ipk = (rataRata / 100) * 4; 

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
        System.out.printf("Rata-rata nilai: %.2f\n", rataRata);
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
            int pilihan = input.nextInt();
            double nilaiPilihan = 0;

            switch (pilihan) {
                case 1:
                    nilaiPilihan = strukturData;
                    break;
                case 2:
                    nilaiPilihan = pemrogramanBerorientasiObjek;
                    break;
                case 3:
                    nilaiPilihan = basisData;
                    break;
                case 4:
                    nilaiPilihan = algoritmaDanPemrograman;
                    break;
                case 5:
                    nilaiPilihan = rekayasaPerangkatLunak;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    input.close();
                    return;
            }

            if (nilaiPilihan >= 75) {
                System.out.println("Selamat! Anda eligible untuk menjadi Asisten Dosen pada mata kuliah yang dipilih.");
            } else {
                System.out.println("Maaf, nilai Anda pada mata kuliah tersebut belum memenuhi syarat (minimal 75).");
            }
        } else {
            System.out.println("\nMaaf, Anda belum memenuhi syarat untuk mendaftar sebagai Asisten Dosen.");
        }

        input.close();
    }
}