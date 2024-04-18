import java.util.Scanner;

public class AnaSayfa {
    public static void main(String[] args) {
        Bolum rootBolum = new Bolum();
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen kaç bölüm olacağını giriniz : ");
        int bolumSayisi = sc.nextInt();


        Bolum[] bolums = new Bolum[bolumSayisi];

        // kullanıcıdan alınan bölüm sayısı kadar bir array oluşturuyoruz ki oluşturacağımız bölüm objelerini tutsun "Görev 1.0"
        for (int i = 0; i < bolumSayisi; i++) {
            bolums[i] = new Bolum();
        }

        //oluşturduğumuz her bir obje için sırasıyla özelliklerini belirleme  "Görev 2.a"
        for (int i = 0; i < bolumSayisi; i++) {
            System.out.print("Bölüm numarsını girin : ");
            int bolNo = sc.nextInt();
            bolums[i].setBolNo(bolNo);

            System.out.println();

            System.out.print("Bölüm adını giriniz : ");
            String bolAd = sc.next();
            bolums[i].setBolAd(bolAd);

            // bölümler için kullandığımız mantığı burada da öğrenciler için bir daha kullanacağız "Görev 2.b"
            System.out.print("Kaç tane öğrenci var :");
            int ogrenciSayisi = sc.nextInt();


            bolums[i].ogrenciler = new Ogrenci[ogrenciSayisi];

            // kullanıcıdan alınan öğrenci sayısı kadar bir array oluşturuyoruz ki oluşturacağımız öğrenci objelerini tutsun
            for (int j = 0; j < ogrenciSayisi; j++) {
                bolums[i].ogrenciler[j] = new Ogrenci();

            }

            for (int j = 0; j < ogrenciSayisi; j++) {

                bolums[i].setOgrSayisi(ogrenciSayisi);

                System.out.print("Öğrencinin adını giriniz : ");
                String ogrAd = sc.next();
                bolums[i].ogrenciler[j].setOgrAd(ogrAd);

                System.out.print("Öğrencinin Soy adını giriniz : ");
                String ogrSoyAd = sc.next();
                bolums[i].ogrenciler[j].setOgrSoyad(ogrSoyAd);

                System.out.print("Öğrencinin numarasını giriniz : ");
                int ogrID = sc.nextInt();
                bolums[i].ogrenciler[j].setOgrID(ogrID);

                System.out.print("Öğrencinin sınıfını giriniz :");
                String ogrSinif = sc.next();
                bolums[i].ogrenciler[j].setOgrSinifi(ogrSinif);

                // öğrencinin bölümü yöndergede belirtildiği üzre otomatik olarak ait olduğu bölümün numarası ne ise o atanacaktır
                bolums[i].ogrenciler[j].setOgrBolumNum(bolNo);
            }


            // kullanıcıdan alınan ders sayısı kadar bir array oluşturuyoruz ki oluşturacağımız ders objelerini tutsun "Görev 2.c"
            System.out.print("Lütfen bu bölümde yer alan ders sayısını giriniz :");
            int dersSayisi = sc.nextInt();

            bolums[i].dersler = new Ders[dersSayisi];

            for (int k = 0; k < dersSayisi; k++) {

                bolums[i].dersler[k] = new Ders();

            }


            for (int f = 0; f < dersSayisi; f++) {
                bolums[i].setDersSayisi(dersSayisi);
                System.out.print("Bu Dersin adını girin : ");
                String dersAd = sc.next();
                bolums[i].dersler[f].setDersAd(dersAd);

                System.out.print("Bu Dersin kodunu ID'sini  girin : ");
                int dersID = sc.nextInt();
                bolums[i].dersler[f].setDersID(dersID);

                System.out.print("Bu dersin kredsini girin : ");
                int dersKredi = sc.nextInt();
                bolums[i].dersler[f].setDersKredi(dersKredi);

                // Ders bolNO yöndergede belirtildiği üzre otomatik olarak ait olduğu bölümün numarası ne ise o atanacaktır
                bolums[i].dersler[f].setDersBolNo(bolNo);
            }


        }


// Menü  "Görev 3.0"





        boolean devamET = true;
        while (devamET) {
            System.out.println("Sıralama işlemi için lütfen aşağıdaki sıralma tiplerinden birni seçin :");
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("1- Tüm Bölümlerin Bilgilerini Listele");
            System.out.println("2- Bölüm Adına Göre Arama Yap");
            System.out.println("3- Öğrenci Adına Göre Arama Yap");
            System.out.println("4- Ders Adına Göre Arama Yap");
            System.out.println("5- Sınıf Bilgisine Göre Arama Yap");
            System.out.println("6- Ders Kredsine Göre Öğrencileri Bul");
            System.out.println("7- Çıkış");


            int menüSeçim = sc.nextInt();

            switch (menüSeçim) {
                //Görev  Tüm bölümleri listele "3.1"
                case 1:
                        if(bolumSayisi < 0 ){
                            System.out.println("Lütfen geçerli bir bölüm sayısı giriniz");
                            break;
                        }
                    for (int a = 0; a < bolumSayisi; a++) {
                        System.out.println("Bölüm No:  " + bolums[a].getBolumNo() + " Bölüm Ad: " + bolums[a].getBolumAdı());
                        System.out.println("Öğrenciler: ");
                        for (int b = 0; b < bolums[a].getOgrSayisi(); b++) {
                            System.out.println((b + 1) + ". Öğrenci: " + bolums[a].ogrenciler[b].getOgrenciNo() + " " +
                                    bolums[a].ogrenciler[b].getOgrenciAd() + " " + bolums[a].ogrenciler[b].getOgrenciSoyAd() + " " + bolums[a].ogrenciler[b].getOgrenciSinif());
                        }

                        System.out.println("Dersler:");

                        for (int c = 0; c < bolums[a].getDersSayisi(); c++) {
                            System.out.println((c + 1) + ". Ders: " + bolums[a].dersler[c].getDersNo() + " " + bolums[a].dersler[c].getDersAd() + " " + bolums[a].dersler[c].getDersKredi());
                        }
                    }

                    break;
                case 2:
                    // Görev "3.2" bolumAdinaGoreArama *** bölüm ismi unique bu yüzden tüm bölümleri taramasına gerek yok bölüm ismini bulduğu an döngüden çıkabilir

                    System.out.print("Aramak istediğiniz bölümün adını giriniz : ");
                    String bölümArama = sc.next();
                    boolean found = false;
                    for (int i = 0; i < bolumSayisi; i++) {
                        if (bolums[i].getBolumAdı().equals(bölümArama) && !found) {
                            System.out.println("Bölüm No:  " + bolums[i].getBolumNo() + " Bölüm Ad: " + bolums[i].getBolumAdı());
                            System.out.println("Öğrenciler: ");
                            for (int b = 0; b < bolums[i].getOgrSayisi(); b++) {
                                System.out.println((b + 1) + ". Öğrenci: " + bolums[i].ogrenciler[b].getOgrenciNo() + " " +
                                        bolums[i].ogrenciler[b].getOgrenciAd() + " " + bolums[i].ogrenciler[b].getOgrenciSoyAd() + " " + bolums[i].ogrenciler[b].getOgrenciSinif());
                            }

                            System.out.println("Dersler:");

                            for (int c = 0; c < bolums[i].getDersSayisi(); c++) {
                                System.out.println((c + 1) + ". Ders: " + bolums[i].dersler[c].getDersNo() + " " + bolums[i].dersler[c].getDersAd() + " " + bolums[i].dersler[c].getDersKredi());
                            }

                        }

                        found = true;
                    }
                    if (!found) {
                        System.out.println("Aradığınız bölüm bulunamadı");
                    }

                break;
                case 3:
                    //  Görev "3.3" ogrenciAdinaGoreArama *** farklı fakültelerde aynı isme sahip iki farklı öğrenci olabilir
                    System.out.print("Aramak istediğiniz öğrencinin adını giriniz :");
                    String ogrenciArama = sc.next();

                    boolean foundAd = false;
                    for (int i = 0; i < bolumSayisi; i++) {
                        for (int j = 0; j < bolums[i].getOgrSayisi(); j++) {
                            if (bolums[i].ogrenciler[j].getOgrenciAd().equals(ogrenciArama)) {
                                System.out.println("Öğrenci Bilgisi :");
                                System.out.println((j + 1) + ". Öğrenci: " + bolums[i].ogrenciler[j].getOgrenciNo() + " " +
                                        bolums[i].ogrenciler[j].getOgrenciAd() + " " + bolums[i].ogrenciler[j].getOgrenciSoyAd() + " " + bolums[i].ogrenciler[j].getOgrenciSinif() + " " + bolums[i].getBolumAdı());
                                foundAd = true;
                            }


                        }

                    }

                    if (!foundAd) {
                        System.out.println("Aradığınız öğrenci bulunamadı");
                    }

                    break;
                case 4:
                    // Görev"3.4"  dersAdinaGoreArama ***iki farklı fakültede aynı dersler veriliyor olabilir bunu dikkate almalıyız

                    System.out.print("Aramak  istediğiniz dersin adını giriniz: ");
                    String dersArama = sc.next();
                    boolean foundBolum = false;
                    for (int i = 0; i < bolumSayisi; i++) {
                        for (int j = 0; j < bolums[i].getDersSayisi(); j++) {
                            if (bolums[i].dersler[j].getDersAd().equals(dersArama)) {
                                System.out.println("Ders  Bilgileri : ");
                                System.out.println("Ders kredisi : " + bolums[i].dersler[j].getDersKredi() + "" + "Dersin verildiği bölüm : " + bolums[i].getBolumAdı());
                                foundBolum = true;
                            }
                        }
                    }
                    if (!foundBolum) {
                        System.out.println("Aradığınız Ders bulunamamıştır");
                    }
                    break;


                case 5:
                    //Görev "3.5" sinifBilgisineGoreArama , *** iki fafrklı fakültede aynı isimde sınıflar olabilir bunu dikkate almalıyız
                    // bölümde her öğrenci dersleri birlikte mi alıyor ? yoksa her dersin farklı sınıfları mı var ?
                    // aşağıdaki algoritma herkesin dersleri birlikte aldığına göre oluşturulmuştur

                    System.out.print("Aramak istediğiniz sınıfı giriniz : ");
                    String sınıfAd = sc.next();

                    boolean foundSinif = false;
                    for (int i = 0; i < bolumSayisi; i++) {
                        for (int j = 0; j < bolums[i].getOgrSayisi(); j++) {
                            if (bolums[i].ogrenciler[j].getOgrenciSinif().equals(sınıfAd)) {

                                System.out.println("Öğrenci adı - soyadı : " + bolums[i].ogrenciler[j].getOgrenciAd() + " " + bolums[i].ogrenciler[j].getOgrenciSoyAd() + " " + "Öğrencinin Numarası: " + bolums[i].ogrenciler[j].getOgrenciNo()
                                        + " Öğrencinin Bölümü : " + bolums[i].getBolumAdı() + " Öğrencinin Sınıfı : " + bolums[i].ogrenciler[j].getOgrenciSinif());
                                foundSinif = true;
                            }
                        }
                    }

                    if (!foundSinif) {
                        System.out.println("Aradığınız sınıf bulunmamaktadır");
                    }
                    break;


                case 6:
                    // Görev "3.6" dersKredisineGoreArama *** iki farklı bölümde aynı krediye sahip dersler olabilri bunu dikkate almalıyız
                    System.out.print("Aramak istediğiniz ders kredisini girin :");
                    int dersKredi = sc.nextInt();

                    boolean foundkredi = false;
                    for (int i = 0; i < bolumSayisi; i++) {
                        for (int j = 0; j < bolums[i].getDersSayisi(); j++) {
                            if (bolums[i].dersler[j].getDersKredi() == dersKredi) {
                                System.out.println("Ders adı : " + bolums[i].dersler[j].getDersAd() + " " + "Ders numarası : " + bolums[i].dersler[j].getDersNo() +
                                        "Dersin verildiği bölüm : " + bolums[i].getBolumAdı() + " " + "Dersin Kredisi : " + bolums[i].dersler[j].getDersKredi());
                                foundkredi = true;
                            }
                        }
                    }
                    if (!foundkredi) {
                        System.out.println("Aradığınız krediye ait ders bulunmamaktadır");
                    }


                    break;
                case 7:
                    // Görev "3.7" Exit;
                    devamET=false;
                    break;
            }


        }


    }
}





