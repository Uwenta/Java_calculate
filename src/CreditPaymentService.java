public class CreditPaymentService {
    public int calculate(double rate, int sum, int term) {
        return (int) ((sum * (rate / 100 / 12)) / (1 - Math.pow(1 + (rate / 100 / 12), -term)));
    }
}

