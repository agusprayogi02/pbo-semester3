package minggu4.tugas;

public class Pemilik {
    private String nik;
    private String nama;
    private String alamat;
    private String noHp;
    private Karcis karcis;

    public Pemilik(String nik, String nama, String alamat, String noHp) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public Karcis getKarcis() {
        return karcis;
    }

    public void setKarcis(Karcis karcis) {
        if(karcis.getMotor().getPemilik().getNik().equals(nik)) {
            this.karcis = karcis;
        }else {
            System.out.println("Karcis tidak sesuai dengan pemilik");
        }
    }
}
