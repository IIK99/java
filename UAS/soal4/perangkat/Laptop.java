package UAS.soal4.perangkat;

public class Laptop implements DapatDinyalakan {
    private String merk;

    public Laptop(String merk) {
        this.merk = merk;
    }

    public void nyalakan() {
        System.out.println("Laptop " + merk + " menyala");
    }
}