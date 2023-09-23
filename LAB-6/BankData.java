class Bank {
    public double getInterestRate() {
        return 0.0; // Default interest rate (0%)
    }
}

class SBI extends Bank {
    @Override
    public double getInterestRate() {
        return 8.0; // SBI bank's interest rate: 8%
    }
}

class ICICI extends Bank {
    @Override
    public double getInterestRate() {
        return 7.0; // ICICI bank's interest rate: 7%
    }
}

class AXIS extends Bank {
    @Override
    public double getInterestRate() {
        return 9.0; // AXIS bank's interest rate: 9%
    }
}

public class BankData {
    public static void main(String[] args) {
        Bank sbiBank = new SBI();
        Bank iciciBank = new ICICI();
        Bank axisBank = new AXIS();

        System.out.println("Interest rate for SBI: " + sbiBank.getInterestRate() + "%");
        System.out.println("Interest rate for ICICI: " + iciciBank.getInterestRate() + "%");
        System.out.println("Interest rate for AXIS: " + axisBank.getInterestRate() + "%");
    }
}
