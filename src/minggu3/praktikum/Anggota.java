package minggu3.praktikum;

public class Anggota {
  private String noKtp;
  private String nama;
  private int limitPinjaman;
  private int jumlahPinjaman;

  public Anggota(String noKtp, String nama, int limitPinjaman) {
    this.noKtp = noKtp;
    this.nama = nama;
    this.limitPinjaman = limitPinjaman;
  }

  public String getNoKtp() {
    return noKtp;
  }

  public void setNoKtp(String noKtp) {
    this.noKtp = noKtp;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public int getLimitPinjaman() {
    return limitPinjaman;
  }

  public void setLimitPinjaman(int limitPinjaman) {
    this.limitPinjaman = limitPinjaman;
  }

  public int getJumlahPinjaman() {
    return jumlahPinjaman;
  }

  public void setJumlahPinjaman(int jumlahPinjaman) {
    this.jumlahPinjaman = jumlahPinjaman;
  }

  public void pinjam(int pinjam) {
    if (pinjam > limitPinjaman) {
      System.out.println("Maaf, jumlah pinjaman melebihi limit.");
    } else {
      jumlahPinjaman += pinjam;
    }
  }

  public void angsur(int angsur) {
    if (angsur < (limitPinjaman * .1)) {
      System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
    } else {
      jumlahPinjaman -= angsur;
    }
  }
}
