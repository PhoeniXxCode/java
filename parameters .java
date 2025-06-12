public class HelloWorld {

    public static void calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        System.out.println("Your total meal price is: " + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(0.25, 0.18, 0.08); // You can replace 0.25 with actual meal price like 100.0
    }
}
