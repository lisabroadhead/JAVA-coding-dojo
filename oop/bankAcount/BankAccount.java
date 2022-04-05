class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    public static int numAccounts = 0;
    // public static double = checkingBalance + savingsBalance;

    public BankAccount(){
        numAccounts++;
    }

    // SATAIC MEHTOD
    public static int AccountCount() {
        return numAccounts;
    }

    // GETTERS
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }

    // // METHOD
    public void addToAccount(int amount, String account){
        if(account == "savings"){
            this.savingsBalance += amount;
        }else if(account == "checking"){
            this.checkingBalance += amount;
        }
    }

    public void withdrawlFromAccount(int amount, String account){
        if(account == "savings"){
            if(this.savingsBalance - amount >= 0){    
                this.savingsBalance -= amount;
            }else{
                System.out.println("Not suffient funds");
            }
        }else if(account == "checking"){
            if(this.checkingBalance - amount >= 0){        
                this.checkingBalance -= amount;
            }else{
                System.out.println("Not suffient funds");
            }
        }
    }

    public void seeAllAccountFunds(){
        System.out.println("Checking: $" + checkingBalance);
        System.out.println("Savings: $" + savingsBalance);
    }

}