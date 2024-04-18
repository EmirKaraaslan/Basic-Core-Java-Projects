import java.io.FileNotFoundException;

public class ogrenci {

    public String name ;
    public String lastName;
    public double midtermScore;
    public double finalScore;
    public double totalScore;
    public static String letterGrade;
    private int studentNumber;
    public  int A;
    public int B;
    public int C;
    public int D;
    public int F;
    public int N;


    public void ogrenci(String name , String lastName , double midtermScore , double finalScore , double totalScore){
        this.name = name;
        this.lastName = lastName;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
        this.totalScore = totalScore;
        this.letterGrade = letterGrade;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setLastName(String lastName){
        this.lastName = lastName;

    }


    public void setMidtermScore(double midtermScore){
        this.midtermScore = midtermScore;
    }


    public void setFinalScore(double finalScore){
        this.finalScore = finalScore;
    }

    public void setTotalScore(){

        this.totalScore= ((this.midtermScore*0.4)+(this.finalScore*0.6));

    }


    public void setLetterGrade(){
        if(totalScore <= 100 && totalScore>=90){
            this.letterGrade = "A";
            
            
            System.out.println(A + " basti!!");

        }else if(totalScore <= 89 && totalScore >= 80){
            this.letterGrade = "B";
            B++;
        }else if(totalScore <=79 && totalScore >= 60){
            this.letterGrade = "C";
            C++;
        }else if(totalScore <=59 && totalScore >= 50){
            this.letterGrade = "D";
            D++;
        }else if(totalScore <=49 && totalScore >= 30){
            this.letterGrade = "F";
            F++;
        }else{
            this.letterGrade = "-";
            N++;
        }
    }

    ////////////////////////
    public  int getA() throws FileNotFoundException{
        
            return A;
            
       }

    ///////////////////////

    public int letterIncrementA(){
      return   this.A++;

    }

    public String getName(){
        return this.name;
    }


    public String getlastName(){
        return this.lastName;
    }

    public double getMidtermScore(){
        return this.midtermScore;
    }


    public double getFinalScore(){
        return this.finalScore;
    }

    public double getTotalScore(){ // yukarıda da tanımlayabiliriz projenin gidişatına gre bakıcam 
        return ((this.midtermScore*0.4)+(this.finalScore*0.6));
    }


    public String getLetterGrade(){
        if(totalScore <= 100 && totalScore>=90){
            this.letterGrade = "A";
            this.A++;
        }else if(totalScore <= 89 && totalScore >= 80){
            this.letterGrade = "B";
            this.B++;
        }else if(totalScore <=79 && totalScore >= 60){
            this.letterGrade = "C";
            this.C++;
        }else if(totalScore <=59 && totalScore >= 50){
            this.letterGrade = "D";
           this. D++;
        }else if(totalScore <=49 && totalScore >= 30){
            this.letterGrade = "F";
            this.F++;
        }else{
            this.letterGrade = "-";
            this.N++;
        }
        return this.letterGrade;
    }

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }


    public int getStudentNumber(){
        return (int)this.studentNumber;
    }

    public  void frequencyGraph() throws FileNotFoundException{

        int i = 0 ; 
        String temp ; 
        temp = "\nFrequency Graph\nA =";
        
        for(i = 0 ; i<A ;i++){
            temp += "*";
        }
    
        temp += "\nB = ";
        for(i = 0 ; i<B; i++){
            temp += "*";
        }
    
        temp += "\nC = ";
        for(i = 0 ; i<C ;i++){
            temp += "*";
        }
    
        temp += "\nD = ";
        for(i = 0 ; i<D; i++){
            temp += "*";
        }
    
        temp += "\n- =";
        for( i =0; i< N; i++ ){
            temp ="*";
        }
    
        System.out.println(temp);
    
        }

  
    


    public void showAttributes(){

        System.out.println("--------*********** Student Informations ********---------");
        System.out.println("  ");
        System.out.println("Student Number: "+ getStudentNumber());
        System.out.println("Name : " + getName());
        System.out.println("Last Name : " + getlastName());
        System.out.println("Midterm Score : " + getMidtermScore());
        System.out.println("Final Score : " + getFinalScore());

        System.out.println("Your Total Score is : " + getTotalScore());
        System.out.println("Letter Grade : " + ogrenci.letterGrade);
    }



}





