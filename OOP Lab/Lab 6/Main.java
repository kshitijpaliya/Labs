class Bank {
    public double getInterestRate() {
        return 0.0; // Default interest rate
    }
}

class SBI extends Bank {
    @Override
    public double getInterestRate() {
        return 8.0; // SBI bank interest rate
    }
}

class ICICI extends Bank {
    @Override
    public double getInterestRate() {
        return 7.0; // ICICI bank interest rate
    }
}

class AXIS extends Bank {
    @Override
    public double getInterestRate() {
        return 9.0; // AXIS bank interest rate
    }
}

public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("Interest Rate in SBI: " + sbi.getInterestRate() + "%");
        System.out.println("Interest Rate in ICICI: " + icici.getInterestRate() + "%");
        System.out.println("Interest Rate in AXIS: " + axis.getInterestRate() + "%");
    }
}
