import java.util.Scanner;
import java.io.FileNotFoundException;
public class deneme {
   public deneme() {
   }

   public static void main(String[] var0) throws FileNotFoundException {
      colourfulPrint colour = new colourfulPrint();
      System.out.println(colour.YELLOW + "-------------------------Welcome to  University Automaiton Program--------------------------------------");
      System.out.println("Please Select the number below to apply operations");
      System.out.println("1-) Registration \n2-) Presenting Data \n3-) Report");
      Scanner menuScanner = new Scanner(System.in);
      System.out.println("Enter the  operation number : ");
      int menuSelector = menuScanner.nextInt();
      
      
      if (menuSelector == 1) {
         registerMethods var4 = new registerMethods();
         registerMethods.registerFunction();
      
      
      
        } else if (menuSelector == 2) {
         System.out.println("Select the options to monitor the Data");
         System.out.println(" ");
         System.out.println(" ");
         System.out.println(colour.RED+" 1-)STUDENTS  WITHOUT SCORE \n 2-)STUDENTS WITH TOTAL SCORE\n 3-)STUDENTS WITH TOTAL SCORE AND LETTER GRADE");
         System.out.print("Enter your option : ");
         Scanner subMenuScanner1 = new Scanner(System.in);
         int subMenu1 = subMenuScanner1.nextInt();
         System.out.println("---------------------");


         if(subMenu1 == 1 ) {
                readFileMethods readFileFunction = new readFileMethods();
                readFileFunction.pullStudentWithOutNote();
         }else if(subMenu1 ==2 ){
            readFileMethods readFileFunction = new readFileMethods();
            readFileFunction.pullStudentWithTotalScore();
         }else if(subMenu1 == 3){
            readFileMethods readFileFunction = new readFileMethods();
            readFileFunction.pullStudentWithTotalScoreAndLetterGrade();
         }
         





      }else if(menuSelector == 3 ){

         
        readFileMethods readFileFunction = new readFileMethods();
        report newReport = new report();
        readFileFunction.pullStudentWithTotalScoreAndLetterGrade();
        newReport.reportOfDB();
        newReport.frequencyGraph();









      }

   } 


}
