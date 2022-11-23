package minggu12.tugas;

public class JumpingZombie extends Zombie {
  public JumpingZombie(int health, int level) {
    this.health = health;
    this.level = level;
  }

  @Override
  public void heal() {
    switch (level) {
      case 1:
        health += health * 0.3;
        break;
      case 2:
        health += health * 0.4;
        break;
      case 3:
        health += health * 0.5;
        break;
    }
  }

  @Override
  public void destroyed() {
    health -= (int) (0.1 * health);
  }

  @Override
  public String getZombieInfo() {
    String info = super.getZombieInfo();
    return "Jumping Zombie Data = \n" + info;
  }
}
