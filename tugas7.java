// contoh penggunaan switch dengan tipe data String
public class tugas7 {
    public static void main(String[] args) {
        String hari = "Rabu";
        System.out.println("Hari yang dipilih: ");

        switch (hari) {
            case "Senin":
                System.out.println("Hari Senin");
                break;
            case "Selasa":
                System.out.println("Hari Selasa");
                break;
            case "Rabu":
                System.out.println("Hari Rabu");
                break;
            default:
                System.out.println("Hari tidak valid");
        }
    }
}