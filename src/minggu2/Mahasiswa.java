package minggu2;

/**
 * Mahasiswa
 */
public class Mahasiswa {

  public int nim;
  public String nama, alamat, kelas;

  public void tampilBiodata() {
    System.out.println("NIM: " + nim);
    System.out.println("Nama: " + nama);
    System.out.println("Alamat: " + alamat);
    System.out.println("Kelas: " + kelas);
  }
}