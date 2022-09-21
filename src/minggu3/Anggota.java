package minggu3;

public class Anggota {
  private String nama, alamat;
  private float simpanan;

  public Anggota(String nama, String alamat) {
    this.nama = nama;
    this.alamat = alamat;
    this.simpanan = 0;
  }

  public String getNama() {
    return null;
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

  public float getSimpanan() {
    return simpanan;
  }

  public void setSimpanan(float simpanan) {
    this.simpanan = simpanan;
  }

  public void setor(float val) {
    simpanan += val;
  }

  public void pinjam(float val) {
    simpanan -= val;
  }
}
