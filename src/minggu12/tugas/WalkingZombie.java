package minggu12.tugas;

public class WalkingZombie extends Zombie {

  public WalkingZombie(int health, int level) {
    this.health = health;
    this.level = level;
  }

  @Override
  public void destroyed() {
    health -= (int) (0.2 * health);
  }

  @Override
  public void heal() {
    switch (level) {
      case 1:
        health += (int) (0.1 * health);
        break;
      case 2:
        health += (int) (0.3 * health);
        break;
      case 3:
        health += (int) (0.4 * health);
        break;
      default:
        break;
    }
  }

  @Override
  public String getZombieInfo() {
    String info = super.getZombieInfo();
    return "Walking Zombie Data = \n" + info;
  }
}
