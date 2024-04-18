public class Yazilimci extends Calisan {

    private int id;
    private  int gs;

    public  Yazilimci(String ad , String soyAd,int yas , String Bolum, int id , int gs){
        super(ad,soyAd,yas);

        this.id = id;
        this.bolum = "Yazılımcı";
        this.gs = gs;

    }

    public  Yazilimci(){};


    public void setId(int yazilimciId) {
        this.id = yazilimciId;
    }

    public void setGs(int yazilimciGs) {
        this.gs = yazilimciGs;
    }

    public void ZamHesapla(){
        if(this.gs > 10 && this.gs <20){
            System.out.println((((this.yas)*30)/100));
        }
        else  if(this.gs > 20){
            System.out.println((((this.yas)*40)/100));

        }
        else {
            System.out.println((((this.yas)*10)/100));

        }




    }


    public void BilgileriYazdir(){
        System.out.println("Ad : " + this.ad);
        System.out.println("Soy Ad : " + this.soyAd);
        System.out.println("Yas : " + this.yas);
        System.out.println("Id : " + this.id);
        System.out.println("Gs : "+ this.gs);
    }
}
