package minggu11.tugas;

public class Gorilla extends Binatang implements IHerbivora, IKarnivora {
  private String suara, warnaBulu;

  public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
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
    System.out.println("Jenis: Karnivora + Herbivora");
    System.out.println("Makanan: Daging + Tumbuhan");
  }

  public void displayData() {
    displayMakan();
    displayBinatang();
    System.out.println("Suara: " + suara);
    System.out.printf("Warna Bulu: %s\n\n", warnaBulu);
  }
}
