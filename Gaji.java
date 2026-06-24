public class Gaji {
    int IDKaryawan;
    int Gol;
    String Jabatan;
    double Gaji;

    Gaji(int IDKaryawan, int Gol, String Jabatan, double Gaji) {
        this.IDKaryawan = IDKaryawan;
        this.Gol = Gol;
        this.Jabatan = Jabatan;
        this.Gaji = Gaji;
    }
    void info() {
        System.out.println("ID Karyawan: " + IDKaryawan);
        System.out.println("Golongan: " + Gol);
        System.out.println("Jabatan: " + Jabatan);
        System.out.println("Gaji: " + Gaji);
    }
}

class MainGaji {
    public static void main(String[] args) {
        Gaji gaji1 = new Gaji(1, 1, "Assisten Staff", 3000000);
        Gaji gaji2 = new Gaji(2, 2, "Staff", 7000000);
        Gaji gaji3 = new Gaji(3, 3, "Supervisor", 7000000);
        Gaji gaji4 = new Gaji(4, 4, "Assisten Manager", 7000000);
        Gaji gaji5 = new Gaji(5, 5, "Manager", 7000000);

        System.out.println("Informasi Gaji 1:");
        gaji1.info();

        System.out.println("\nInformasi Gaji 2:");
        gaji2.info();

        System.out.println("\nInformasi Gaji 3:");
        gaji3.info();

        System.out.println("\nInformasi Gaji 4:");
        gaji4.info();

        System.out.println("\nInformasi Gaji 5:");
        gaji5.info();
    }
}