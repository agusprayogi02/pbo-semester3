package UTS;

public class Pasien {
  public String nama;
  public Obat[] ob;

  public int hitungBiaya() {
    int total = 0;
    for (Obat o : ob) {
      total += o.getHarga();
    }
    return total;
  }

  public void print() {
    System.out.println("=".repeat(30));
    System.out.println("| Nama: " + nama);
    System.out.println("=".repeat(30));
    System.out.println("Daftar Obat: ");
    for (int i = 0; i < ob.length; i++) {
      if (ob[i] instanceof ObatHerbal) {
        ObatHerbal hb = (ObatHerbal) ob[i];
        System.out.println((i + 1) + ". " + hb.getMerk() + " (" + hb.getJenis() + ")" + " \t-> RP." + ob[i].getHarga());
      } else {
        System.out.println((i + 1) + ". " + ob[i].getMerk() + " \t-> RP." + ob[i].getHarga());
      }
    }
    System.out.println("=".repeat(30));
    System.out.println("Total Biaya \t=> Rp." + hitungBiaya());
    System.out.println("=".repeat(30));
    System.out.println();
  }
}
