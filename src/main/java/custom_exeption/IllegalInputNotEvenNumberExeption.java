package main.java.custom_exeption;

public class IllegalInputNotEvenNumberExeption extends RuntimeException {
    public IllegalInputNotEvenNumberExeption(String massage){
        super(massage);
    }
}
