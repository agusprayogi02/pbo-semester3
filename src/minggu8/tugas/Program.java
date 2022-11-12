package minggu8.tugas;

public class Program {
  public static void main(String[] args) {
    Dosen dosen = new Dosen();
    dosen.bernafas();
    dosen.makan();
    dosen.lembur();

    Mahasiswa mahasiswa = new Mahasiswa();
    mahasiswa.bernafas();
    mahasiswa.makan();
    mahasiswa.tidur();
  }
}
