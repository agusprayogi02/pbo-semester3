package UTS;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ObatHerbal extends Obat {

  private String jenis;

  public ObatHerbal(int harga, String merk, String jenis) {
    super(harga + 500, merk);
    this.jenis = jenis;
  }
}