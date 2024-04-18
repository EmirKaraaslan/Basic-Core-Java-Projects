public class Calisan {

    public String ad;
    public String soyAd;

    public int yas;

    public String bolum;

    public  Yazilimci[] yazilimci;

    private   static int calisanSayisi;


    public  Calisan(String ad , String soyAd , int yas ){
        this.ad= ad;
        this.soyAd = soyAd;
        this.yas = yas;


    }

    public Calisan(String ad , String soyAd){
        this.ad = ad ;
        this.soyAd = soyAd;
    }

    public Calisan(){};

    public void BilgileriYazdir(){
        System.out.println("Ad : " + this.ad);
        System.out.println("Soy Ad : " + this.soyAd);
        System.out.println("Yas : " + this.yas);
    }




    public void setAd(String yazilimciAd) {
        this.ad = yazilimciAd;
    }


    public void setSoyAd(String yazilimciSoyAd) {

        this.soyAd = yazilimciSoyAd;
    }

    public void setYas(int yazilimciYas) {
        this.yas = yazilimciYas;
    }

    public void setBolum(String yazilimciBolum) {
        this.bolum = yazilimciBolum;
    }

    public void setCalisanSayisi(int yazilimciSay){
        this.calisanSayisi = yazilimciSay;
    }

    public int CalisanSayisiVer() {

            return  this.calisanSayisi;

    }





}
