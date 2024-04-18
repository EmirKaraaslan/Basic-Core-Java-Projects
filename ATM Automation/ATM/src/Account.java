import java.lang.reflect.Array;
import java.text.Format;
import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;

public class Account {
    private String name;

    private String uuid;

    private User holder; 

    
    private ArrayList<Transaction> transactions;

    public Account(String name, User holder , Bank theBank){

        this.name = name ;

        this.holder = holder;

        this.uuid =  theBank.getNewAccountUUID();

        this.transactions = new ArrayList<Transaction>();






    }

    public String getUUID(){
        return this.uuid;
    }

    public Object getSummaryLine() {
    // get the account's balance
    
        double balance = this.getBalance();

        //format the summary line , depending on the whether the balance is 
        //negative 

        if(balance >= 0 ){
            return String.format("%s : $(%.02f) : %s " , this.uuid , balance , this.name);


        }else{
        
            return String.format("%s : $(%.02f) : %s " , this.uuid , balance , this.name);
        }




    }

    public double getBalance() {

        double balance = 0 ; 
        for(Transaction t : this.transactions){
            balance   += t.getAmount(); 
        }
        
        return balance ;
    }

    public void printTransHistory(){
        System.out.printf("\nTransaction history for account %s\n" , this.uuid);
        for(int  i =  this.transactions.size()-1 ; i>=0;i--){
            System.out.println(this.transactions.get(i).getSummaryLine());
        }

        System.out.println();
    }


    public void addTransaction(double amount , String memo){

        //create new transaction object and add it to our list
        Transaction newTrans = new Transaction(amount, memo , this);
        this.transactions.add(newTrans);
    }



}




