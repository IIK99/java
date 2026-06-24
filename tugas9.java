// contoh penggunaan multi value dengan int pada switch case

import java.util.Scanner;

public class tugas9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        switch (nilai) {
            case 85:
            case 86:
            case 87:
                System.out.println("Nilai A");
                break;
            case 75:
            case 76:
            case 77:
                System.out.println("Nilai B");
                break;
            case 65:
            case 66:
            case 67:
                System.out.println("Nilai C");
                break;
            case 55:
            case 56:
            case 57:
                System.out.println("Nilai D");
                break;
            default:
                System.out.println("Nilai E");
        }
        scanner.close();
    }
}