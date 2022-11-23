package kuis2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KeretaApiEksekutif extends KeretaApiEkonomi implements LayananExtra {
  @Override
  public int hartaTotal() {
    return karaoke() + restorasi() + super.hartaTotal();
  }

  @Override
  public int karaoke() {
    return 1000;
  }

  @Override
  public int restorasi() {
    return 2000;
  }
}
