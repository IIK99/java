package Meet15.Encapsulation;

import Meet15.Model.mahasiswa;
import Meet15.Model.matkul;

public class main {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("Iik Muhamad Ikmal", 24101175, true);
        System.out.println("Nama Mahasiswa: " + mahasiswa1.getNama());
        System.out.println("NIM Mahasiswa: " + mahasiswa1.getNim());
        System.out.println("Status Mahasiswa Aktif: " + mahasiswa1.getMahasiswaAktif());

        matkul matkul1 = new matkul("Pemrograman Berorientasi Objek Java", 3);
        System.out.println("\nNama Mata Kuliah: " + matkul1.getNamaMatkul());
        System.out.println("Jumlah SKS: " + matkul1.getSks());
    }
}
