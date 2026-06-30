package UAS.soal1;

public class Main {
    public static void main(String[] args) {

        // Array 5 mahasiswa
        Mahasiswa[] dataMhs = new Mahasiswa[5];

        // Inisialisasi dengan constructor
        dataMhs[0] = new Mahasiswa("101", "Andi", 3.5);
        dataMhs[1] = new Mahasiswa("102", "Budi", 3.2);
        dataMhs[2] = new Mahasiswa("103", "Citra", 3.8);
        dataMhs[3] = new Mahasiswa("104", "Dewi", 3.6);
        dataMhs[4] = new Mahasiswa("105", "Eka", 3.9);

        // Tampilkan semua data
        System.out.println("=== DATA MAHASISWA ===");
        for (int i = 0; i < dataMhs.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("NIM  : " + dataMhs[i].getNim());
            System.out.println("Nama : " + dataMhs[i].getNama());
            System.out.println("IPK  : " + dataMhs[i].getIpk());
            System.out.println("----------------------");
        }
    }
}