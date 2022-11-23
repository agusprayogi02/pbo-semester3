package kuis2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KapalPesiar implements LayananExtra {
  private int biayaReservasi, biayaVisa, BiayaTiket;

  public int hargaTotal() {
    return BiayaTiket + biayaReservasi + biayaVisa + karaoke() + restorasi();
  }

  @Override
  public int karaoke() {
    return 3000;
  }

  @Override
  public int restorasi() {
    return 4000;
  }
}
