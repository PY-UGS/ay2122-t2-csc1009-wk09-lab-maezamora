import java.util.Arrays;
import java.util.Random;

public class RandomCharacter {
    private char character;
    Random r = new Random();

    public char getRandomLowerCaseLetter(){
        character = (char)(r.nextInt(26) + 'a');
        return character;
    }

    public char getRandomUpperCaseLetter(){
        character = (char)(r.nextInt(26) + 'A');
        return character;
    }

    public char getRandomDigitCharacter(){
        //from 0 to 9
        int i = r.nextInt(10);
        character = Character.forDigit(i,10);
        return character;
    }

    public char getRandomCharacter(){
        // Create a random ASCII printable character in Java
        // Returns both lowercase and uppercase letters
        character = (char)(r.nextInt(95)+32);
        return character;
    }

    private static boolean isPrime(int inputNum){
        if (inputNum <= 3 || inputNum % 2 == 0)
            return inputNum == 2 || inputNum == 3; //this returns false if number is <=1 & true if number = 2 or 3
        int divisor = 3;
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0))
            divisor += 2; //iterates through all possible divisors
        return inputNum % divisor != 0; //returns true/false
    }

    public int getPrime(){
        int num = 0;
        num = r.nextInt(1000) + 1;

        while (!isPrime(num)) {
            num = r.nextInt(1000) + 1;
        }
        return num;
    }

    public static void main(String[] args) {
        char[] lowerCaseLetter=new char[15];
        char[] upperCaseLetter=new char[15];
        char[] digitCharacter=new char[15];
        char[] randomCharacter=new char[15];
        int[] primeNo = new int[15];

        RandomCharacter random = new RandomCharacter();

        System.out.println("15 random characters");
        for(int i=0;i<15;i++){
            lowerCaseLetter[i]=random.getRandomLowerCaseLetter();
            upperCaseLetter[i]=random.getRandomUpperCaseLetter();
            digitCharacter[i]=random.getRandomDigitCharacter();
            randomCharacter[i]=random.getRandomCharacter();
            primeNo[i]=random.getPrime();
        }

        System.out.println("Lower Case Letters: "+Arrays.toString(lowerCaseLetter));
        System.out.println("Upper Case Letters: " +Arrays.toString(upperCaseLetter));
        System.out.println("Digit Characters: "+Arrays.toString(digitCharacter));
        System.out.println("Random Characters: " +Arrays.toString(randomCharacter));
        System.out.println("Prime Numbers: "+Arrays.toString(primeNo));

    }
}
