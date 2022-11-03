package minggu10.tugas;

enum Tingkatan {
  Junior, Senior
}

abstract class Profesi {
  protected int gaji, lamaKerja;
  protected Tingkatan tingkatan;

  public Profesi() {
  }

  public Profesi(int gaji, int lamaKerja, Tingkatan tingkatan) {
    this.gaji = gaji;
    this.lamaKerja = lamaKerja;
    this.tingkatan = tingkatan;
  }

  abstract void print();
}
