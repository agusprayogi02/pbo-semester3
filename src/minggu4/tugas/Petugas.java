package minggu4.tugas;

public class Petugas {
    private String nip;
    private String nama;
    private String noHp;
    private Karcis[] karcises;

    public Petugas(String nip, String nama, String noHp) {
        this.nip = nip;
        this.nama = nama;
        this.noHp = noHp;
        karcises = new Karcis[10];
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public Karcis[] getKarcises() {
        return karcises;
    }

    public void setKarcises(Karcis[] karcises) {
        this.karcises = karcises;
    }

    public void tambahKarcis(Karcis karcis) {
        for (int i = 0; i < karcises.length; i++) {
            if (karcises[i] == null) {
                karcises[i] = karcis;
                break;
            }
        }
    }

    public void tampilData() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("No. HP : " + noHp);
        System.out.println("=".repeat(10) + " Karcis " + "=".repeat(10));
        for (int i = 0; i < karcises.length; i++) {
            if (karcises[i] != null) {
                karcises[i].tampilData();
                System.out.println("=".repeat(28));
            }
        }
    }
}
