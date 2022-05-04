import java.util.Arrays;
import java.util.Random;

public class PrintingRandomDataTypes {

    public static void printRandomStuff() {

        Random r = new Random();
        char c = (char)(r.nextInt() + 'a');
        String alphanum = "ABCDEFGHIJLKMNOPQRSTUVWXYZ1234567890";
        String num = "1234567890";
        StringBuilder sb = new StringBuilder();

        //Generate random string
        for (int i = 0; i < 10; i++){
            int characterIndex = r.nextInt(alphanum.length());
            char rChar = alphanum.charAt(characterIndex);
            sb.append(rChar);
        }
        String randomString = sb.toString();

        //Generate random alphanumeric array
        char randomArray[];
        randomArray = new char[10];
        for (int i = 0; i < 10; i++){
            int j = r.nextInt(alphanum.length());
            randomArray[i] = alphanum.charAt(j);
        }

        //Generate random numeric array
        int randomNumbers[];
        randomNumbers = new int[10];
        int min = 1;
        int max = 100;
        for (int i = 0; i < 10; i++){
            randomNumbers[i] = r.nextInt(max-min+1) + min;
            randomNumbers[9] = 15;
        }

            //Print stuff
            System.out.println("Random number: " + r.nextInt());
            System.out.println("\nRandom char: " + c);
            System.out.println("\nRandom boolean: " + r.nextBoolean());
            System.out.println("\nRandom long: " + r.nextLong());
            System.out.println("\nRandom double: " + r.nextDouble());
            System.out.println("\nRandom string : " + randomString);
            System.out.println("\nRandom alphanumeric array: " + Arrays.toString(randomArray) + "\n");
            System.out.println("\nRandom numeric array: " + Arrays.toString(randomNumbers) + "\n");


        int number1 = r.nextInt();
        int number2 = r.nextInt();
        int number3 = 0;

        for (int i = 0; i < 10; i++){
            number3++;
            System.out.println("Incrementing this number lol: "+ number3);
        }

        long l1 = number1 + number2;
        System.out.println("\nHere's some quick math: " + number1 + " + " + number2 + " = " + l1);

        System.out.println("\nComparing " + number1 + " and " + number2);

        if(number1==number2){
            System.out.println(number1 + " is equal to " + number2);
        }else if (number1>number2){
            System.out.println(number1 + " is higher than " + number2);
        }else{
            System.out.println(number2 + " is higher than " + number1 + "\n");
        }

        for (int i = 0; i <= (randomNumbers.length - 1); i++){
            if (randomNumbers[i] != 15){
                System.out.println("\nRandom numeric array number at position " + i + " without the number 15: "+ randomNumbers[i] + "\n");
            }
        }


    }
}
