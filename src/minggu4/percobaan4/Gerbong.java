package minggu4.percobaan4;

public class Gerbong {
  private String kode;
  private Kursi[] arrayKursi;

  public Gerbong(String kode, int jumlah) {
    this.kode = kode;
    this.arrayKursi = new Kursi[jumlah];
    this.initKursi();
  }

  public String getKode() {
    return kode;
  }

  public void setKode(String kode) {
    this.kode = kode;
  }

  public Kursi[] getArrayKursi() {
    return arrayKursi;
  }

  public void setArrayKursi(Kursi[] arrayKursi) {
    this.arrayKursi = arrayKursi;
  }

  private void initKursi() {
    for (int i = 0; i < arrayKursi.length; i++) {
      this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
    }
  }

  public String info() {
    String info = "";
    info += "Kode: " + kode + "\n";
    for (Kursi kursi : arrayKursi) {
      info += kursi.info();
    }
    return info;
  }

  public void setPenumpang(Penumpang penumpang, int nomor) {
    if (arrayKursi[nomor - 1].getPenumpang() != null) {
      setPenumpang(penumpang, nomor + 1);
    } else {
      arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
  }
}
