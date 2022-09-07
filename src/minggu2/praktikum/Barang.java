package minggu2.praktikum;

/**
 * Barang
 */
public class Barang {

  public String kode, namaBarang;
  public int hargaDasar;
  public float diskon;

  public int hitungHargaJual() {
    return (int) (hargaDasar - ((diskon / 100) * hargaDasar));
  }

  public void tampilData() {
    System.out.println("Kode: " + kode);
    System.out.println("Nama Barang: " + namaBarang);
    System.out.println("Harga Dasar: " + hargaDasar);
    System.out.println("Diskon: " + diskon);
    System.out.println("Harga Jual: " + hitungHargaJual());
  }
}