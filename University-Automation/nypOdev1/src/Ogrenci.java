public class Ogrenci {

    private int bolNo;
    private  int ogrID;
    private  String ogrAd;
    private String ogrSoyad;
    private String ogrSinif;




    public Ogrenci(){

    }
    public Ogrenci(int ogrID , String ogrAd , String ogrSoyad , int bolNo){
        this.ogrID = ogrID;
        this.ogrAd = ogrAd;
        this.ogrSoyad = ogrSoyad;
        this.bolNo = bolNo;
    }

    public Ogrenci(int ogrID , String ogrAd , String ogrSoyad ){
        this.ogrID = ogrID;
        this.ogrAd = ogrAd;
        this.ogrSoyad = ogrSoyad;
    }

    public void setOgrID(int ogrNo) {
        this.ogrID = ogrNo;
    }

    public void setOgrAd(String ogrAd) {
        this.ogrAd = ogrAd;
    }


    public void setOgrSoyad(String ogrSoyad) {
        this.ogrSoyad = ogrSoyad;
    }

    public void setOgrSinifi(String ogrSinif) {
        this.ogrSinif = ogrSinif;
    }

    public void setOgrBolumNum(int bolNo) {
        this.bolNo = bolNo;
    }

    public int getOgrenciNo() {
        return this.ogrID;
    }

    public String getOgrenciAd() {
        return  this.ogrAd;
    }

    public String getOgrenciSoyAd() {
        return  this.ogrSoyad;
    }

    public String getOgrenciSinif() {
        return this.ogrSinif;
    }
}
