import java.io.FileNotFoundException;
import java.util.HashMap;

public class search {
    public static void main(String[] args) throws FileNotFoundException {
        readFileMethods newTry = new readFileMethods();
       // newTry.pullTotalScore();
        //newTry.pullLastName();
       // newTry.pullStudentWithTotalScore();
      //newTry.pullStudentWithTotalScoreAndLetterGrade();
      String str1 = "12";
      String str2 = "15";
      String str3 = "18";
      String str4 = "10";
      String str5 = "-12";
      String str6 = "124";
      double double1 = Double.parseDouble(str1);
      double[] dArray = {double1};
      System.out.println(dArray[0]);



        
    }   public static  double  greatFinder(double[] totalScoreArray){
        double great = totalScoreArray[0];
        for(int i = 0 ; i < totalScoreArray.length;i++){
           if(totalScoreArray[i]> great ){
              great = totalScoreArray[i];
           }
        }
        return great;
     }

     public static  double  lessFinder(double[] totalScoreArray){
        double great = totalScoreArray[0];
        for(int i = 0 ; i < totalScoreArray.length;i++){
           if(totalScoreArray[i]< great ){
              great = totalScoreArray[i];
           }
        }
        return great;
     }
}
