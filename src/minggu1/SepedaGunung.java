package minggu1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author agus
 */
public class SepedaGunung extends Sepeda {

    private String tipeSuspensi;

    public void setTipeSuspensi(String value) {
        tipeSuspensi = value;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("TipeSuspensi: " + tipeSuspensi);
    }
}