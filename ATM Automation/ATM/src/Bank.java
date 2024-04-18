import java.util.ArrayList;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Bank {

    private String name;

    private ArrayList<User> users;

    private ArrayList<Account> accounts;


    public Bank(String name){
        this.name = name;
        this.users = new ArrayList<User>();
        this.accounts = new ArrayList<Account>();
    }


    public String getNewUserUUID(){

        String uuid;
        
        Random rng = new Random();
        int len  = 6 ;
        boolean nonUnique ;

        // continuing looping until we get a unique ID
        do{
            uuid = "";
            for(int c = 0 ; c < len ; c++ ){
                uuid +=  ((Integer)(rng.nextInt(10))).toString();
            }
            nonUnique = false ;
            //chcek to make  sure it is unique
            for(User u : this.users){
                if(uuid.compareTo(u.getUUID()) == 0){
                    nonUnique = true ;
                    break;
                }
            }
        
        }while(nonUnique);
        
        return uuid;
    }

    public String getNewAccountUUID(){
        String uuid;
        
        Random rng = new Random();
        int len  = 10 ;
        boolean nonUnique ;

        // continuing looping until we get a unique ID
        do{
            uuid = "";
            for(int c = 0 ; c < len ; c++ ){
                uuid +=  ((Integer)(rng.nextInt(10))).toString(); 
            }
            nonUnique = false ;
            //chcek to make  sure it is unique
            for(Account a : this.accounts){
                if(uuid.compareTo(a.getUUID()) == 0){
                    nonUnique = true ;
                    break;
                }
            }
        
        }while(nonUnique);
        
        return uuid;
    }

    public void addAccount(Account anAccount ){
        this.accounts.add(anAccount);
    }

    public User addUser(String firstName , String lastName , String pin){

        // yeni bir user oluşturup listeye ekleme 
        User newUser = new User(firstName, lastName, pin, this);
        this.users.add(newUser);

        // savings account u oluşturma  hem banka içindeki accoutnlara bu oluşturulan accountu atma hem de o userın sahip olduğu accountlar içine atılır
        Account newAccount = new Account("savings",newUser,this); 
        newUser.addAccount(newAccount);
        this.addAccount(newAccount);
        
        return newUser;
    }


    public User userLogin(String UUID , String pin){
        
        for(User u: this.users){
            //check user ID is correct
            if(u.getUUID().compareTo(UUID) == 0 && u.validatePin(pin)){

                return u ;
            }
            //if we haven't found the user  or have an incorrect pin

        }
        return null;
    }


    public String getName(){
        return this.name;
    }

}
