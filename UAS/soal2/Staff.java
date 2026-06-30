package UAS.soal2;

public class Staff extends Karyawan {
    private String bagian;

    public Staff(String nama, int gaji, String bagian) {
        super(nama, gaji);
        this.bagian = bagian;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Bagian : " + bagian);
    }
}