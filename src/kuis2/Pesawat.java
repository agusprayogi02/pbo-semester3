package kuis2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pesawat implements LayananExtra {
  private int biayaCheckIn, hargaTiket;

  public int hartaTotal() {
    return biayaCheckIn + hargaTiket + karaoke() + restorasi();
  }

  public int karaoke() {
    return 5000;
  }

  public int restorasi() {
    return 6000;
  }
}
