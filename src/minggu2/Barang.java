package minggu2;

/**
 * Barang
 */
public class Barang {

  public String namaBrg, jenisBrg;
  public int stok;

  public void tampilBarang() {
    System.out.println("Nama Barang: " + namaBrg);
    System.out.println("Jenis Barang: " + jenisBrg);
    System.out.println("Stok: " + stok);
  }

  public int tambahStok(int brgMasuk) {
    return stok += brgMasuk;
  }
}