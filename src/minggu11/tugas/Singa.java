package minggu11.tugas;

public class Singa extends Binatang implements IKarnivora {
  private String suara, warnaBulu;

  public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
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
    System.out.println("Jenis: Karnivora");
    System.out.println("Makanan: Daging");
  }

  public void displayData() {
    displayMakan();
    displayBinatang();
    System.out.println("Suara: " + suara);
    System.out.printf("Warna Bulu: %s\n\n", warnaBulu);
  }
}
