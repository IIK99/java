import java.util.Scanner;
public class tugas16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tahun Akhir? :");
        int tahunAkhir = input.nextInt();

        System.out.println("Tahun Awal? :");
        int tahunAwal = input.nextInt();

        System.out.println("Hasil :");

        for (int i=tahunAkhir; i>=tahunAwal; i--) {
            System.out.println(i);
        }
        input.close();
    }
}