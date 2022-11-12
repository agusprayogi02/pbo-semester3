package minggu11.percobaan2;

public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
  public Sarjana(String nama) {
    super(nama);
  }

  @Override
  public void menjuaraiKompetisi() {
    System.out.println("Saya telah menjuarai kompetisi NASIONAL");
  }

  @Override
  public void membuatPublikasiIlmiah() {
    System.out.println("Saya telah menerbitkan artikel di jurnal NASIONAL");
  }

  @Override
  public void lulus() {
    System.out.println("Saya sudah menyelesaikan SKRIPSI");
  }

  @Override
  public void meraihIPKTinggi() {
    System.out.println("IPK-ku lebih dari 3,51");
  }
}
