import java.util.Scanner;

public class tugas19 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka yang akan dibagi: ");
            int angka1 = input.nextInt();

            System.out.print("Masukkan pembagi: ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println("Hasil pembagian: " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak boleh membagi dengan nol!");

        } finally {
            System.out.println("Program selesai dijalankan.");
            input.close();
        }
    }
}
