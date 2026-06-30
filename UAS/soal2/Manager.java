package UAS.soal2;

public class Manager extends Karyawan {
    private String departemen;

    public Manager(String nama, int gaji, String departemen) {
        super(nama, gaji); // ini butuh constructor di parent
        this.departemen = departemen;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Departemen : " + departemen);
    }
}