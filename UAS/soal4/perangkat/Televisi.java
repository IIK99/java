package UAS.soal4.perangkat;

public class Televisi implements DapatDinyalakan {
    private String merk;

    public Televisi(String merk) {
        this.merk = merk;
    }

    public void nyalakan() {
        System.out.println("Televisi " + merk + " menyala");
    }
}