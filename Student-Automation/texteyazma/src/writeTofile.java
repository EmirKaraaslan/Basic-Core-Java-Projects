import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.FileWriter;

public class writeTofile {
    public static void main(String[] args) {
        try {
            // NAME
            Scanner nameInput = new Scanner(System.in);
            System.out.print("Enter Your Name : ");
            String nameText =   nameInput.nextLine();
            
            String fileName = "ogrenciDB.txt"; // Using a relative file path , her yazma işlemi bu dosyaya !!!

            // Appending NAME into the file 

            FileWriter nameWriter = new FileWriter(fileName, true);
            nameWriter.write("-------------------------------- Student INFO-------------------------" + "\n"+"\n");
            nameWriter.write("Name : "+nameText + "\n"+"\n"); // Appending a new line after each input
            nameWriter.close(); // Name Writer CLOSE
            
            //LAST NAME
            Scanner lastNameInput = new Scanner(System.in);
            System.out.println("Enter your last name: ");
            String lastNameText = lastNameInput.nextLine();
            


            //Appending LAST NAME into the file

            FileWriter lastNameWriter  = new FileWriter(fileName , true);
            lastNameWriter.write("Last Name : "+lastNameText + "\n"+"\n");
            lastNameWriter.close();// Last Name writer CLOSE
            


            // MIDTERM SCORE

            Scanner midtermScoreInput = new Scanner(System.in);
            System.out.println("Enter your Midterm score : ");
            double midtermScore = midtermScoreInput.nextDouble();

            FileWriter midtermScoreWriter = new FileWriter(fileName,true);
            midtermScoreWriter.write("Midterm score : " + midtermScore + "\n"+"\n");
            midtermScoreWriter.close();


            // Final Score
            Scanner finalScoreInput = new Scanner(System.in);
            System.out.println("Enter your Final Score : ");
            double finalScore = finalScoreInput.nextDouble();

            FileWriter finalScorWriter = new FileWriter(fileName ,true);
            finalScorWriter.write("Final Score : " + finalScore + "\n"+"\n");
            finalScorWriter.close();


            //Total Score 
            



            FileWriter tableEnder = new FileWriter(fileName, true);
            tableEnder.write("------------------------------------------------------------" + "\n"+"\n");





            
            
            System.out.println("Data has been written to the Data Base.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
