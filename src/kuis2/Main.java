package kuis2;

public class Main {
  public static void main(String[] args) {
    Pembayaran p = new Pembayaran();
    KeretaApiEkonomi kae = new KeretaApiEksekutif();
    kae.setHargaTiket(2000);
    System.out.println("Harga total kereta api eksekutif = " + p.bayar(kae));

    Pesawat pes = new Pesawat();
    pes.setHargaTiket(5000);
    pes.setBiayaCheckIn(1000);
    System.out.println("Harga total pesawat = " + p.bayar(pes));

    KeretaApiEkonomi ka = new KeretaApiEkonomi();
    ka.setHargaTiket(1500);
    System.out.println("Harga total kereta api ekonomi = " + p.bayar(ka));

    KapalPesiar kp = new KapalPesiar();
    kp.setBiayaTiket(4000);
    kp.setBiayaReservasi(5000);
    kp.setBiayaVisa(10000);
    System.out.println("Harga total kapal pesiar = " + p.bayar(kp));
  }
}
