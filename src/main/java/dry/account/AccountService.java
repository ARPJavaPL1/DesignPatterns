package dry.account;

public class AccountService {

    private final Account account;

    public AccountService(Account account) {
        this.account = account;
    }

    public void printAccountDetails() {
        printLine("Obciążenia", account.getObciazenia());
        printLine("Uznania", account.getUznania());
        printLine("Opłaty", account.getOplaty());
        printLine("Saldo", account.getSaldo());
    }

    private String formatAmount(double value) {
        String formatted = String.format("%10.3f", Math.abs(value));
        return value < 0 ? "-" + formatted : formatted;
    }

    private void printLine(String label, double value) {
        System.out.printf("%s: %s\n", label, formatAmount(value));
    }
}
