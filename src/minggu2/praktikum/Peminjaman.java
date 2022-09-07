package minggu2.praktikum;

/**
 * Peminjaman
 */
public class Peminjaman {

  public int id, lamaSewa, harga;
  public String namaMember, namaGame;

  public int hitungHargaBayar() {
    return lamaSewa * harga;
  }

  public void tampilData() {
    System.out.println("ID: " + id);
    System.out.println("Nama Member: " + namaMember);
    System.out.println("Nama Game: " + namaGame);
    System.out.println("Lama Pinjam: " + lamaSewa);
    System.out.println("Harga: " + harga);
    System.out.println("Harga Bayar: " + hitungHargaBayar());
  }
}