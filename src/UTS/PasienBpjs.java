package UTS;

public class PasienBpjs extends Pasien {

  @Override
  public int hitungBiaya() {
    int total = super.hitungBiaya();
    return total - (int) (total * 0.01);
  }
}
