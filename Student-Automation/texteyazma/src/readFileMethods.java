import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Scanner;



public class readFileMethods extends ogrenci{ // TASK 2
        public static int trya = 5;
       Scanner pullData = new Scanner(System.in);
       File dataBaseFile = new File("C:\\Users\\LENOVO\\Desktop\\VsCode-forJava\\DetaySoftProjeler\\otomasyon\\detaySoftOtomasyonOgrenci\\texteyazma\\ogrenciDB.txt");
      
       
       
       public  void pullStudentNumber() throws FileNotFoundException{ // Student Number 
        pullData = new Scanner(dataBaseFile);
        String expectedString = "Student Number";
            while(pullData.hasNextLine()){
                String line = pullData.nextLine();
                if(line.startsWith(expectedString)){
                    System.out.println("Student Number : " +line.substring(expectedString.length()+ 2));
                }
            }
       }


       public void pullName()throws FileNotFoundException{
            pullData = new Scanner(dataBaseFile);
            String expectedString = "Name";
            while(pullData.hasNextLine()){
                String line = pullData.nextLine();
                if(line.startsWith(expectedString)){
                    System.out.println("Name :" + line.substring(expectedString.length() +2 ));
                }
            }

       }

       public void pullLastName() throws FileNotFoundException{
        pullData = new Scanner(dataBaseFile);
            String expectedString = "Last name";
            while(pullData.hasNextLine()){
                String line = pullData.nextLine();
                if(line.startsWith(expectedString)){
                    System.out.println("Last name : " + line.substring(expectedString.length()+2));
                }
            }
       }

       public void pullMidtermScore() throws FileNotFoundException{
        pullData = new Scanner(dataBaseFile);
            String expectedString = "Midterm Score";
            while(pullData.hasNextLine()){
                String line = pullData.nextLine();
                if(line.startsWith(expectedString)){
                    System.out.println("Midterm Score :" + line.substring(expectedString.length()+2));
                }
            }
       }


       public void pullFinalScore() throws FileNotFoundException{
        pullData = new Scanner(dataBaseFile);
            String expectedString = "Final Score";
            while(pullData.hasNextLine()){
                String line = pullData.nextLine();
                if(line.startsWith(expectedString)){
                    System.out.println("Final Score : " + line.substring(expectedString.length()+2));
                }
            }
       }

        /////////////////////////////////////////////////////////////////////////////////

       public void pullTotalScore() throws FileNotFoundException{
        pullData = new Scanner(dataBaseFile);
            String expectedString = "Total Score";
            while(pullData.hasNextLine()){
                String line = pullData.nextLine();
                
                if(line.startsWith(expectedString)){
                //double valueForTask3 = pullData.nextDouble();
                    
                    System.out.println("Total Score :" + line.substring(expectedString.length()+2));
                }
            }
       }


       //////////////////////////////////////////////////////////////////// TASK3
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

        System.out.println("Greatest Total Score: " + greatest);

        double smallest = Double.MAX_VALUE;
        for (int i = 0; i < storeDoubleTotalScore.size(); i++) {
            Double score = storeDoubleTotalScore.get(i);
            if (score < smallest) {
                smallest = score;
            }
        }
        
        System.out.println("Smallest Total Score: " + smallest);

        double averageCounter =0 ;
        for(int i = 0 ; i< storeDoubleTotalScore.size();i++){
            averageCounter += storeDoubleTotalScore.get(i);
        }

        System.out.println("Average of  Total Secor: " + (averageCounter/storeDoubleTotalScore.size()));


       }

       

    /////////////////////////////////////////////////////////////////////////////
       public void pullLetterGrade() throws FileNotFoundException{
        pullData = new Scanner(dataBaseFile);
            String expectedString = "Letter Grade";
            while(pullData.hasNextLine()){
                String line = pullData.nextLine();
                  if(line.startsWith(expectedString)){
                    System.out.println("Letter Grade" + line.substring(expectedString.length()));
                }
            }
       }

    

       public void pullStudentWithOutNote() throws FileNotFoundException{ // TASK 2 REDESIGN!!!
        pullData = new Scanner(dataBaseFile);
        String expectedString1 = "Student Number";
        String expectedString2 = "Name";
        String expecString3 = "Last name";
        while(pullData.hasNextLine()){
            String line = pullData.nextLine();
            if(line.startsWith(expectedString1)){
                System.out.println ("Student Number :" + line.substring(expectedString1.length() +2 )+" ");
            }else if(line.startsWith(expectedString2)){
                System.out.println ("Name :" + line.substring(expectedString2.length() +2 )+" ");

            }else if(line.startsWith(expecString3)){
                System.out.println("Last name :" +line.substring(expecString3.length()+2)+" ");
                System.out.println("-------------------");

            }
        }


       }

       public void pullStudentWithTotalScore() throws FileNotFoundException{ // TASK 2 REDESIGN!!!
        pullData = new Scanner(dataBaseFile);
        String expectedString1 = "Student Number";
        String expectedString2 = "Name";
        String expectedString3 = "Last name";
        String expectedString4 = "Total Score";
        while(pullData.hasNextLine()){
            String line = pullData.nextLine();
            if(line.startsWith(expectedString1)){
                System.out.println ("Student Number :" + line.substring(expectedString1.length() +2 )+" ");
            }else if(line.startsWith(expectedString2)){
                System.out.println ("Name :" + line.substring(expectedString2.length() +2 )+" ");

            }else if(line.startsWith(expectedString3)){
                System.out.println("Last name :" +line.substring(expectedString3.length()+2)+" ");

            }else if(line.startsWith(expectedString4)){
                System.out.println ("Total Score :" + line.substring(expectedString2.length() +2 )+" ");
                System.out.println("-------------------");

        }


       }
    }


    public void pullStudentWithTotalScoreAndLetterGrade() throws FileNotFoundException{ // TASK 2 REDESIGN!!!
        pullData = new Scanner(dataBaseFile);
        String expectedString1 = "Student Number";
        String expectedString2 = "Name";
        String expectedString3 = "Last name";
        String expectedString4 = "Total Score";
        String expectedString5 = "Letter Grade";
        while(pullData.hasNextLine()){
            String line = pullData.nextLine();
            if(line.startsWith(expectedString1)){
                System.out.println ("Student Number :" + line.substring(expectedString1.length() +2 )+" ");
            }else if(line.startsWith(expectedString2)){
                System.out.println ("Name :" + line.substring(expectedString2.length() +2 )+" ");

            }else if(line.startsWith(expectedString3)){
                System.out.println("Last name :" +line.substring(expectedString3.length()+2)+" ");

            }else if(line.startsWith(expectedString4)){
                System.out.println ("Total Score :" + line.substring(expectedString2.length() +2 )+" ");

            }else if(line.startsWith(expectedString5)){
            System.out.println ("Letter Grade:" + line.substring(expectedString2.length() +2 )+" ");
            System.out.println("-------------------");




       }
    }




}

    



}
    

