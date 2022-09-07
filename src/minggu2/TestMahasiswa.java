package minggu2;

/**
 * TestMahasiswa
 */
public class TestMahasiswa {

  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa();
    Mahasiswa mhs2 = new Mahasiswa();
    Mahasiswa mhs3 = new Mahasiswa();

    mhs2.nim = 102;
    mhs2.nama = "Puput";
    mhs2.alamat = "Jl. Hello No. 1A";
    mhs2.kelas = "1A";

    mhs3.nim = 103;
    mhs3.nama = "Haikal";
    mhs3.alamat = "Jl. World No. 2B";
    mhs3.kelas = "1A";

    mhs1.nim = 101;
    mhs1.nama = "Lisa Palombo";
    mhs1.alamat = "Jl. Vinolia No 1A";
    mhs1.kelas = "1A";
    mhs1.tampilBiodata();
  }
}