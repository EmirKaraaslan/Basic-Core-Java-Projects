import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class registerMethods {
    public static void registerFunction(){ // TASK 1
        colourfulPrint colour = new colourfulPrint();
         try{

        
                System.out.println(colour.RED+"--------------> Fill the given balnks to register <-------------");
                String fileName = "C:\\Users\\LENOVO\\Desktop\\VsCode-forJava\\DetaySoftProjeler\\otomasyon\\detaySoftOtomasyonOgrenci\\texteyazma\\ogrenciDB.txt";
                //Student number
                ogrenci newOgrenci = new ogrenci();
                System.out.println("Enter your student number : ");
                Scanner inputStudentNumber = new Scanner(System.in);
                int studentNumber = inputStudentNumber.nextInt();
                newOgrenci.setStudentNumber(studentNumber);


                //STUDENT NUMBER write to file
                FileWriter  tableStartingLine = new FileWriter(fileName,true);
                tableStartingLine.write("-------------------------------- Student INFO-------------------------" + "\n"+"\n");
                tableStartingLine.close();
                FileWriter studentNumberWriter = new FileWriter(fileName,true);
                studentNumberWriter.write("Student Number : " + studentNumber +  "\n"+"\n");
                studentNumberWriter.close();
                


                



                // NAME
                Scanner inputName = new Scanner(System.in);
                System.out.print("Enter your Name: ");
                String registerName = inputName.nextLine();
                 newOgrenci.setName(registerName);
        
                 // Name write to file
        
                 FileWriter nameWriter = new FileWriter(fileName ,true);
        
                 nameWriter.write("Name: "+registerName+ "\n"+"\n");
                 nameWriter.close();
                 
                 
                
                //LAST NAME
                System.out.println(" ");
                System.out.print("Enter your Last name: ");
                Scanner inputLastName = new Scanner(System.in);
                String registerLastName = inputLastName.nextLine();
                newOgrenci.setLastName(registerLastName);
                System.out.println(" ");
                
                // LAST NAME write to file 
                FileWriter lastNameWriter = new FileWriter(fileName,true);
                lastNameWriter.write("Last name : "+ registerLastName+"\n"+"\n");
                lastNameWriter.close();
        
        
        
        
                // MIDTERM SCORE
                System.out.print("Enter your Midterm score : ");
                Scanner inputMidtermScore = new Scanner(System.in);
                double registerMidtermScore = inputMidtermScore.nextDouble();
        
                
                while(registerMidtermScore < 0 || registerMidtermScore > 100){
                    
                        System.out.println(" Midterm Score can not be lesser than 0 or greater than 100 please enter again");
                        System.out.print("Enter your Midterm score : ");
        
                        registerMidtermScore = inputMidtermScore.nextDouble();
        
                        
        
                } 
                
        
                
                newOgrenci.setMidtermScore(registerMidtermScore);
        
        
        
                //MIDTERM SCORE write to file
                FileWriter  midtermScoreWriter = new FileWriter(fileName,true);
                midtermScoreWriter.write("Midterm Score : " + registerMidtermScore + "\n"+"\n"); 
                midtermScoreWriter.close();
        
                System.out.println(" ");
        
        
                // FINAL SCORE
                System.out.print("Enter your Final score: ");
                Scanner inputFinalScore = new Scanner(System.in);
                double registerFinalScore = inputFinalScore.nextDouble();
        
                while(registerFinalScore < 0 || registerFinalScore > 100){
                    System.out.println(" Final Score can not be lesser than 0 or greater than 100 please enter again");
                        System.out.print("Enter your Final score : ");
        
                         registerFinalScore = inputFinalScore.nextDouble();
        
                }
        
                // FINAL SCORE write to file
                FileWriter  finalScoWriter = new FileWriter(fileName,true);
                finalScoWriter.write("Final Score : " + registerFinalScore + "\n\n");
                finalScoWriter.close();
                newOgrenci.setFinalScore(registerFinalScore);
        
        
                // TOTAL SCORE write to file
        
                    FileWriter totalScoreWriter = new FileWriter(fileName , true);
                    totalScoreWriter.write("Total Score : " + (double)newOgrenci.getTotalScore()+ "\n"+"\n");
                    newOgrenci.setTotalScore();
                    totalScoreWriter.close();

                // LETTER GRADES 
                    FileWriter letterGradeWriter = new FileWriter(fileName,true);

                    letterGradeWriter.write("Letter Grade:"+ newOgrenci.getLetterGrade()+"\n"+"\n");
                    
                    letterGradeWriter.close();


                
                newOgrenci.showAttributes();
                newOgrenci.frequencyGraph();
        
                System.out.println("-------------------------------------------------------");
                App app = new App();
                App.App();
                
                } catch (IOException e) {
                    System.err.println("An error occurred while writing to the file: " + e.getMessage());
                    e.printStackTrace();
                }
    }

}

