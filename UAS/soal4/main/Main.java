package UAS.soal4.main;

import UAS.soal4.perangkat.*;

public class Main {
    public static void main(String[] args) {

        DapatDinyalakan tv = new Televisi("Samsung");
        DapatDinyalakan lp = new Laptop("Asus");

        tv.nyalakan();
        lp.nyalakan();
    }
}