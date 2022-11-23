package kuis2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KeretaApiEkonomi {
  private int hargaTiket;

  public int hartaTotal() {
    return hargaTiket;
  }
}
