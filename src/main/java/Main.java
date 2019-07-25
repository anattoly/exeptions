package main.java;

import main.java.custom_exeption.IllegalInputNotEvenNumberExeption;
import main.java.custom_exeption.NonPalindromeExeption;
import main.java.custom_exeption.NullObjectExeption;
import main.java.custom_exeption.NumberOverHundredExeption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Server server = new Server();

        System.out.println("======= Check your word whether it is a palindrome =======");
        try {
            server.isPalindrome(reader.readLine());
        } catch (NonPalindromeExeption | IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n====== Enter number from 1 to 100, please ======");
        try {
            Integer number = Integer.parseInt(reader.readLine());
            server.isOverHundred(number);
        } catch (NumberOverHundredExeption | NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n====== Now check your number is even ======");
        try {
            Integer number = Integer.parseInt(reader.readLine());
            server.isEven(number);
        } catch (IllegalInputNotEvenNumberExeption | NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n========== Check Object ==========");
        try {
            Object obj = null;
            server.objectIsNull(obj);
        } catch (NullObjectExeption e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== ATTENTION!!! The program will throw StackOverflow Exception. Want to continue? (y/n)===");
        try {
            String answer = reader.readLine();
            if (answer.equals("y")) {
                server.execStackOverflow();
            } else {
                System.out.println("***** You don't like to risk *****");
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
