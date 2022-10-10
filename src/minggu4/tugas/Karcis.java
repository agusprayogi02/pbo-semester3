package minggu4.tugas;

public class Karcis {
    private String nomor;
    private String tanggal;
    private Motor motor;
    private String status;

    public Karcis(String nomor, String tanggal, Motor motor, String status) {
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.motor = motor;
        this.status = status;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void tampilData() {
        System.out.println("Nomor Karcis : " + nomor);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Merk Motor : " + motor.getMerk());
        System.out.println("Warna Motor : " + motor.getWarna());
        System.out.println("Plat Nomor : " + motor.getPlatNomor());
        System.out.println("Nama Pemilik : " + motor.getPemilik().getNama());
        System.out.println("NIK Pemilik : " + motor.getPemilik().getNik());
        System.out.println("Alamat Pemilik : " + motor.getPemilik().getAlamat());
        System.out.println("No HP Pemilik : " + motor.getPemilik().getNoHp());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
