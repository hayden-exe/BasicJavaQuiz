package LearningJava.src;
import java.util.Scanner;

public class Choices {

    private static Scanner scanner;
    static boolean testAgain = true;

    public static void main(String[] args) {
        // adding while loop repeater
        while (testAgain){
        String question = "What is my favorite animal?";
        String choiceOne = "Dog";
        String choiceTwo = "Cat";
        String choiceThree = "Bird";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne + " or " + choiceTwo + " or " + choiceThree);

        // Create input var
        scanner = new Scanner(System.in);
        // Retrieve the user's input
        String answerInput = scanner.next();


        // If the user's input matches the correctAnswer...
        if (answerInput.equals(correctAnswer.toLowerCase())) { // .toLowerCase makes sure the answer isn't affected by upper/lowercase sensitivity
            System.out.println("Congrats! That's the right answer.");
            System.out.println("Thanks for taking the test.");
            break; // stop test if answer is correct
        } else {
            System.out.println("Sorry, that's not correct. The right answer is " + correctAnswer);
            }
        // if boolean in the repeating while loop is true, ask to take the test again
            if (testAgain) {
                System.out.println("Would you like to try again? Yes/No");
                String testAnswer = scanner.next();
                if (testAnswer.equals("No".toLowerCase())){
                    testAgain = false; // if "no" is selected, stop test from running again by changing boolean to false
                }
            }
        }
    }
}
