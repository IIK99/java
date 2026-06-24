package Meet15.Default;

public class main {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa();

        mhs.setName("Ikmal");
        mhs.setNim(24101175);
        mhs.setStatus(true);

        System.out.println("Nama Mahasiswa = " + mhs.getName());
        System.out.println("NIM Mahasiswa = " + mhs.getNim());
        System.out.println("Status Mahasiswa = " + mhs.getStatus());
    }
}
