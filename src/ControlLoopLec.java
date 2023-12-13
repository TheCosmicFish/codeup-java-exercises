import java.util.Scanner;

public class ControlLoopLec {
    public static void main(String[] args) {
        boolean isThisTrue = 4 == 5; // this is false
        boolean howAboutThis = 5.0 == 5; // java will read this as true as long as it is 5.000000
        boolean doubleNegative = 5.0 != 5; // This will be false, 5.0 is equal to 5
        // && checks the second statement only if the first is true //
        // || checks the second statement only if the first is true //
        // & checks both statements regardless of the first //
        // | checks both statements regardless of the first //
        System.out.println(isThisTrue);
        System.out.println(howAboutThis);
        System.out.println(doubleNegative);


        Scanner sc = new Scanner(System.in);
        System.out.print("continue? [y/N]");
        String userInput = sc.next();
        boolean confirmation = userInput.equalsIgnoreCase("y");

        if(confirmation){
            System.out.println("Thanks, here is more about Java.");
        } else if(userInput.equalsIgnoreCase("n")){
            System.out.println("That is just too dang bad");
        } else {
            System.out.println("You've unlocked the Ruby course.");
        }

        int caseSwitch = 0;
        switch (caseSwitch){
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("case 2");
            default:
                System.out.println("Default Case");
                break;
        }


        // Loops

        //While------------------------------

        int i =0;
        while(i < 10){
            System.out.println("i is " + i);
            i++;
        }

        //Do While---------------------------

        do{
            System.out.println("i is" + i);
        } while (false);

        // For------------------------------

        for( int j = 0; j <10; j++){
            System.out.println("j is" + j);
        }

        //Break-----------------------------

        for(int k = 1; k < 100; k++) {
            System.out.println(k);
            if (k == 5) {
                break;
            } //   Breaks out of the loop when 5 is reached


        // Continue-------------------------

            for(int c = 1; c <= 10; c++) {
                if(c % 2 == 1) {
                    continue;
                }
                System.out.println(i);
            }// will continue after checking conditions again


        }
    }
}
