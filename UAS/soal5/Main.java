package UAS.soal5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kendaraan[] data = {
            new Mobil("B1234AA", "Toyota"),
            new Motor("D5678BB", "Honda")
        };

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan No Polisi: ");
            String cari = input.nextLine();

            if (cari.isEmpty()) {
                throw new Exception("Input tidak boleh kosong!");
            }

            boolean ditemukan = false;

            for (Kendaraan k : data) {
                if (k.getNoPol().equalsIgnoreCase(cari)) {
                    k.tampil();
                    ditemukan = true;
                }
            }

            if (!ditemukan) {
                throw new Exception("Data tidak ditemukan!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}