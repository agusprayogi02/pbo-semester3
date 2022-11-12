package minggu11.percobaan2;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
  @Override
  public void menjuaraiKompetisi() {
    System.out.println("Saya telah menjuarai kompetisi NASIONAL");
  }

  @Override
  public void membuatPublikasiIlmiah() {
    System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
  }

  public PascaSarjana(String nama) {
    super(nama);
  }

  @Override
  public void lulus() {
    System.out.println("Aku sudah menyelesaikan TESIS");
  }

  @Override
  public void meraihIPKTinggi() {
    System.out.println("IPK-ku lebih dari 3,71");
  }
}