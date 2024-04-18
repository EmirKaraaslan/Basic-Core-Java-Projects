public class Ders {
    private int bolNO;
    private int dersID;
    private String dersAd;
    private int dersKredi;

    private int dersSayisi;

    public void setDersAd(String dersAd) {
        this.dersAd = dersAd;
    }


    public void setDersID(int dersID) {
        this.dersID=dersID;
    }

    public void setDersKredi(int dersKredi) {
        this.dersKredi=dersKredi;
    }


    public void setDersBolNo(int bolNo) {
        this.bolNO=bolNo;
    }

    public int getDersNo() {
        return this.dersID;
    }

    public String getDersAd() {
        return this.dersAd;
    }

    public int getDersKredi() {
        return this.dersKredi;
    }


}
