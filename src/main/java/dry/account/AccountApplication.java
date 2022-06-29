package dry.account;

public class AccountApplication {
    public static void main(String[] args) {
        Account account = new Account(
                100d,
                1000d,
                0.99d,
                8991.17d);

        AccountService accountService = new AccountService(account);
        accountService.printAccountDetails();
    }
}
