package minggu4.tugas;

public class Motor {
    private String merk;
    private String warna;
    private String platNomor;
    private Pemilik pemilik;

    public Motor(String merk, String warna, String platNomor, Pemilik pemilik) {
        this.merk = merk;
        this.warna = warna;
        this.platNomor = platNomor;
        this.pemilik = pemilik;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public Pemilik getPemilik() {
        return pemilik;
    }

    public void setPemilik(Pemilik pemilik) {
        this.pemilik = pemilik;
    }
}
