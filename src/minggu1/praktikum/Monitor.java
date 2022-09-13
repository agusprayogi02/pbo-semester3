
package minggu1.praktikum;

public class Monitor extends Elektronik {
  private String jenisInput;
  private boolean isTerhubungPC;

  void hubungPc(String j) {
    jenisInput = j;
    isTerhubungPC = true;
  }

  boolean checkTerhubungPc() {
    return isTerhubungPC;
  }

  String lihatJenisInput() {
    return jenisInput;
  }
}
