import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Kurs {
    private String kursId;
    private String kursAd;

    private ArrayList<Kurs> kurslar;

    Scanner sc = new Scanner(System.in);
    File KursDosyası = new File("C:\\Users\\LENOVO\\Desktop\\DetaySoft\\DetaySoftProjeler\\otomasyon\\Basic-Core-Java-Projects\\Course-Automation\\nypOdev-2\\src\\Kurs.txt");

    public Kurs(){};

    public Kurs(String kursId , String kursAd){
        this.kursId = kursId;
        this.kursAd = kursAd;
    }

    //Başlangıç Görev "1.c"

    public void readKursFromDBtoArrayList(ArrayList<Kurs> kursus) throws FileNotFoundException {
        Scanner sc = new Scanner(KursDosyası);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            Kurs kurs = new Kurs();

            String kursID = line.substring(0, line.indexOf("-"));
            kurs.setKursId(kursID);

            String kursAd = line.substring(line.indexOf("-")+1);
            kurs.setKursAd(kursAd);


            kursus.add(kurs);






        }


    }


    //Başlangıç Görev "1.d"

    public void writeKursFromArrayListToDB(ArrayList<Kurs> kursus){
        String dosyaYolu = "C:\\Users\\LENOVO\\Desktop\\DetaySoft\\DetaySoftProjeler\\otomasyon\\Basic-Core-Java-Projects\\Course-Automation\\nypOdev-2\\src\\Kurs.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaYolu));

            for(int i=0 ; i< kursus.size(); i++){
                writer.write(kursus.get(i).getKursId());

                writer.write("-");
                writer.write(kursus.get(i).getKursAd());
                writer.write("\n");





            }

            writer.close();

            System.out.println("Dosya içeriği siliniyor...");
            System.out.println("DB Güncellendi");
        } catch (IOException e) {
            System.out.println("Dosya işlemleri sırasında bir hata oluştu: " + e.getMessage());
        }

    }

    public void setKursAd(String kursAd) {
        this.kursAd=kursAd;
    }

    public void setKursId(String kursId){
        this.kursId = kursId;
    }

    public String getKursId(){
        return this.kursId;
    }

    public String getKursAd(){
        return this.kursAd;
    }








}
