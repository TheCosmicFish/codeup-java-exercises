public class HelloWorld {
    public HelloWorld() {

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int myFavoriteNumber = 22;
        System.out.println(myFavoriteNumber);
        String myString = "Hello From Cody";
        //myString= 'C';
        // myString = 3.14159; it cannot hold the value of a double since it is a string
        long myNumber;
        // myNumber = 3.14 long can't have a decimal
        // myNumber = (double) 3.14 will work as a cast
        //System.out.println(myNumber);
        //myNumber = 123L; // This is still being cast as a long, CMD D to duplicate line
        myNumber = 123; // This is still being cast as a long, still considered more of an INT
        //float myNumber = 3.14;
        // myNumber = 3.14F// we could also do (float) 3.14; as a cast
        System.out.println(myString);


        // int x = 5;
        //System.out.println(x++); This is post incrementation, we will get 5 and then 6, it will read the old value and then the new
        //System.out.println(x);

        //int x = 5;
        //System.out.println(++x); This is pre incrementation, we will get 6 and 6, the value is read first
        //System.out.println(x);
        /*System.out.println(x);*/

        // String theNumberThree = "three";// This all will technically run, however this is a runtime error
        // Object o = theNumberThree;// when we hit an exception, it will stop and not complete
        //  int three = (int) o;// this is called a class cast exception, int != string
        // int three = (int) "three";// this could work because it is a literal string and unlike before where the object could be anything


        // int x = 4; //Shorthand the equation
        // x = x + 5; //
        //x += 5//Answer

        // int x = 3; //Shorthand the equation
        // int y = 4; //
        // y = y * x; //
        //y *= x // Answer


        // int x = 10; //Shorthand the equation
        // int y = 2; //
        // x = x / y; //
        //x /= y   // Answer 1

        // y = y - x; //Shorthand the equation
        //y -= x // Answer 2

        int bigInt = Integer.MAX_VALUE + 1;// This will roll over to the minimum value in this example. When the max value you passed, the number will start over in its cycle.
        System.out.println(bigInt);


    }
}
