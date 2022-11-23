package minggu12.tugas;

public abstract class Zombie implements Destroyable {
  protected int health;
  protected int level;

  public abstract void heal();

  @Override
  public abstract void destroyed();

  public String getZombieInfo() {
    return "Health = " + health + "\n" + "Level = " + level + "\n";
  }
}
