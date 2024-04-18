import java.util.Scanner;

import javax.xml.transform.Source;
public class ATM {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        Bank theBank = new Bank("Bank of Dausin ");
    
        // add a user , which also creates a saving account

        User aUser = theBank.addUser("jhon", "Mcmillian", "1234");


        // add a checking

        Account newAccount = new Account("Checking", aUser, theBank);
        aUser.addAccount(newAccount);
        theBank.addAccount(newAccount);


        User curUser;
        
        while(true){
            curUser = ATM.mainMenuPrompt( theBank, sc);

            ATM.printUserMenu(curUser,sc);
        }






    }

    public static User mainMenuPrompt(Bank theBank , Scanner sc){
            String userID;
            String pin;
            User authUser;

            //prompt the  user for user ID/PIN combo until a correct one is reached 
            do{

                System.out.printf("\n\nWelcome to %s\n\n", theBank.getName());
                System.out.print("Enter user ID: ");
                userID = sc.nextLine();
                System.out.print("Enter pin: ");
                pin = sc.nextLine();

                // try to get the user object corresponding to the ID and PIN combo
                authUser = theBank.userLogin(userID, pin);
                if( authUser == null){
                    System.out.println("Incorrect UserID/pin combintaion . \n Please try again.");
                }

            }while(authUser == null);
            return authUser;
    }

    public static void printUserMenu(User theUser , Scanner sc){

        // prints summary of the users account
        theUser.printAccountSummary();

        // init (intialize)
        int choice;

        // user menu

        do{

            System.out.println("Welcome " + theUser.getFirstName()+ " what would you like to do ? ");
            System.out.println(" 1) Show account transaction history");
            System.out.println(" 2) Withdrawl");
            System.out.println(" 3) Deposit");
            System.out.println(" 4) Transfer");
            System.out.println(" 5) Quit");

            System.out.print("Enter a choice: ");
            choice = sc.nextInt();

            if(choice < 1 || choice > 5){
                System.out.println("Invalid choice , please select 1-5");
            }
        }while(choice < 1 || choice > 5);

        switch(choice){
            case 1:
                ATM.showTransHistory(theUser , sc);
                break;
            case 2:
                ATM.withdrawlFunds( theUser , sc);
                break;

            case 3:
                ATM.depositFunds(theUser , sc );
                break;

            case 4:
                ATM.transferFunds(theUser , sc );
                break;
            case 5:
                sc.nextLine();
                break;

        }

        // redisplay this menu unless the user wants to quit
        if(choice != 5 ){
            ATM.printUserMenu(theUser, sc);
        }



    }


    public static void showTransHistory(User theUser , Scanner sc){
        int theAcct;

        do{
            System.out.printf( " Enter the number (1-%d) of the account\n" + 
                        "whose transaction you want to see: " ,
                         theUser.numAccounts());
            theAcct = sc.nextInt()-1;
            if(theAcct < 0 || theAcct >= theUser.numAccounts()){
                System.out.println("Invalid account . please try again !");
            }


        }while(theAcct < 0 || theAcct >= theUser.numAccounts());

        theUser.printAcctTransHistory(theAcct);
    }

        
    public static void transferFunds(User theUser , Scanner sc ){

        int fromAcct ;
        int toAcct;
        double amount ;
        double acctBal;

        // get the account to transfer from
        do{

            System.out.printf("Enter the number (1-%d) of the account\n" + "to transfer from" , theUser.numAccounts());
            fromAcct = sc.nextInt()-1;
            if(fromAcct < 0 || fromAcct >= theUser.numAccounts()){
                System.out.println("Invalid account , please try again");
            }
        }while(fromAcct < 0 || fromAcct >= theUser.numAccounts());
            acctBal = theUser.getAcctBalance(fromAcct);
    


        // get the account to transfer to 
        do{

            System.out.printf("Enter the number (1-%d) of the account\n" + "to transfer to" , theUser.numAccounts());
            toAcct = sc.nextInt()-1;
            if(toAcct < 0 || toAcct >= theUser.numAccounts()){
                System.out.println("Invalid account , please try again");
            }
        }while(toAcct < 0 || toAcct >= theUser.numAccounts());


        // get the amount to transfer 

        do{

            System.out.printf("Enter the amount to transfer (max $%.02f): $" , acctBal );
            amount = sc.nextDouble();
            if(amount < 0){
                System.out.println(" amount must be greater than 0 ");

            }else if(amount > acctBal){
                System.out.printf("Amount must not be greater than\n " + 
                            "balance of $%.02f.\n" , acctBal);
            }
        }while( amount < 0 || amount > acctBal);


        //finally do the transfer

        theUser.addAcctTransaction(fromAcct , -1*amount , String.format("Transfer to account %s" , theUser.getAcctUUID(toAcct)));
        theUser.addAcctTransaction(toAcct , amount , String.format("Transfer to account %s" , theUser.getAcctUUID(fromAcct)));

    }

    public static void withdrawlFunds(User theUser , Scanner sc ){
        int fromAcct ;
        double amount ;
        double acctBal;
        String memo;

        // get the account to transfer from
        do{

            System.out.printf("Enter the number (1-%d) of the account\n" + "to withdraw from :" , theUser.numAccounts());
            fromAcct = sc.nextInt()-1;
            if(fromAcct < 0 || fromAcct >= theUser.numAccounts()){
                System.out.println("Invalid account , please try again");
            }
        }while(fromAcct < 0 || fromAcct >= theUser.numAccounts());
            acctBal = theUser.getAcctBalance(fromAcct);

            // get the amount to transfer 

        do{

            System.out.printf("Enter the amount to withdraw (max $%.02f): $" , acctBal );
            amount = sc.nextDouble();
            if(amount < 0){
                System.out.println(" amount must be greater than 0 ");

            }else if(amount > acctBal){
                System.out.printf("Amount must not be greater than\n " + 
                            "balance of $%.02f.\n" , acctBal);
            }
        }while( amount < 0 || amount > acctBal);


        // gobble up  rest of previous 
        sc.nextLine();

        //get a memo 
        System.out.println("Enter a memo :");
        memo = sc.nextLine();

        // do the withdrawl 
        theUser.addAcctTransaction(fromAcct, -1*amount, memo);


    }

    public static void depositFunds(User theUser , Scanner sc){
        int toAcct ;
        double amount ;
        double acctBal;
        String memo;

        // get the account to transfer from
        do{

            System.out.printf("Enter the number (1-%d) of the account\n" + "to deposit in : ",theUser.numAccounts());
            toAcct = sc.nextInt()-1;
            if(toAcct < 0 || toAcct >= theUser.numAccounts()){
                System.out.println("Invalid account , please try again");
            }
        }while(toAcct < 0 || toAcct >= theUser.numAccounts());
            acctBal = theUser.getAcctBalance(toAcct);

            // get the amount to transfer 

        do{

            System.out.printf("Enter the amount to transfer (max $%.02f): $" , acctBal );
            amount = sc.nextDouble();
            if(amount < 0){
                System.out.println(" amount must be greater than 0 ");

            }
        }while( amount < 0 );


        // gobble up  rest of previous 
        sc.nextLine();

        //get a memo 
        System.out.println("Enter a memo :");
        memo = sc.nextLine();

        // do the withdrawl 
        theUser.addAcctTransaction(toAcct, amount, memo);

    }

}
