package UAS.soal2;

public class Karyawan {
    protected String nama;
    protected int gaji;

    // Constructor WAJIB ADA
    public Karyawan(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    // Method tampil WAJIB ADA
    public void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);
    }
}