package minggu11.tugas;

public class Keledai extends Binatang implements IHerbivora {
  private String suara, warnaBulu;

  public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
    super(nama, jmlKaki);
    this.suara = suara;
    this.warnaBulu = warnaBulu;
  }

  @Override
  public void displayBinatang() {
    System.out.println("Nama: " + nama);
    System.out.println("Jumlah Kaki: " + jmlKaki);
  }

  @Override
  public void displayMakan() {
    System.out.println("Jenis: Herbivora");
    System.out.println("Makanan: Tumbuhan");
  }

  public void displayData() {
    displayMakan();
    displayBinatang();
    System.out.println("Suara: " + suara);
    System.out.printf("Warna Bulu: %s\n\n", warnaBulu);
  }
}
