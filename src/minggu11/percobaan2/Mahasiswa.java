package minggu11.percobaan2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Mahasiswa {
  private String nama;

  public void kuliahDiKampus() {
    System.out.println("Aku mahasiswa, namaku " + this.nama);
    System.out.println("Aku berkuliah di kampus.");
  }
}
