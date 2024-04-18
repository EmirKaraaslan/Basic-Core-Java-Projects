import java.util.Scanner;

public class Anasayfa {
    public static void main(String[] args) {
        Calisan calisan = new Calisan();
        System.out.print("Lütfen yazılımcı sayısını giriniz :");

        Scanner sc = new Scanner(System.in);

        int yazilimciSayisi = sc.nextInt();

          calisan.yazilimci=new Yazilimci[yazilimciSayisi];
          calisan.setCalisanSayisi(yazilimciSayisi);


            for(int i = 0 ; i < yazilimciSayisi ; i++){
                calisan.yazilimci[i] = new Yazilimci();

            }

        for(int i = 0 ; i< yazilimciSayisi ; i++){
            System.out.print("Yazilimicinin adını giriniz : ");
            String yazilimciAd = sc.next();
            calisan.yazilimci[i].setAd(yazilimciAd);

            System.out.print("Yazilimicinin Soy adını giriniz : ");
            String yazilimciSoyAd = sc.next();
           calisan.yazilimci[i].setSoyAd(yazilimciSoyAd);

            System.out.print("Yazilimicinin yaşını giriniz : ");
            int yazilimciYas = sc.nextInt();
            calisan.yazilimci[i].setYas(yazilimciYas);

            System.out.print("Yazilimicinin bölümünü giriniz : ");
            String yazilimciBolum = sc.next();
            calisan.yazilimci[i].setBolum(yazilimciBolum);

            System.out.print("Yazilimicinin ID'sini giriniz : ");
            int yazilimciId = sc.nextInt();
            calisan.yazilimci[i].setId(yazilimciId);

            System.out.print("Yazilimicinin Gs'sini giriniz : ");
            int yazilimciGs = sc.nextInt();
            calisan.yazilimci[i].setGs(yazilimciGs);







        }
        System.out.print("Çalışan Sayısı :  ");
        calisan.CalisanSayisiVer();
        System.out.println();
        for(int i = 0 ; i< yazilimciSayisi ; i++){
            System.out.println("----------Yazılımcı Bilgileri--------");
            calisan.yazilimci[i].BilgileriYazdir();
            System.out.println();
        }

        for (int i = 0 ; i< yazilimciSayisi ; i++){
            calisan.yazilimci[i].ZamHesapla();
        }

        System.out.println(calisan.CalisanSayisiVer());;




    }
}