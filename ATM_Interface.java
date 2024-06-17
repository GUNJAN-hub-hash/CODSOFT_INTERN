import java.util.Scanner;
 class Bank{    
         private double balance;

         public Bank(double initialBalance) {
            this.balance = initialBalance;
         }

         public double getBalance() {
                    return balance;
         }

         public void deposit(double amount) {
            if(amount>0){
                balance += amount;
                System.out.println("Deposit of $"+ amount +" successfull. Current Balance: $" +balance);
            }else{
                System.out.println("Invalid Deposit Amount!");
            }
         }
        
         public void withdraw(double amount){
            if(amount > 0 && amount <= balance){
                balance -= amount;
                System.out.println("Withdrawl of $"+ amount + " successfull. Current Balance: $"+ balance);
            }else{
                System.out.println("Invalid withdrawl Amount or Insufficient Balance.");
            }
         }
    }

    class ATM{
        private Bank BankAccount;
        public ATM(Bank BankAccount){
            this.BankAccount = BankAccount;
        }

        public void displayMenu(){
            System.out.println("ATM Menu: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
        }

        public void performTransaction(int choice, Scanner scanner){
            switch(choice){
                case 1:
                     System.out.println("Current Balance: $"+ BankAccount.getBalance());
                    break;
                case 2:
                     System.out.println("Enter Deposit Amount: $");
                    double depositAmount = scanner.nextDouble();
                    BankAccount.deposit(depositAmount);
                    break; 
                case 3:
                     System.out.println("Enter Withdrawl Amount: $");
                     double withdrawlAmount = scanner.nextDouble();
                    BankAccount.withdraw(withdrawlAmount);
                    break;
                case 4:
                     System.out.println("Exit ATM, Thank You!");
                     scanner.close();
                     System.exit(0);
                default:
                     System.out.println("Invalid Choice. Please select a Valid Option!");         
            }
        }
    }

    public class ATM_Interface{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter initial account balance: $");
            double initialBalance = scanner.nextDouble();
            Bank BankAccount = new Bank(initialBalance);
            
            ATM atm = new ATM(BankAccount);

            while(true){
                atm.displayMenu();
                System.out.println("Select An Option: ");
                int choice = scanner.nextInt();

                atm.performTransaction(choice, scanner);
            }

        }
    }