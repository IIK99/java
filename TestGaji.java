class Karyawati {
    int gaji = 4000000;
    int tunjanganMakan = 400000;
    int transport = 500000;
}

class SystemAnalyst extends Karyawati {
    int bonus = 1000000;
    int gajiTotal() {
        return gaji + bonus + tunjanganMakan + transport;
    }

    void tampilkanGaji() {
        System.out.println("Gaji System Analyst : " + gaji);
        System.out.println("Bonus               : " + bonus);
        System.out.println("Tunjangan Makan     : " + tunjanganMakan);
        System.out.println("Transport           : " + transport);
        System.out.println("Total Gaji          : " + gajiTotal());
    }
}

public class TestGaji {
    public static void main(String[] args) {
        SystemAnalyst sa = new SystemAnalyst();
        sa.tampilkanGaji();
    }
}