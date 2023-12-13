import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        String piValue = "The value of pi is approximately ";
        System.out.printf("%s  %.2f.%n",piValue, pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        Integer userInput = scanner.nextInt();
        System.out.println(userInput);

        System.out.println("Enter 3 words separated by a space");
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);

        System.out.println("Tell me a story:");
        scanner.nextLine();
        String story = scanner.nextLine();
        System.out.println("Your Story: " + story);



        System.out.println("Enter the length of the room");
        //Integer length = scanner.nextInt();
        Integer length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a width of the room");
        //Integer width = scanner.nextInt();
        Integer width = Integer.parseInt(scanner.nextLine());
        //Integer area = width * length;
        //Integer perimeter = (width * length) * 2;
       // System.out.println("The perimeter of the room is:");
        //System.out.println(perimeter);
        //System.out.println("The area of the room is:");
        //System.out.println(area);

        System.out.printf("The length of the room is %d %n and the width of the room is %d %n Which means the perimeter of the room is %d and the area is %d %n", length, width, (2* length) + (2 * width), length * width );
    }
}
