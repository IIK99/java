package kuis.Default;

public class main {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan data mahasiswa
        mahasiswa[] daftarMahasiswa = new mahasiswa[5];

        // Mengisi data mahasiswa
        daftarMahasiswa[0] = new mahasiswa();
        daftarMahasiswa[0].setName("John Doe");
        daftarMahasiswa[0].setNim(123456789);
        daftarMahasiswa[0].setIpk(3);

        daftarMahasiswa[1] = new mahasiswa();
        daftarMahasiswa[1].setName("Jane Smith");
        daftarMahasiswa[1].setNim(987654321);
        daftarMahasiswa[1].setIpk(3);

        daftarMahasiswa[2] = new mahasiswa();
        daftarMahasiswa[2].setName("Bob Johnson");
        daftarMahasiswa[2].setNim(456789123);
        daftarMahasiswa[2].setIpk(3);

        daftarMahasiswa[3] = new mahasiswa();
        daftarMahasiswa[3].setName("Alice Williams");
        daftarMahasiswa[3].setNim(321654987);
        daftarMahasiswa[3].setIpk(3);

        daftarMahasiswa[4] = new mahasiswa();
        daftarMahasiswa[4].setName("Charlie Brown");
        daftarMahasiswa[4].setNim(654321987);
        daftarMahasiswa[4].setIpk(3);

        // Menampilkan data mahasiswa
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("Nama: " + daftarMahasiswa[i].getName());
            System.out.println("NIM: " + daftarMahasiswa[i].getNim());
            System.out.println("IPK: " + daftarMahasiswa[i].getIpk());
            System.out.println();
        }
    }
}
