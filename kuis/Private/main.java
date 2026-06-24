package kuis.Private;

public class main {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa();
        mhs.setName("John Doe");
        mhs.setNim(123456789);
        mhs.setIpk(3);

        System.out.println("Name: " + mhs.getName());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("IPK: " + mhs.getIpk());
    }
}
