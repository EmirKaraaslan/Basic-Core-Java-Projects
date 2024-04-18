import java.util.Scanner;

public class denemeImplement {
    public static void main(String[] args) {

        System.out.print("enter deneme size : ");
        Scanner sc = new Scanner(System.in);

        int denemeSize = sc.nextInt();
        Deneme[] denemes = new Deneme[denemeSize];



        for(int i = 0 ; i< denemeSize;i++){
            denemes[i] = new Deneme();

        }

        denemes[0].setName("Emir");
        denemes[0].setID(1234);
        denemes[0].setAge(23);


        Ogrenci newOgr = new Ogrenci();

        System.out.print("ogrencinin adını giriniz : ");
        String ogrAd = sc.next();
        newOgr.setOgrAd(ogrAd);
        System.out.print("ogrencinin numarasını girin : ");
        int ogrID=sc.nextInt();
        newOgr.setOgrID(ogrID);






    }
}
