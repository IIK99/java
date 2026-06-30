package UAS.soal2;

public class Main {
    public static void main(String[] args) {

        Karyawan[] data = new Karyawan[3];

        data[0] = new Manager("Andi", 10000000, "IT");
        data[1] = new Staff("Budi", 5000000, "Admin");
        data[2] = new Manager("Citra", 12000000, "HR");

        for (Karyawan k : data) {
            k.tampil(); // ini error kalau tampil() tidak ada di parent
            System.out.println("----------------");
        }
    }
}