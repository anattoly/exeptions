package main.java;

import main.java.custom_exeption.IllegalInputNotEvenNumberExeption;
import main.java.custom_exeption.NonPalindromeExeption;
import main.java.custom_exeption.NullObjectExeption;
import main.java.custom_exeption.NumberOverHundredExeption;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

class Server {

    void isPalindrome(String s) throws NonPalindromeExeption {
        if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())/*.toLowerCase().equals(new StringBuilder(s).reverse().toString().toLowerCase())*/) {
            System.out.println("***** The word you entered is palindrome *****");
        } else {
            throw new NonPalindromeExeption("!!!! You word is not palindrome !!!!");
        }
    }

    void isEven(Integer i) throws IllegalInputNotEvenNumberExeption {
        if (i % 2 == 0) {
            System.out.println("***** You entered correct number. It is: " + i + " and it's even *****");
        } else {
            throw new IllegalInputNotEvenNumberExeption("!!!! You input not even number. Please try again !!!!");
        }
    }

    void isOverHundred(Integer i) throws NumberOverHundredExeption {
        if (i > 100) {
            throw new NumberOverHundredExeption("!!!! Sorry, you entered an incorrect number - it is more than 100 !!!!");
        } else {
            System.out.println("***** You entered correct number. It is less than one hundred. ******");
        }
    }

    Object randomObject() {
        Random random = new Random();
        List<Object> objectList = new ArrayList<>();
        objectList.add(new Object());
        objectList.add(null);

        return objectList.get(random.nextInt(objectList.size()));
    }

    void objectIsNull(Object o) throws NullObjectExeption {
        if (Optional.ofNullable(o).isPresent()) {
            System.out.println("***** Good. Object not null ******");
        } else {
            throw new NullObjectExeption("!!!! Non Object !!!!");
        }
    }

    void execStackOverflow() {
        execStackOverflow();
    }
}
