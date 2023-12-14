import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }
        int j = 100;
        do{
            if(j % 5 == 0){
            System.out.println("j is " + j);}
            j--;
        }while (j >= -10);

        long r =2;
        do{
            System.out.println(r);
            r *= r;
        } while(r <= 1000000);

        for(int k = 5; k <=15 ; k++){
            System.out.println("k is " + k);

        }

        for (int l = 100; l >= 0; l--){
            if(l % 5 == 0){
            System.out.println("l is " + l);}
        }


       for(int m = 0; m<= 100; m++){
           if(m % 3 == 0 & m % 5 == 0){
               System.out.println("FizzBuzz " + m);}
           else if( m % 5 == 0){
               System.out.println("Buzz " + m);
           } else if (m % 3 == 0) {
               System.out.println("Fizz " + m);
           }
       }

       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter an Integer: ");
       int userInput = scanner.nextInt();
       System.out.println("Here is your table");
       System.out.println("Number | Squared | Cubed");
       System.out.println("------ | ------- | ------");
       for(int c = 0; c <= userInput; c++){

       System.out.println(c + "      | " + c * c + "       | " + c * c * c);}

        System.out.print("continue? [y/N]");
        String userContinue = scanner.next();
        boolean userConfirmation = userContinue.equalsIgnoreCase("y");

        if(userConfirmation){
            System.out.println("Thanks, lets continue");
        } else if(userContinue.equalsIgnoreCase("n")){
            System.out.println("No problem, Have a nice day");
        }


     while (true) {
         System.out.println("Please enter your Grade Number");
         int grade = scanner.nextInt();
         if (grade >= 88) {
             System.out.println("You've Made an A!");
         } else if (grade <= 87 && grade >= 80) {
             System.out.println("You've Made a B!");
         } else if (grade <= 79 && grade >= 67) {
             System.out.println("You've Made a C!");
         } else if (grade <= 66 && grade >= 60) {
             System.out.println("You've Made a D!");
         } else if (grade <= 59) {
             System.out.println("You've Made an F!");
         }
         System.out.println("Do you want to continue? (y/n)");
         scanner.nextLine();
         String answer = scanner.nextLine();

         if (answer.equalsIgnoreCase("n")) {
             break;
         }
     }




    }
}
