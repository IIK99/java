import java.time.LocalDate;

public class tugas3 {
    public static void main(String[] args) {
        String name = "Iik Muhamad Ikmal";
        long NIM = 241011750073L;
        String kelas = "02SIFM001";
        String prodi = "SI";
        String fakultas = "Ilmu Komputer";
        int age = 20;
        LocalDate born = LocalDate.of(2010, 7, 8);
        boolean gender = true;
        String hobby = "bike";
        double GPA = 3.98;

        System.out.println("Name : " + name);
        System.out.println("NIM : " + NIM);
        System.out.println("Class : " + kelas);
        System.out.println("Prodi : " + prodi);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Age : " + age);
        System.out.println("Born : " + born);
        System.out.println("Gender (true=male) : " + gender);
        System.out.println("Hobby : " + hobby);
        System.out.println("GPA : " + GPA);
    }
}