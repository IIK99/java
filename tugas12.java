import java.util.Scanner;

public class tugas12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan pilihan kendaraan :");
        System.out.println("1. Laptop");
        System.out.println("2. Smartphone");
        System.out.print("Pilih (1/2): ");
        int pilihan = input.nextInt();

        int subPilihan;

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Laptop");
                System.out.println("1. Dell Inspiron");
                System.out.println("2. HP Pavilion");
                System.out.println("3. Lenovo ThinkPad");
                System.out.print("Pilih: ");
                subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Laptop Dell Inspiron");
                        break;
                    case 2:
                        System.out.println("Laptop HP Pavilion");
                        break;
                    case 3:
                        System.out.println("Laptop Lenovo ThinkPad");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
                break;

            case 2:
                System.out.println("Anda memilih Smartphone");
                System.out.println("1. iPhone");
                System.out.println("2. Samsung Galaxy");
                System.out.println("3. Google Pixel");
                System.out.print("Pilih: ");
                subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Smartphone iPhone");
                        break;
                    case 2:
                        System.out.println("Smartphone Samsung Galaxy");
                        break;
                    case 3:
                        System.out.println("Smartphone Google Pixel");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }

        input.close();
    }
}