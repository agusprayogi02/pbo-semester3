package minggu4.percobaan1;

public class Laptop {
  private String merk;
  private Processor proc;

  public Laptop(String merk, Processor proc) {
    this.merk = merk;
    this.proc = proc;
  }

  public Laptop() {
  }

  public void info() {
    System.out.println("Merk Laptop = " + merk);
    proc.info();
  }

  public String getMerk() {
    return merk;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public Processor getProc() {
    return proc;
  }

  public void setProc(Processor proc) {
    this.proc = proc;
  }
}
