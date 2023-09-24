import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int count = 0;
        int myNumber = (int) (Math.random() * 50);

        do {
            System.out.println("Guess my number (1-50):");
            userNumber = sc.nextInt();
            count++;
            if (userNumber == myNumber) {
                System.out.println("WOOHOO....Correct number!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Number is Large");
            } else {
                System.out.println("Number is Small");
            }
        } while (userNumber >= 0);
        System.out.println("The Correct number is:" + myNumber);
        System.out.println("The Number of Guesses are:" + count);
    }
}
