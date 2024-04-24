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

    File kursiyerDosyasi = new File("C:\\Users\\LENOVO\\Desktop\\DetaySoft\\DetaySoftProjeler\\otomasyon\\Basic-Core-Java-Projects\\Course-Automation\\nypOdev-2\\src\\Kursiyer.txt");

    public Kursiyer(){};

    public Kursiyer( String KursiyerId , String KursiyerAdSoyad , String kursiyerYas){
        this.kursiyerId = KursiyerId;
        this.kursiyerAdSoyad = KursiyerAdSoyad;
        this.kursiyerYas = kursiyerYas;

    }

    //Başlangıç Görev "1.a"
    public void readKursiyerFromDBtoArrayList(ArrayList<Kursiyer> kursiyers) throws FileNotFoundException {
        Scanner sc = new Scanner(kursiyerDosyasi);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            while (sc.hasNextLine()) {
                // Kursiyer özellikleri
                if (line.startsWith("*")) {
                    Kursiyer kursiyer = new Kursiyer();
                    ArrayList<Kurs> kurslar = new ArrayList<>();
                    kursiyer.setKurslar(kurslar);


                    kursiyer.setKursiyerId(line.substring(1, line.indexOf("-")));
                    kursiyer.setKursiyerAdSoyad(line.substring(line.indexOf("-") +1, line.lastIndexOf("-")));
                    kursiyer.setKursiyerYas(line.substring(line.lastIndexOf("-")+1));

                    // Kursiyer nesnesini kursiyer listesine ekle
                    kursiyers.add(kursiyer);


                    // Kurs bilgilerini oku
                    while (sc.hasNextLine()) {
                        line = sc.nextLine();

                        // Yeni bir kursiyer başladıysa, iç içe döngüden çık
                        if (line.startsWith("*")) {
                            break;
                        }

                        // Kurs özellikleri
                        else if (line.startsWith("%")) {
                            Kurs kurs = new Kurs();
                            // Kursiyer kursları için ArrayList oluştur

                            kurs.setKursId(line.substring(line.indexOf("%"), line.indexOf("-")));
                            kurs.setKursAd(line.substring(line.indexOf("-")));
                            kursiyer.kurslar.add(kurs);

                        }
                    }


                }
            }
        }
    }




    //Başlangıç Görev "1.b"
    public void writeKursiyerFromArrayListToDB(ArrayList<Kursiyer> kursiyers){
        String dosyaYolu = "C:\\Users\\LENOVO\\Desktop\\DetaySoft\\DetaySoftProjeler\\otomasyon\\Basic-Core-Java-Projects\\Course-Automation\\nypOdev-2\\src\\Kursiyer.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaYolu));

            for(int i=0 ; i< kursiyers.size(); i++){
                writer.write("*"+kursiyers.get(i).getKursiyerId());
                writer.write("-"+ kursiyers.get(i).getKursiyerAdSoyad());
                writer.write("-"+kursiyers.get(i).getKursiyerYas());
                writer.write("\n");


                writer.write("%");
                for(int j = 0  ; j < kursiyers.get(i).kurslar.size();j++){
                    writer.write(kursiyers.get(i).kurslar.get(j).getKursId());
                    writer.write(kursiyers.get(i).kurslar.get(j).getKursAd()+"\n");
                }









            }

            writer.close();

            System.out.println("Dosya içeriği siliniyor...");
            System.out.println("DB Güncellendi");
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
