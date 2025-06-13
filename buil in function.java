public class Answer {

    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static double calculateYearlySalary(double hoursPerWeek, double amountPerHour) {
        if (hoursPerWeek < 0 || amountPerHour < 0) {
            return 0;
        }
        return hoursPerWeek * amountPerHour * 52;
    }

    public static void main(String[] args) {
        double hours = 40;          // example input
        double rate = 25.5;         // example input

        double salary = calculateYearlySalary(hours, rate);
        System.out.println("Yearly Salary: ₹" + salary);
    }
}
