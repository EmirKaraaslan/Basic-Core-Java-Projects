import java.io.IOException;

public class pullData {
 
    public static void main(String[] args) throws IOException{

         readFileMethods readFile1 = new readFileMethods();

         readFile1.pullStudentNumber();
         readFile1.pullName();
         readFile1.pullLastName();
         readFile1.pullMidtermScore();
         readFile1.pullFinalScore();
         readFile1.pullTotalScore();
         readFile1.pullLetterGrade();
         
    }
}
