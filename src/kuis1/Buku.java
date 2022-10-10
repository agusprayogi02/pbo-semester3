package kuis1;

public class Buku {
  private String kode, judul, pengarang;
  private int thnTerbit;

  public int getThnTerbit() {
    return thnTerbit;
  }

  public Buku() {
  }

  public void setKode(String kode) {
    this.kode = kode;
  }

  public void setJudul(String judul) {
    this.judul = judul;
  }

  public void setPengarang(String pengarang) {
    this.pengarang = pengarang;
  }

  public void setThnTerbit(int thnTerbit) {
    this.thnTerbit = thnTerbit;
  }

  public void tampilData() {
    System.out.println("Kode Buku: " + kode);
    System.out.println("Judul Buku: " + judul);
    System.out.println("Pengarang: " + pengarang);
    System.out.println("Tahun Terbit: " + thnTerbit);
  }

  public String getKode() {
    return kode;
  }

  public String getJudul() {
    return judul;
  }

  public String getPengarang() {
    return pengarang;
  }

}
