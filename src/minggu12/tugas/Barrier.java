package minggu12.tugas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Barrier implements Destroyable {
  private int strength;

  public Barrier(int strength) {
    this.strength = strength;
  }

  @Override
  public void destroyed() {
    strength -= (strength * 0.1);
  }

  public String getBarrierInfo() {
    return "Barrier Strength = " + strength + "\n";
  }
}
