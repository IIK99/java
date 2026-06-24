public class Karyawan {
    int IdKaryawan;
    String NamaKaryawan;

    Karyawan(int IdKaryawan, String NamaKaryawan) {
        this.IdKaryawan = IdKaryawan;
        this.NamaKaryawan = NamaKaryawan;
    }

    void info() {
        System.out.println("Id Karyawan: " + IdKaryawan);
        System.out.println("Nama Karyawan: " + NamaKaryawan);}
}

class MainKaryawan {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan(101, "Budi");
        Karyawan karyawan2 = new Karyawan(102, "Siti");

        System.out.println("Informasi Karyawan 1:");
        karyawan1.info();

        System.out.println("\nInformasi Karyawan 2:");
        karyawan2.info();
    }
}
