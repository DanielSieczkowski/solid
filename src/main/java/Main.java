import java.math.BigDecimal;

import dependency_inversion.BookService;
import interface_segregation.BankPayment;
import interface_segregation.Payment;
import open_close.BankingAppWithdrawalService;
import open_close.CurrentAccount;
import single_responsibility.TextManipulator;

public class Main {
    public static void main(String[] args) {
        //single responsibility
        TextManipulator textManipulator = new TextManipulator("Ala ma kota");
        textManipulator.printText();
        textManipulator.appendText(" test dodawania tekstu");
        textManipulator.printText();
        textManipulator.printOutEachWordOfText();
        textManipulator.printRangeOfCharacters(1,4);

        //openc/lose
        BankingAppWithdrawalService bankingAppWithdrawalService = new BankingAppWithdrawalService();
        CurrentAccount currentAccount = new CurrentAccount();
        bankingAppWithdrawalService.depositToCurrentAccount(BigDecimal.valueOf(100), currentAccount);
        bankingAppWithdrawalService.withdrawFromCurrentAccount(BigDecimal.valueOf(50), currentAccount);

        // liskov

        //interface segregation
        Payment bankPayment = new BankPayment();

        //dependency inversion
        BookService bookService = new BookService();
        bookService.createBook("W pustyni i w puszczy ");
    }
}
