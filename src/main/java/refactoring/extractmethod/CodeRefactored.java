package refactoring.extractmethod;

public class CodeRefactored {
    private class User {
        private String firstName;
        private String lastName;
        private double saldo;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public void printUser(User user) {
        // coś z tym userem robimy
        // kilka instrukcji

        printUserDetails(user);
    }

    private void printUserDetails(User user) {
        printUserName(user);
        printUserSaldo(user);
    }

    private void printUserName(User user) {
        System.out.println("Imię i nazwisko:");
        System.out.println(user.getFirstName() + " " + user.getLastName());
    }

    private void printUserSaldo(User user) {
        System.out.println("Saldo");
        System.out.println(user.getSaldo());
    }
}
