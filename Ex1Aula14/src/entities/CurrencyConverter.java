package entities;

public class CurrencyConverter {
    public static double dollar;
    public static double dollarPrice;
    public final static double iof = 0.06;
    public static double dollarQuotation(){
        double total = (dollar * dollarPrice);
        return (total * iof) + total;
    }
}
