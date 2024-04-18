import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;
public class User {


    private String firstName;
    private String lastName;
    private String uuid;
    private byte pinHash[];
    private ArrayList<Account> accounts;

    public User(String firstName , String lastName , String pin , Bank theBank){
        this.firstName = firstName;
        this.lastName = lastName;
        
        // store the pin with md5 hash
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch(NoSuchAlgorithmException e ){
            System.out.println("error :  NO SUCH ALGORITHM");
            e.printStackTrace();
            System.exit(1);
        }
        
        // get a new , unique universal ID for the user
        this.uuid = theBank.getNewUserUUID();
         
         // create  empty list of accounts

         this.accounts = new ArrayList<Account>();

         // print log message 

         System.out.println("New User "+firstName+" with ID " + this.uuid + " created\n" + lastName + " "+ firstName +" "+ this.uuid  );




    }

    public void addAccount(Account anAccount ){
        this.accounts.add((anAccount));
    }

    public String getUUID(){
        return this.uuid;
    }

    public boolean validatePin(String aPin){// bu kod girilen pin in hashi ile bu pin için oluşturulmuş hash i karşılaştırıyor bu sayede yazılım ekibinin içindeki kötü niyetli biri girilen şifreyi kullanamıyor çünkü kod üzeirnde görmüyor
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            return MessageDigest.isEqual(md.digest(aPin.getBytes()), this.pinHash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
            return false;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void printAccountSummary(){
        System.out.println(this.firstName + "'s Accounts summary");
        for(int i =0 ;  i< this.accounts.size() ; i++){
            System.out.printf("%d) %s\n", i+1 , this.accounts.get(i).getSummaryLine());
        }
    }

    public int numAccounts(){
        return this.accounts.size();
    }

    public void printAcctTransHistory(int acctIdx){
        this.accounts.get(acctIdx).printTransHistory();
    }
    
    public double getAcctBalance(int acctIdx){
        return this.accounts.get(acctIdx).getBalance();
    }

    public String getAcctUUID(int acctIdx){
        return this.accounts.get(acctIdx).getUUID();
    }

    public void addAcctTransaction(int acctIdx , double amount , String memo){
        this.accounts.get(acctIdx).addTransaction(amount , memo);
    }
}
