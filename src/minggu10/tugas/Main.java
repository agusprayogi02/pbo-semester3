package minggu10.tugas;

public class Main {
  public static void main(String[] args) {

    Manusia manusia = new Manusia();
    manusia.setNama("Rizki Adam Kurniawan");

    Profesi profesi = new Dokter();
    profesi.print();
  }
}
