public class HelloWorld {
    public static void main(String[] args) {
        String studentFirstName = "shruti"; // Initialize studentFirstName
        String studentLastName = "Baviskar"; // Initialize studentLastName
        char studentFirstInitial = studentFirstName.charAt(0);
        char secondLetterOfLastName = studentLastName.charAt(1); // More descriptive variable name
        System.out.println(studentFirstInitial);
        System.out.println(secondLetterOfLastName);
    }
}
