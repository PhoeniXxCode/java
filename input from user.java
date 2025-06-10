import java.util.Scanner;

public class StudentGPA {
    public static void main(String[] args) {
        double studentGPA = 9.99;
        String studentFirstName = "Shruti";
        String studentLastName = "Baviskar";

        System.out.print(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA + "\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter new GPA: ");
        studentGPA = input.nextDouble();

        System.out.print(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);
        input.close();
    }
}
