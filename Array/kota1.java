package Array;
import java.util.Scanner;
public class kota1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah kota: ");
        int jumlahKota = input.nextInt();
        input.nextLine(); 

        String[] kota = new String[jumlahKota];

        for (int i = 0; i < kota.length; i++) {
            System.out.print("Masukkan nama kota ke-" + (i + 1) + ": ");
            kota[i] = input.nextLine();
        }

        System.out.println("\nNama-nama kota yang dimasukkan:");
        for (String k : kota) {
            System.out.println(k);
        }
        input.close();
    }
}
