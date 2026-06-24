package Array;
import java.util.Scanner;

public class kota2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah kota dan negara: ");
        int jumlahKota = input.nextInt();
        input.nextLine(); 

        String[][] kotaNegara = new String[jumlahKota][2];

        for (int i = 0; i < kotaNegara.length; i++) {
            System.out.print("Masukkan nama kota ke-" + (i + 1) + ": ");
            kotaNegara[i][0] = input.nextLine();
            System.out.print("Masukkan nama negara untuk kota " + kotaNegara[i][0] + ": ");
            kotaNegara[i][1] = input.nextLine();
        }

        System.out.println("\nNama-nama kota dan negara yang dimasukkan:");
        for (String[] kn : kotaNegara) {
            System.out.println("Kota: " + kn[0] + ", Negara: " + kn[1]);
        }
        input.close();
    }
}
