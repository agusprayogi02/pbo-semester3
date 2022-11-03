package minggu8.percobaan1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void viewStaff(){
        int i;
        System.out.println("--------------------");
        for(i=0;i<st.length;i++){
            st[i].lihatInfo();
        }
        System.out.println("--------------------");
    }

    public void lihatInfo(){
        System.out.println("NIP : "+this.getNip());
        System.out.println("Nama : "+this.getNama());
        System.out.println("Golongan : "+this.getGolongan());
        System.out.printf("Gaji : %.0f\n",this.getGaji());
        System.out.println("Bagian : "+bagian);
        this.viewStaff();
    }

    @Override
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
