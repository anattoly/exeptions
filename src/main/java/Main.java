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

        Server server = new Server();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("======= Check your word whether it is a palindrome =======");
            server.isPalindrome(reader.readLine());
            System.out.println("\n====== Enter number from 1 to 100, please ======");
            Integer number = Integer.parseInt(reader.readLine());
            server.isOverHundred(number);
            server.isEven(number);
            System.out.println("\n========== Do you want to check the object? Enter Y/N ==========");
            String answerObject = reader.readLine();
            if (answerObject.equalsIgnoreCase("y")) {
                server.objectIsNull(server.randomObject());
            } else {
                System.out.println("*** You refused to check the object ***");
            }
            System.out.println("\n=== ATTENTION!!! The program will throw StackOverflow Exception. Want to continue? (Y/N)===");
            String answerOverflow = reader.readLine();
            if (answerOverflow.equalsIgnoreCase("y")) {
                server.execStackOverflow();
            } else {
                System.out.println("***** You don't like to risk *****");
            }
        } catch (NonPalindromeExeption e) {
            System.out.println("NonPalindromeExeption: " + e.getMessage());
        } catch (NumberOverHundredExeption e) {
            System.out.println("NumberOverHundredExeption: " + e.getMessage());
        } catch (IllegalInputNotEvenNumberExeption e) {
            System.out.println("IllegalInputNotEvenNumberExeption: " + e.getMessage());
        } catch (NullObjectExeption e) {
            System.out.println("NullObjectExeption: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
