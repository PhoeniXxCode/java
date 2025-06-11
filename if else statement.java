import java.util.Scanner;

public class FavoriteFoodExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String favouriteFood = "pizza";
        System.out.println(favouriteFood);

        System.out.print("Enter a number: ");
        int inputted = input.nextInt();

        if (inputted < 100) {
            favouriteFood = "chicken tacos";
            System.out.println(favouriteFood);
        } else {
            favouriteFood = "steak";
            System.out.println(favouriteFood);
        }

        input.close();
    }
}
