package minggu8.percobaan1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Karyawan {
    private String nama, nip, golongan;
    private double gaji;

    public void setGolongan(String golongan) {
        this.golongan = golongan;

        switch (golongan.charAt(0)) {
            case '1':
                gaji = 5000000;
                break;
            case '2':
                gaji = 3000000;
                break;
            case '3':
                gaji = 2000000;
                break;
            case '4':
                gaji = 1000000;
                break;
            case '5':
                gaji = 750000;
                break;
        }
    }
}
