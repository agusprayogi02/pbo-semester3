package kuis1;

public class Member {
  private String id, nama;
  private Buku buku[];

  public Member() {
  }

  public Member(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public Buku[] getBuku() {
    return buku;
  }

  public void setBuku(Buku[] buku) {
    this.buku = buku;
  }

  public void tampilData() {
    System.out.println("===== Data Member =====");
    System.out.println("ID Member: " + id);
    System.out.println("Nama Member: " + nama);
    System.out.println("Buku yang dipinjam: ");
    for (int i = 0; i < buku.length; i++) {
      System.out.println("-".repeat(23));
      System.out.println("Buku ke-" + (i + 1));
      buku[i].tampilData();
      System.out.println("-".repeat(23));
    }
    System.out.println("=".repeat(23));
    System.out.println();
  }

  public void tampilBukuTerbaru() {
    Buku temp = buku[0];
    for (Buku item : buku) {
      if (item.getThnTerbit() > temp.getThnTerbit()) {
        temp = item;
      }
    }
    System.out.println("+".repeat(10) + " Buku Terbaru " + "+".repeat(10));
    for (Buku buku2 : buku) {
      if (buku2.getThnTerbit() == temp.getThnTerbit()) {
        buku2.tampilData();
      }
    }
    System.out.println();
  }

  public void tampilBukuTerlama() {
    Buku temp = buku[0];
    for (Buku item : buku) {
      if (item.getThnTerbit() < temp.getThnTerbit()) {
        temp = item;
      }
    }
    System.out.println("+".repeat(10) + " Buku Terlama " + "+".repeat(10));
    for (Buku buku2 : buku) {
      if (buku2.getThnTerbit() == temp.getThnTerbit()) {
        buku2.tampilData();
      }
    }
    System.out.println();
  }
}
