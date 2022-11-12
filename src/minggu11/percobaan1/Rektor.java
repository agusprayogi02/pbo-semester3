package minggu11.percobaan1;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silakan perkenalkan diri Anda..");

        mahasiswa.perkenalan();
        mahasiswa.lulus();
        mahasiswa.meriahIPKTinggi();

        System.out.println("-".repeat(50));
    }
}
