import java.util.Scanner;
import java.util.Stack;

/**
 * Application that reads a sentence from the user and prints the sentence
 * with the characters of each word backwards. Uses a stack to reverse the characters of each word.
 * Author: Alvinbernasko
 * Email: akabernasko@st.ug.edu.gh
 * id:10966395
 */
public class ReverseWords {
    public static void main(String[] args) {
        // Create a scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Process each word
        for (String word : words) {
            // Use a stack to reverse the characters of the word
            Stack<Character> stack = new Stack<>();
            for (char ch : word.toCharArray()) {
                stack.push(ch);
            }

            // Pop the characters from the stack to get the reversed word
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }

            // Append a space after each word
            result.append(" ");
        }

        // Print the result
        System.out.println("Reversed sentence:");
        System.out.println(result.toString().trim());

        // Close the scanner
        scanner.close();
    }
}
