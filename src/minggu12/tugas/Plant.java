package minggu12.tugas;

public class Plant {
  public void doDestroyed(Destroyable d) {
    if (d instanceof WalkingZombie) {
      WalkingZombie wz = (WalkingZombie) d;
      wz.destroyed();
    } else if (d instanceof JumpingZombie) {
      JumpingZombie jz = (JumpingZombie) d;
      jz.destroyed();
    } else if (d instanceof Barrier) {
      Barrier b = (Barrier) d;
      b.destroyed();
    }
  }
}
