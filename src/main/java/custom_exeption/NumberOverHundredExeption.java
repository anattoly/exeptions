package main.java.custom_exeption;

public class NumberOverHundredExeption extends RuntimeException {
    public NumberOverHundredExeption(String massage) {
        super(massage);
    }
}
