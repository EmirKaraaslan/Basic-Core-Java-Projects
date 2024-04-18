import java.util.ArrayList;
import java.util.Arrays;

public class Bolum {

    private int bolNo;
    private String bolAd;

    private  int ogrSayisi;
    private  int dersSayisi;
    public Ogrenci ogrenciler[];
    public Ders dersler[];
    public Bolum bolumlar[];

    public int bolumSize;



    public Bolum() {


    }

    public Bolum(int bolNo, String bolAd) {
        this.bolNo = bolNo;
        this.bolAd = bolAd;
        //addBolumlar();

    }


    public void setBolNo(int bolNo) {
        this.bolNo = bolNo;
    }

    public void setBolAd(String bolAd) {
        this.bolAd=bolAd;
    }

    public int getBolumNo() {
        return  this.bolNo;
    }

    public String getBolumAdı() {
        return  this.bolAd;
    }


    public void setOgrSayisi(int ogrenciSayisi) {
        this.ogrSayisi = ogrenciSayisi;
    }

    public int getOgrSayisi(){
        return this.ogrSayisi;
    }

    public void setDersSayisi(int dersSayisi) {
        this.dersSayisi=dersSayisi;
    }

    public int getDersSayisi(){
        return  this.dersSayisi;
    }
}





