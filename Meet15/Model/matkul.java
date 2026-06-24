package Meet15.Model;

public class matkul {
    private String namaMatkul;
    private Integer sks;

    public matkul(String namaMatkul, Integer sks) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }
}
