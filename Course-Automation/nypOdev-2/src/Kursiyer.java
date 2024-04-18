import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kursiyer {
    private String kursiyerId;
    private String kursiyerAdSoyad;

    private String kursiyerYas;

    public List<Kurs> kurslar;

    Scanner sc = new Scanner(System.in);

    File kursiyerDosyası = new File("C:\\Users\\LENOVO\\Desktop\\DetaySoft\\DetaySoftProjeler\\otomasyon\\detaySoftNypOdev2\\nypOdev-2\\src\\Kursiyer.txt");

    public Kursiyer(){};

    public Kursiyer( String KursiyerId , String KursiyerAdSoyad , String kursiyerYas){
        this.kursiyerId = KursiyerId;
        this.kursiyerAdSoyad = KursiyerAdSoyad;
        this.kursiyerYas = kursiyerYas;

    }

    //Başlangıç Görev "1.a"
    public void readKursiyerFromDBtoArrayList(ArrayList<Kursiyer> kursiyers) throws FileNotFoundException {
        Scanner sc = new Scanner(kursiyerDosyası);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            // Kursiyer özellikleri
            if (line.startsWith("*")) {
                Kursiyer kursiyer = new Kursiyer();

                // Kursiyer ID
                String[] kursiyerInfo = line.split("-");
                kursiyer.setKursiyerId(kursiyerInfo[0].substring(1)); // ID'yi alırken * işaretini kaldır

                // Kursiyer Ad-SoyAd
                kursiyer.setKursiyerAdSoyad(kursiyerInfo[1]);

                // Kursiyer Yaş
                kursiyer.setKursiyerYas(kursiyerInfo[2]);

                // Kursiyer kursları için ArrayList oluştur
                ArrayList<Kurs> kurslar = new ArrayList<>();

                // Kurs bilgilerini oku
                while (sc.hasNextLine()) {
                    line = sc.nextLine();

                    // Yeni bir kursiyer başladıysa, iç içe döngüden çık
                    if (line.startsWith("*")) {
                        break;
                    }

                    // Kurs özellikleri
                    if (line.startsWith("%")) {
                        Kurs kurs = new Kurs();

                        // Kurs ID
                        String[] kursInfo = line.split("-");
                        kurs.setKursId(kursInfo[0].substring(1)); // ID'yi alırken % işaretini kaldır

                        // Kurs Ad
                        kurs.setKursAd(kursInfo[1]);

                        // Kursiyer kurslar listesine ekle
                        kurslar.add(kurs);
                    }
                }

                // Kursiyer nesnesine kursları ekle
                kursiyer.setKurslar(kurslar);

                // Kursiyer nesnesini kursiyer listesine ekle
                kursiyers.add(kursiyer);
            }
        }
    }




    //Başlangıç Görev "1.b"
    public void writeKursiyerFromArrayListToDB(ArrayList<Kursiyer> kursiyers){
        String dosyaYolu = "C:\\Users\\LENOVO\\Desktop\\DetaySoft\\DetaySoftProjeler\\otomasyon\\detaySoftNypOdev2\\nypOdev-2\\src\\Kursiyer.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaYolu));

            for(int i=0 ; i< kursiyers.size(); i++){
                writer.write("-----------------");
                writer.write("\n");
                writer.write("Kursiyer ID: "+kursiyers.get(i).getKursiyerId()+"\n");
                writer.write("Ad - SoyAd: "+ kursiyers.get(i).getKursiyerAdSoyad()+"\n");
                writer.write("Yaş: "+kursiyers.get(i).getKursiyerYas()+"\n");
                writer.write("------");
                writer.write("\n");


                for(int j = 0  ; j < kursiyers.get(i).kurslar.size();j++){

                    writer.write("Kurs: "+kursiyers.get(i).kurslar.get(j).getKursAd()+"\n");
                    writer.write("ID: "+kursiyers.get(i).kurslar.get(j).getKursId()+"\n");
                }









            }

            writer.close();

            System.out.println("Dosya içeriği silindi.");
        } catch (IOException e) {
            System.out.println("Dosya işlemleri sırasında bir hata oluştu: " + e.getMessage());
        }

    }








    private void setKurslar(ArrayList<Kurs> kurslar) {
        this.kurslar=kurslar;
    }


    public void setKursiyerYas(String kursiyerYas) {
        this.kursiyerYas=kursiyerYas;
    }

    public void setKursiyerAdSoyad(String kursiyerAdSoyad) {
        this.kursiyerAdSoyad = kursiyerAdSoyad;
    }

    public void setKursiyerId(String kursiyerId){
        this.kursiyerId = kursiyerId;
    }

    public String getKursiyerId(){
        return this.kursiyerId;
    }

    public String getKursiyerAdSoyad(){
        return  this.kursiyerAdSoyad;
    }

    public String getKursiyerYas() {
        return this.kursiyerYas;
    }








}
