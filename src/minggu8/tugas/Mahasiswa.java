package minggu8.tugas;

public class Mahasiswa extends Manusia {

  @Override
  public void makan() {
    System.out.println("Mahasiswa juga manusia, jadi bisa makan");
  }

  public void tidur() {
    System.out.println("Mahasiswa juga manusia, jadi bisa tidur");
  }
}
