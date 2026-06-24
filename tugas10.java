// contoh penggunaan multi value dengan string pada switch case

import java.util.Scanner;

public class tugas10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan nilai (A, B, C, D, E): ");
        char nilai = input.next().charAt(0);

        switch (nilai) {
            case 'A':
            case 'a':
                System.out.println("Sangat Baik");
                break;
            case 'B':
            case 'b':
                System.out.println("Baik");
                break;
            case 'C':
            case 'c':
                System.out.println("Cukup");
                break;
            case 'D':
            case 'd':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Sangat Kurang");
        }
        input.close();
    }
}