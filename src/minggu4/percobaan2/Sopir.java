package minggu4.percobaan2;

public class Sopir {
  private String nama;
  private int biaya;

  public int hitungBiayaSopir(int hari) {
    return biaya * hari;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public int getBiaya() {
    return biaya;
  }

  public void setBiaya(int biaya) {
    this.biaya = biaya;
  }
}
