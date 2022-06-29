package dry.account;

public class Account {
    private double obciazenia;
    private double uznania;
    private double oplaty;
    private double saldo;

    public Account(double obciazenia, double uznania, double oplaty, double saldo) {
        this.obciazenia = obciazenia;
        this.uznania = uznania;
        this.oplaty = oplaty;
        this.saldo = saldo;
    }

    public double getObciazenia() {
        return obciazenia;
    }

    public double getUznania() {
        return uznania;
    }

    public double getOplaty() {
        return oplaty;
    }

    public double getSaldo() {
        return saldo;
    }
}
