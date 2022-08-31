/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;

/**
 *
 * @author agus
 */
public class Sepeda {

    private String merek;
    private int kecepatan;
    private int gear;

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void gantiGear(int gear) {
        this.gear = gear;
    }

    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
    }

    public void rem(int rem) {
        kecepatan -= rem;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}
