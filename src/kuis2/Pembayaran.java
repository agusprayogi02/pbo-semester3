package kuis2;

public class Pembayaran {
  public int bayar(KeretaApiEkonomi kae) {
    if (kae instanceof KeretaApiEksekutif) {
      KeretaApiEksekutif kaek = (KeretaApiEksekutif) kae;
      return kaek.hartaTotal();
    }
    return kae.hartaTotal();
  }

  public int bayar(LayananExtra le) {
    if (le instanceof Pesawat) {
      Pesawat pe = (Pesawat) le;
      return pe.hartaTotal();
    } else if (le instanceof KapalPesiar) {
      KapalPesiar kp = (KapalPesiar) le;
      return kp.hargaTotal();
    }
    return 0;
  }
}
