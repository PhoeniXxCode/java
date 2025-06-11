import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", " + choiceThree);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (correctAnswer.equalsIgnoreCase(input)) {
            System.out.println("Congrats! That's the correct answer.");
        } else {
            System.out.println("You are incorrect. The correct answer is " + correctAnswer + ".");
        }
    }
}
