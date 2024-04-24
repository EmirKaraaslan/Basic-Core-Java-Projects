import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anasayfa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        Kursiyer rootKursiyer = new Kursiyer();
        Kurs rootKurs = new Kurs();


        ArrayList<Kursiyer> kursiyers = new ArrayList<>();
        ArrayList<Kurs> kursus = new ArrayList<>();

        rootKursiyer.readKursiyerFromDBtoArrayList(kursiyers);
        rootKurs.readKursFromDBtoArrayList(kursus);




        boolean devamEt = true;

        while(devamEt) {

            System.out.println("1-KURS EKLE ");
            System.out.println("2-KURS LİSTELE ");
            System.out.println("3-KURSİYER EKLE ");
            System.out.println("4-KURSİYER ARA ");
            System.out.println("5-KURSİYER SİL ");
            System.out.println("6-KURSİYER LİSTELE");
            System.out.println("7-KURSİYERLERİ AYRINTILI LİSTELE");
            System.out.println("8-KURSİYERİN ÖDEYECEĞİ TUTARLI HESAPLA ");
            System.out.println("9-ÇIKIŞ");
            int menuSecim = sc.nextInt();


            switch (menuSecim) {

                case 1:

                    System.out.print("Eklemek istediğiniz kursun Id'sini giriniz: ");
                    Kurs newKurs = new Kurs();
                    String kursId = sc.next();

                    boolean aynı = true;

                    while (aynı){
                        for(int i = 0; i < kursus.size();i++ ){
                            if(kursus.get(i).getKursId().equals(kursId)){
                                System.out.println("Girdiğiniz ID zaten mevcut!!!");
                                System.out.println("Lütfen başka bir ID seçiniz");

                                kursId = sc.next();



                            }else {
                                newKurs.setKursId(kursId);
                                aynı = false;
                            }
                        }
                    }



                    System.out.println("Eklemek istediğiniz kursun Adını giriniz: ");
                    String kursAd = sc.next();
                    newKurs.setKursAd(kursAd);

                    kursus.add(newKurs);

                    break;

                case 2:
                    System.out.print("Kurs Id     Kurs Adı");
                    System.out.println(" ");
                    for(int j = 0 ; j< kursus.size();j++){
                        System.out.print(kursus.get(j).getKursId());
                        System.out.println("  "+kursus.get(j).getKursAd());
                    }
                    break;

                case 3:
                    System.out.print("Eklemek istediğiniz kursiyerin  Id'sini giriniz: ");
                    Kursiyer newKursiyer = new Kursiyer();
                    ArrayList<Kurs> newKursus = new ArrayList<>();
                    newKursiyer.kurslar = newKursus;
                    String kursiyerId = sc.next();

                    boolean aynı2 = true;

                    while (aynı2){
                        for(int i = 0; i < kursiyers.size();i++ ){
                            if(kursiyers.get(i).getKursiyerId().equals(kursiyerId)){
                                System.out.println("Girdiğiniz ID zaten mevcut!!!");
                                System.out.println("Lütfen başka bir ID seçiniz");

                                kursiyerId = sc.next();



                            }else {
                                newKursiyer.setKursiyerId(kursiyerId);
                                aynı2 = false;
                                break;
                            }
                        }

                        System.out.print("Eklemek istediğiniz kursiyerin Yaşını giriniz: ");
                        String newKursiyerYas = sc.next();
                        newKursiyer.setKursiyerYas(newKursiyerYas);
                        System.out.print("Eklemek istediğiniz kursiyerin Adını Soyadını gitiniz: ");
                        String newKursiyerAdSoyad= sc.next();
                        newKursiyer.setKursiyerAdSoyad(newKursiyerAdSoyad);
                        System.out.print("Eklemek istediğiniz kursiyerin alacağı kurs sayısını giriniz: ");

                        int newKursiyerKursSayisi = sc.nextInt();

                        for(int i = 0 ; i < newKursiyerKursSayisi ; i++){
                            Kurs newKursiyerNewKurs = new Kurs();

                            System.out.print("Eklemek istediğiniz kursun ID'sini giriniz: ");
                            String newKursiyerNewKursId = sc.next();
                            newKursiyerNewKurs.setKursId(newKursiyerNewKursId);



                            System.out.print("Eklemek istediğiniz kursun Adını giriniz: ");
                            String newKursiyerNewKursAd = sc.next();
                            newKursiyerNewKurs.setKursAd(newKursiyerNewKursAd);

                            newKursiyer.kurslar.add(newKursiyerNewKurs);

                            kursiyers.add(newKursiyer);




                        }

                    }




                    break;
                case 4:
                    System.out.print("Aramak istediğiniz kursiyerin ID'sini giriniz: ");
                    String aramaKursiyerID = sc.next();
                        boolean found = false;
                    for(int i = 0; i< kursiyers.size();i++){
                        if(kursiyers.get(i).getKursiyerId().equals(aramaKursiyerID)){
                            System.out.println("Kursiyer bulundu !!!");
                            found = true;

                            System.out.println("Kursiyer ID: "+ kursiyers.get(i).getKursiyerId());
                            System.out.println("Kursiyer Ad-Soyad: "+ kursiyers.get(i).getKursiyerAdSoyad());
                            System.out.println("Kursiyer Yaş: "+ kursiyers.get(i).getKursiyerYas());

                            System.out.println();
                            System.out.println("----------------");
                            System.out.println();
                            System.out.println("Kursiyerin aldığı dersler");
                            System.out.println("--------------------------");
                            for(int j = 0 ; j < kursiyers.get(i).kurslar.size();j++){
                                System.out.println(kursiyers.get(i).kurslar.get(j).getKursId()+" "+kursiyers.get(i).kurslar.get(j).getKursAd());

                            }
                            System.out.println("--------------------------");

                        }
                    }
                    if(!found){
                            System.out.println("Kursiyer BULUNAMADI");
                    }




                    break;
                case 5:
                    System.out.print("Silmek istediğiniz kursiyerin ID'sini giriniz: ");
                    String silID = sc.next();

                    for(int i = 0; i< kursiyers.size();i++){
                        if(kursiyers.get(i).getKursiyerId().equals(silID)){
                            kursiyers.remove(kursiyers.get(i));
                        }
                    }
                    System.out.println("Silind!");


                    break;
                case 6:
                    System.out.println("Tüm Kursiyerler");
                    for(Kursiyer kursiyer: kursiyers){
                        System.out.println(kursiyer.getKursiyerId() +" "+kursiyer.getKursiyerAdSoyad()+" "+kursiyer.getKursiyerYas());
                    }
                    break;
                case 7:
                    System.out.println("Tüm Kursiyerler ve Aldıkları Kurslar");
                    for(Kursiyer kursiyer: kursiyers){
                        System.out.println(kursiyer.getKursiyerId() +" "+kursiyer.getKursiyerAdSoyad()+" "+kursiyer.getKursiyerYas());
                        System.out.println(" ");
                        for (Kurs kurs:kursiyer.kurslar){
                            System.out.print("    ");
                            System.out.println(kurs.getKursId()+" "+ kurs.getKursAd());
                        }
                    }
                    break;
                case 8:
                    System.out.print("Lütfen borcunu öğrenmek istediğiniz kursiyerin ID'sini giriniz: ");
                    String hesapId = sc.next();
                    int Tutar = 0;
                    String kampanyaTuru = "";

                    for(Kursiyer kursiyer :kursiyers){
                        if(kursiyer.getKursiyerId().equals(hesapId)){
                            if(kursiyer.kurslar.size()==2){
                                 Tutar =  740;
                                 kampanyaTuru = "1.Kampanyadan yararlanıldı";



                            }else if(kursiyer.kurslar.size()==3){
                                Tutar = 110*4;
                                kampanyaTuru = "2.Kampanyadan yararlanıldı";

                            } else {
                                Tutar = (90*kursiyer.kurslar.size()*4);
                                kampanyaTuru = "3.Kampanyadan yararlanıldı";

                            }
                        }
                    }

                    System.out.println("Tutar: "+ Tutar);
                    System.out.println("Kampanya Bilgisi: "+kampanyaTuru);



                    break;
                case 9:
                    rootKursiyer.writeKursiyerFromArrayListToDB(kursiyers);
                    rootKurs.writeKursFromArrayListToDB(kursus);
                    devamEt = false;
                    break;

            }
        }



































    }
}