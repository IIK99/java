package UAS.soal3;

public class Main {
    public static void main(String[] args) {

        BangunDatar[] bangun = new BangunDatar[2];

        bangun[0] = new Persegi(4);
        bangun[1] = new Lingkaran(7);

        for (BangunDatar b : bangun) {
            System.out.println("Luas: " + b.hitungLuas());
        }
    }
}