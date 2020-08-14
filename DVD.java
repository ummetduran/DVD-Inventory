/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ümmet
 */
import java.util.ArrayList;

/**
 * Created by Ümmet on 9.5.2018.
 */
public class DVD {

    private String adSoyad;
    private String dvdBasligi;
    private int cikisTarihi;
    private int fiyat;
    public ArrayList<String> sarkilar;

    public DVD() {
        adSoyad="";
        dvdBasligi="";
        cikisTarihi=0;
        fiyat=0;
        sarkilar=new ArrayList<>();
    }

    public DVD(String adSoyad, String dvdBasligi, int cikisTarihi, int fiyat) {
        this.adSoyad = adSoyad;
        this.dvdBasligi = dvdBasligi;
        this.cikisTarihi = cikisTarihi;
        this.fiyat = fiyat;
        sarkilar=new ArrayList<>();
    }

    public String getAdSoyad() {

        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getDvdBasligi() {
        return dvdBasligi;
    }

    public void setDvdBasligi(String dvdBasligi) {
        this.dvdBasligi = dvdBasligi;
    }

    public int getCikisTarihi() {
        return cikisTarihi;
    }

    public void setCikisTarihi(int cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return  "Ad Soyad: "+adSoyad+" DVD Basligi: " + dvdBasligi  +
                " Çıkış Tarihi: " + cikisTarihi +
                " Fiyat: " + fiyat +" TL"+
                "\nSarkilar: " + sarkilar;
    }
}
