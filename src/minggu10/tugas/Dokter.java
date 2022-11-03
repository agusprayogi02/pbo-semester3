package minggu10.tugas;

public class Dokter extends Profesi {

  public Dokter() {
    this.gaji = 2500000;
    this.lamaKerja = 1;
    this.tingkatan = Tingkatan.Junior;
  }

  public Dokter(int gaji, int lamaKerja, Tingkatan tingkatan) {
    super(gaji, lamaKerja, tingkatan);
  }

  @Override
  void print() {
    System.out.println("Saya berprofesi sebagai Dokter tingkat " + tingkatan);
  }
}
