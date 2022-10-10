package kuis1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Buku buku1 = new Buku();
    buku1.setKode("B001");
    buku1.setJudul("Pemrograman Berbasis Objek dengan Java");
    buku1.setPengarang("Frisaranda Diof Julio");
    buku1.setThnTerbit(2017);
    Buku buku2 = new Buku();
    buku2.setKode("B002");
    buku2.setJudul("Dasar Pemrograman Php");
    buku2.setPengarang("Diah Putri Nofianti");
    buku2.setThnTerbit(2014);
    Buku buku3 = new Buku();
    buku3.setKode("B003");
    buku3.setJudul("Tutorial Flutter");
    buku3.setPengarang("Asadilah ramadhan");
    buku3.setThnTerbit(2019);
    Buku buku4 = new Buku();
    buku4.setKode("B004");
    buku4.setJudul("Dasar Pemrograman Dart");
    buku4.setPengarang("Maulana Arip Wijaya");
    buku4.setThnTerbit(2020);
    Buku buku5 = new Buku();
    buku5.setKode("B005");
    buku5.setJudul("Dasar Pemrograman C++");
    buku5.setPengarang("Maulana Arip Wijaya");
    buku5.setThnTerbit(2020);
    Buku buku6 = new Buku();
    buku6.setKode("B006");
    buku6.setJudul("Dasar Pemrograman C");
    buku6.setPengarang("Diah Putri Nofianti");
    buku6.setThnTerbit(2014);

    Buku[] buku = { buku1, buku2, buku3, buku4, buku5, buku6 };
    Member member = new Member("M001");
    member.setNama("Hello World");
    member.setBuku(buku);
    List<Member> members = new ArrayList<>();
    members.add(member);
    int pil;
    Scanner inp = new Scanner(System.in);
    Scanner inpNum = new Scanner(System.in);

    do {
      System.out.println("===== Menu =====");
      System.out.println("1. Tambah Member");
      System.out.println("2. Tampilkan Data Member");
      System.out.println("3. Tampilkan Buku Terbaru");
      System.out.println("4. Tampilkan Buku Terlama");
      System.out.println("5. Keluar");
      System.out.print("Pilih menu: ");
      pil = inpNum.nextInt();
      switch (pil) {
        case 1:
          System.out.println("===== Tambah Member =====");
          System.out.print("Masukkan ID Member: ");
          String id = inp.next();
          Member member1 = new Member(id);
          System.out.print("Masukkan Nama Member: ");
          member1.setNama(inp.next());
          member1.setBuku(buku);
          members.add(member1);
          break;
        case 2:
          System.out.println("===== Tampilkan Data Member =====");
          for (Member item : members) {
            item.tampilData();
          }
          break;
        case 3:
          System.out.println("===== Tampilkan Buku Terbaru =====");
          for (Member item : members) {
            if (item.getBuku().length != 0) {
              System.out.println("-".repeat(23));
              System.out.println("Buku Yang dipinjam: " + item.getNama());
              System.out.println("-".repeat(23));
              item.tampilData();
              item.tampilBukuTerbaru();
            }
          }
          break;
        case 4:
          System.out.println("===== Tampilkan Buku Terlama =====");
          for (Member item : members) {
            if (item.getBuku().length != 0) {
              System.out.println("-".repeat(23));
              System.out.println("Buku Yang dipinjam: " + item.getNama());
              System.out.println("-".repeat(23));
              item.tampilData();
              item.tampilBukuTerlama();
            }
          }
          break;
        default:
          break;
      }
    } while (pil >= 1 && pil < 5);
    inp.close();
    inpNum.close();
  }
}
