package UAS.soal5;
// parent
public class Kendaraan {
    private String noPol;
    private String merk;

    public Kendaraan(String noPol, String merk) {
        this.noPol = noPol;
        this.merk = merk;
    }

    public String getNoPol() {
        return noPol;
    }

    public String getMerk() {
        return merk;
    }

    public void tampil() {
        System.out.println(noPol + " - " + merk);
    }
}