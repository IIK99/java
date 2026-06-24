import java.util.Scanner;

// Class utama
public class UTS {

    
    // Class Mahasiswa (Object)
    // Menyimpan data mahasiswa
    static class Mahasiswa {
    String nama;
    long nim;

    Mahasiswa(String nama, long nim) {
        this.nama = nama;
        this.nim = nim;
    }
}

    
    // Method untuk menghitung grade berdasarkan nilai
    public static char hitungGrade(double nilai) {
        if (nilai >= 85) return 'A';
        else if (nilai >= 75) return 'B';
        else if (nilai >= 65) return 'C';
        else if (nilai >= 50) return 'D';
        else return 'E';
    }

    public static void main(String[] args) {

        // Scanner untuk input
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        long nim = input.nextLong();

        // Membuat object Mahasiswa
        Mahasiswa mhs = new Mahasiswa(nama, nim);

        int digitTerakhir = Integer.parseInt(String.valueOf(nim).substring(String.valueOf(nim).length() - 1));

        int tipe = digitTerakhir % 10;

        System.out.println("\n=== HASIL ===");
        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM : " + mhs.nim);

        // TIPE A (digit terakhir 0–3)
        if (tipe >= 0 && tipe <= 3) {

            System.out.println("Tipe Soal: A");

            // Input nilai
            System.out.print("Masukkan Nilai: ");
            double nilai = input.nextDouble();

            // Menentukan grade (if-else)
            char grade = hitungGrade(nilai);

            System.out.println("Grade: " + grade);

            
            // switch-case untuk menentukan
            // Lulus / Tidak Lulus
            switch (grade) {
                case 'A':
                case 'B':
                case 'C':
                    System.out.println("Keterangan: Lulus");
                    break;
                default:
                    System.out.println("Keterangan: Tidak Lulus");
            }
        }

        // TIPE B (digit terakhir 4–6)
        else if (tipe >= 4 && tipe <= 6) {

            System.out.println("Tipe Soal: B");

            System.out.print("Masukkan Nilai: ");
            double nilai = input.nextDouble();

            
            // Jika nilai < 70
            // tambahkan 10 poin (maks 100)
            
            if (nilai < 70) {
                nilai += 10;
                if (nilai > 100) {
                    nilai = 100;
                }
            }

            // Hitung grade setelah perbaikan
            char grade = hitungGrade(nilai);

            System.out.println("Nilai setelah perbaikan: " + nilai);
            System.out.println("Grade: " + grade);

            
            //  Keterangan:
            //  ≥ 80 → Memuaskan
            //  < 80 → Cukup
             
            if (nilai >= 80) {
                System.out.println("Keterangan: Memuaskan");
            } else {
                System.out.println("Keterangan: Cukup");
            }
        }

        // TIPE C (digit terakhir 7–9)
        else {

            System.out.println("Tipe Soal: C");

            double total = 0;
            int i = 1;

            
            //  Perulangan WHILE
            //  untuk input 3 nilai
            while (i <= 3) {
                System.out.print("Masukkan Nilai ke-" + i + ": ");
                double nilai = input.nextDouble();
                total += nilai;
                i++;
            }

            // Menghitung rata-rata
            double rata = total / 3;

            System.out.println("Rata-rata: " + rata);

            char grade;

            
            //  Jika rata-rata < 60 → grade E
             
            if (rata < 60) {
                grade = 'E';
            } else {
                grade = hitungGrade(rata);
            }

            System.out.println("Grade: " + grade);

            
            //  Perulangan DO-WHILE
            //  digunakan untuk menampilkan status "Istimewa"
             
            char ulang;
            do {
                if (rata >= 90) {
                    System.out.println("Keterangan: Istimewa");
                } else {
                    System.out.println("Keterangan: Tidak Istimewa");
                }

                // langsung berhenti (hanya untuk memenuhi syarat do-while)
                ulang = 't';

            } while (ulang == 'y');
        }

        input.close();
    }
}