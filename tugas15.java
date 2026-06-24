// tugas perulangan for deret kelipatan 5

import java.util.Scanner;
public class tugas15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai Awal? : ");
        int nilaiAwal = input.nextInt();

        System.out.print("Nilai Akhir? : ");
        int nilaiAkhir = input.nextInt();

        System.out.println("=== Output ===");

        for (int i=nilaiAwal; i<=nilaiAkhir; i+=5) {
            System.out.println(i);
        }
        input.close();
    }
}