
package minggu1.praktikum;

public class Keyboard {
  private String abjad;
  private boolean isCapsLock;
  private boolean isTerhubungPC;

  void inputAbjad(String val) {
    this.abjad = val;
  }

  void inputCapsLock(boolean val) {
    this.isCapsLock = val;
  }

  void checkTerhubungPc(boolean val) {
    this.isTerhubungPC = val;
  }
}
