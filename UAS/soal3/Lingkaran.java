package UAS.soal3;

public class Lingkaran extends BangunDatar {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * r * r;
    }
}