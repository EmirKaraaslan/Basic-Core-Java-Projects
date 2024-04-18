import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class report extends ogrenci { // TASK3

    

    
     


    Scanner pullData = new Scanner(System.in);
    File dataBaseFile = new File("C:\\Users\\LENOVO\\Desktop\\VsCode-forJava\\DetaySoftProjeler\\otomasyon\\detaySoftOtomasyonOgrenci\\texteyazma\\ogrenciDB.txt");

public void reportOfDB() throws FileNotFoundException{
    pullData = new Scanner(dataBaseFile);
    String expectedString = "Total Score";
    ArrayList<Double> storeDoubleTotalScore = new ArrayList<>();

    while (pullData.hasNextLine()) {
        String line = pullData.nextLine();

        if (line.startsWith(expectedString)) {
            double doubleLine = Double.parseDouble(line.substring(expectedString.length() + 2));
            storeDoubleTotalScore.add(doubleLine);
        }
    }

    double greatest = Double.MIN_VALUE;
    for (int i = 0; i < storeDoubleTotalScore.size(); i++) {
        Double score = storeDoubleTotalScore.get(i);
        if (score > greatest) {
            greatest = score;
        }
    }

    System.out.println(colourfulPrint.PURPLE+"Greatest Total Score: " + greatest);

    double smallest = Double.MAX_VALUE;
    for (int i = 0; i < storeDoubleTotalScore.size(); i++) {
        Double score = storeDoubleTotalScore.get(i);
        if (score < smallest) {
            smallest = score;
        }
    }
    
    System.out.println(colourfulPrint.BLUE+"Smallest Total Score: " + smallest);

    double averageCounter =0 ;
    for(int i = 0 ; i< storeDoubleTotalScore.size();i++){
        if(storeDoubleTotalScore.get(i) == 0){
            i++;
        }
        averageCounter += storeDoubleTotalScore.get(i);
    }

    System.out.println(colourfulPrint.YELLOW+"Average of  Total Secor: " + (averageCounter/storeDoubleTotalScore.size()));
    System.out.println("");
    System.out.println("");
    System.out.println("");

/* 
    HashMap<Double,Integer> countMap = new HashMap<Double,Integer>();
    List<Double> keyList = new ArrayList<>();

    for (Double item : storeDoubleTotalScore) {
        if (countMap.containsKey(item)) {
            // Öğe zaten haritada varsa, sayısını artırın
            countMap.put(item, countMap.get(item) + 1);
            System.out.print(item + " ");
            for(int i = 0 ; i< countMap.get(item);i++){
                System.out.print("*");
            }
            System.out.println(" ");

            
        } else {
            // Öğe haritada yoksa, 1 sayısıyla ekleyin
            countMap.put(item, 1);
            // Anahtarları ekleme sırasına göre tutmak için anahtar listesine ekle
            keyList.add(item);
        }
    }

    


    
    for (Double key : countMap.keySet()) {
        
        //System.out.println( key + "  --- >" + countHashMap.get(key));
    }
*/
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
  


   } 
   

   



   }



