import java.util.Date;

public class Transaction {

    private double amount;

    private Date timeStamp;
    
    private String memo;

    private Account inAccount;

    public Transaction(double amount , Account inAccount ){

        this.amount = amount;
        this.inAccount = inAccount;
        this.timeStamp = new Date();
        this.memo = "";

    }

    public Transaction(double amount , String memo , Account inAccount){
        this(amount , inAccount); // bu kod yukarıdaki constructoru buraya çağırmak için kullanıyor 

        this.memo = memo;
    }

    public double getAmount(){
        return this.amount;
    }


    public String getSummaryLine(){
        if(this.amount >= 0){
            return String.format("%s : $%.02f : %s" , this.timeStamp.toString(), this.amount , this.memo);
        }else{
            return String.format("%s : $(%.02f) : %s" , this.timeStamp.toString(), -this.amount , this.memo);

        }
    }


}
