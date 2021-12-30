package Data;

import java.util.Scanner;

public class vsctSystem {
    //Initialise classes
    private static TransferTransaction transfer;
    private static DepositTransaction deposit;
    private static WithdrawTransaction withdraw;

    public static MenuOption ReadMenuOption() {
        do {
            try {
                System.out.println("*****************");
                System.out.println("SELECT AN OPTION");
                System.out.println("1. Create new account");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Print");
                System.out.println("5. Transfer");
                System.out.println("6. Print History");
                System.out.println("7. Quit");
                System.out.println("*****************");
                Scanner scanner = new Scanner(System.in);
                int userSelect =  scanner.nextInt();
                switch (userSelect) {
                    case 1 -> { System.out.println("Selected: Create Account");
                        return MenuOption.CREATE_ACCOUNT; }
                    case 2 -> { System.out.println("Selected: Withdraw");
                        return MenuOption.WITHDRAW; }
                    case 3 -> { System.out.println("Selected: Deposit");
                        return MenuOption.DEPOSIT; }
                    case 4 -> { System.out.println("Selected: Print");
                        return MenuOption.PRINT; }
                    case 5 -> { System.out.println("Selected: Transfer");
                        return MenuOption.TRANSFER; }
                    case 6 -> { System.out.println("Selected: Print History");
                        return MenuOption.PRINT_HISTORY; }
                    case 7 -> { System.out.println("Selected: Quit");
                        return MenuOption.QUIT; }
                    default -> throw new Exception("ERROR: Select one of the options"); }
            } catch (Exception e) { System.out.println(e.getMessage()); }
        } while (true);
    }

    //FUNCTIONS
    public static void CreateAccount(vsct vsct) throws Exception {
        System.out.println("Name of the account: ");
        Scanner nameScanner = new Scanner(System.in);
        String Name = nameScanner.next();
        System.out.println("Initial balance: ");
        Scanner balanceScanner = new Scanner(System.in);
        double Balance = balanceScanner.nextDouble();
        if (Balance < 0)
            throw new Exception("ERROR: Initial balance cannot be a negative number");
        else {
            Account account = new Account(Name, Balance);
            vsct.AddAccount(account);
            System.out.println("You have successfully created an account");
            System.out.println(account.Name() + ", Welcome!");
        }
    }

    public static Account FindAccount(vsct vsct) {
        System.out.println("Name of the account: ");
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.next();
        Account account = vsct.GetAccount(name);
        if (account == null) System.out.println("Error: Account does not exist");
        else System.out.println("Account found!");
        return account;
    }

    public static void DoRollback(vsct vsct) throws Exception {
        System.out.println("Choose translation to roll back: ");
        Scanner tranNum = new Scanner(System.in);
        int choice = tranNum.nextInt();
        Transaction transaction = vsct.GetTransaction(choice);
        if (transaction != null) transaction.Rollback();
    }

    public static void DoPrintHistory(vsct vsct) throws Exception {
        vsct.PrintTransactionHistory(); DoRollback(vsct);
    }

    public static void DoDeposit(vsct vsct) throws Exception {
        Account account = FindAccount(vsct);
        System.out.println("Deposit amount: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        deposit = new DepositTransaction(account, amount);
        vsct.ExecuteTransaction(deposit);
        deposit.Print();
    }

    public static void DoWithdraw(vsct vsct) throws Exception {
        Account account = FindAccount(vsct);
        System.out.println("Withdraw amount: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        withdraw = new WithdrawTransaction(account, amount);
        vsct.ExecuteTransaction(withdraw);
        withdraw.Print();
    }

    public static void DoTransfer(vsct vsct) throws Exception {
        System.out.println("Host account name: ");
        Account accountFrom = FindAccount(vsct);
        System.out.println("Receiver account name: ");
        Account accountTo = FindAccount(vsct);
        System.out.println("Transfer amount: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        transfer = new TransferTransaction(accountFrom, accountTo, amount);
        vsct.ExecuteTransaction(transfer);
        transfer.Print();
    }

    public static void DoPrint(vsct vsct) throws Exception {
        try { Account account = FindAccount(vsct); account.Display(); }
        catch (Exception ignored) {}
    }

    public static void main(String[] args) throws Exception {
        vsct sai = new vsct();
        while(true) {
            switch (ReadMenuOption()) {
                case CREATE_ACCOUNT -> CreateAccount(sai);
                case WITHDRAW -> DoWithdraw(sai);
                case DEPOSIT -> DoDeposit(sai);
                case PRINT -> DoPrint(sai);
                case TRANSFER -> DoTransfer(sai);
                case PRINT_HISTORY -> DoPrintHistory(sai);
                case QUIT -> { return; }
            } System.out.println("Press return to continue ..."); System.in.read();
        }
    }
}
