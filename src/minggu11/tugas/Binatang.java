package minggu11.tugas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;

    public abstract void displayBinatang();
}
