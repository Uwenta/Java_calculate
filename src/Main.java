public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double rate = 9.99; // процентная ставка
        int sum = 1_000_000; // сумма кредита

        int paymentA = service.calculate(rate, sum, 12);
        System.out.println("Ежемесячный платеж на 12 месяцев: " + paymentA);

        int paymentB = service.calculate(rate, sum, 24);
        System.out.println("Ежемесячный платеж на 24 месяца " + paymentB);

        int paymentC = service.calculate(rate, sum, 36);
        System.out.println("Ежемесячный платеж на 36 месяцев: " + paymentC);


    }
}