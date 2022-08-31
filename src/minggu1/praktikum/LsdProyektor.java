package minggu1.praktikum;

/**
 *
 * @author agus
 */
public class LsdProyektor extends Elektronik {
    private int kecerahan, rotasi;
    private String status = "mati";
    
    public void tampilLayar(){
        status = "tampil";
    }
    
    public void tambahKecerahan(){
        kecerahan++;
    }
    
    public void kurangiKecerahan(){
        kecerahan--;
    }
    
    public void setRotasiLayar(int val){
        rotasi = val;
    }
}
