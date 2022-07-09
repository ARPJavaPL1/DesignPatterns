package refactoring.extractmethod;

import java.util.Date;

public class Code {

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

    void printUser(User user) {
        // coś z tym userem robimy
        // kilka instrukcji

        // wyświetlenie szczegółów użytkownika
        System.out.println("Imię i nazwisko:");
        System.out.println(user.getFirstName() + " " + user.getLastName());
        System.out.println("Saldo");
        System.out.println(user.getSaldo());

        Date date = new Date();
        if (isSummer(date)) {
            // do smth
        }
    }

    private boolean isSummer(Date date) {
        return date.before(new Date()) || date.after(new Date());
    }

}
