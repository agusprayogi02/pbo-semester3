package minggu8.tugas;

public class Segitiga {
  private int sudut;

  public int totalSudut(int sudutA) {
    sudut = 180 - sudutA;
    return sudut;
  }

  public int totalSudut(int sudutA, int sudutB) {
    sudut = 180 - (sudutA + sudutB);
    return sudut;
  }

  public int keliling(int sisiA, int sisiB, int sisiC) {
    return sisiA + sisiB + sisiC;
  }

  public double keliling(int sisiA, int sisiB) {
    return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
  }

  public static void main(String[] args) {
    Segitiga segitiga = new Segitiga();
    System.out.println("Total sudut A: " + segitiga.totalSudut(45));
    System.out.println("Total sudut A, B: " + segitiga.totalSudut(45, 45));
    System.out.println("Keliling A, B, C: " + segitiga.keliling(5, 5, 5));
    System.out.println("Keliling A, B: " + segitiga.keliling(5, 5));
  }
}
