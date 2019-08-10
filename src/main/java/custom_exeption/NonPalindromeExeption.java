package main.java.custom_exeption;

public class NonPalindromeExeption extends RuntimeException {
    public NonPalindromeExeption(String massage) {
        super(massage);
    }
}
