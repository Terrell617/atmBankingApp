import java.util.Scanner;

public class Account {
    //Class Variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    //Class constructor
    Account(String cname, String cid){
        customerName = cname;
        customerID = cid;
    }

    //Function for Depositing money
    void deposit(int amount){
        if(amount !=0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //function for Withdrawing money
    void withdraw(int amount){
        if(amount !=0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    //Function showing Previous transaction
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + previousTransaction);
        } else System.out.println("No Previous Transaction");
    }

        //Function Showing Main Menu
        void showMenu(){
            char option = '0';
            Scanner scanner = new Scanner(System.in);
            System.out.println("welcome, " + customerName + "!");
            System.out.println("Your ID# is: " + customerID);
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("A. Check your balance");
            System.out.println("B. Make a deposit");
            System.out.println("C. Make a withdrawal");
            System.out.println("D. View Previous Transaction");
            System.out.println("F. Exit");

            do{
                System.out.println();
                System.out.println("Enter an option: ");
                char option1 = scanner.next().charAt(0);
                option = Character.toUpperCase(option1);
                System.out.println();

                switch(option){
                    // case "A" allows user to check balance
                    case 'A' :
                        System.out.println("Balance = $" + balance);
                        break;

                        // case "B" allows user to deposit money into their account
                    case 'B' :
                        System.out.println("Enter the amount you want to deposit: ");
                        int amount = scanner.nextInt();
                        deposit(amount);
                        System.out.println();
                        break;

                        //case "C" allows user to withdraw money from account
                    case 'C':
                    System.out.println("Enter the amount you wish to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    break;

                    //case "D" allows user to check previous transaction
                    case 'D':
                    System.out.println();
                    getPreviousTransaction();
                    break;


                    //case "F" allows user to exit
                    case 'F':
                    System.out.println("Thanks for Banking with us.");
                    break;
                }
            }while(option != 'F' );
            System.out.println("Have a great day");
        }
    }

