// contoh penggunaan switch dengan tipe data int
public class tugas6 {
    public static void main(String[] args) {
        int menu = 2;
        System.out.println("Menu yang dipilih: ");

        switch (menu) {
            case 1:
                System.out.println("Menu 1: Nasi Goreng");
                break;
            case 2:
                System.out.println("Menu 2: Mie Ayam");
                break;
            case 3:
                System.out.println("Menu 3: Sate Ayam");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}

