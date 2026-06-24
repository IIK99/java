// tugas pilihan 1 kendaraan
// 1 motor
// 2 mobil
// pilihan 2 elektronik
// 1 laptop
// 2 smartphone

public class tugas11 {
    public static void main(String[] args) {
        int pilihan = 1;
        int subPilihan = 1;

        System.out.println("Masukan pilihan kendaraan :");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Motor");
                switch (subPilihan) {
                    case 1:
                        System.out.println("Motor Honda Beat");
                        break;
                    case 2:
                        System.out.println("Motor Yamaha Nmax");
                        break;
                    case 3:
                        System.out.println("Motor Suzuki Satria");
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
                break;

            case 2:
                System.out.println("Anda memilih Mobil");
                switch (subPilihan) {
                    case 1:
                        System.out.println("Mobil Honda Civic");
                        break;
                    case 2:
                        System.out.println("Mobil Toyota Avanza");
                        break;
                    case 3:
                        System.out.println("Mobil Nissan X-Trail");
                        break;

                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}