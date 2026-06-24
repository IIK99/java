package Meet15.Model;

public class mahasiswa {
    private String nama;
    private long nim;
    private Boolean MahasiswaAktif;

    public mahasiswa(String nama, long nim, Boolean MahasiswaAktif) {
        this.nama = nama;
        this.nim = nim;
        this.MahasiswaAktif = MahasiswaAktif;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public Boolean getMahasiswaAktif() {
        return MahasiswaAktif;
    }

    public void setMahasiswaAktif(Boolean MahasiswaAktif) {
        this.MahasiswaAktif = MahasiswaAktif;
    }
}
