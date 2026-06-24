// contoh penggunaan case dan switch
public class tugas8 {
    public static void main(String[] args) {
        int pilihan = 3;
        int subPilihan = 1;

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih menu 1");
                break;
            case 2:
                System.out.println("Anda memilih menu 2");
                break;
            case 3:
                System.out.println("Anda memilih menu 3");
                switch (subPilihan) {
                    case 1:
                        System.out.println("Sub menu 1 untuk menu 3");
                        break;
                    case 2:
                        System.out.println("Sub menu 2 untuk menu 3");
                        break;
                    default:
                        System.out.println("Sub menu tidak tersedia untuk menu 3");
                }
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}
