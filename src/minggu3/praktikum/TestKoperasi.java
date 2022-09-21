package minggu3.praktikum;

import java.util.Scanner;

public class TestKoperasi {

  public static void main(String[] args) {
    Anggota donny = new Anggota("111333444", "Donny", 5000000);
    Scanner inp = new Scanner(System.in);
    int pilih = 0, value = 0;

    System.out.println("Nama Anggota: " + donny.getNama());
    System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
    System.out.println("Jumlah Pinjaman: " + donny.getJumlahPinjaman());

    do {
      System.out.println("Menu");
      System.out.println("1. Pinjam");
      System.out.println("2. Angsur");
      System.out.println("3. Keluar");
      System.out.print("Pilih: ");
      pilih = inp.nextInt();
      if (pilih == 1) {
        System.out.print("Masukkan jumlah pinjaman: ");
        value = inp.nextInt();
        donny.pinjam(value);
        System.out.println(donny.getNama() + " Meminjam uang " + value);
      } else if (pilih == 2) {
        System.out.print("Masukkan jumlah angsuran: ");
        value = inp.nextInt();
        donny.pinjam(value);
        System.out.println(donny.getNama() + " Membayar angsuran " + value);
      }
      System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman() + "\n");
    } while (pilih > 0 && pilih < 3);
    inp.close();

    // donny.pinjam(10000000);

    // System.out.println("\nMeminjam uang 4.000.000...");
    // donny.pinjam(4000000);

    // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    // System.out.println("\nMembayar angsuran 100.000");
    // donny.angsur(100000);

    // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    // System.out.println("\nMembayar angsuran 1.000.000");
    // donny.angsur(1000000);

    // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    // System.out.println("\nMembayar angsuran 3.000.000");

    // donny.angsur(3000000);
    // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
  }
}
