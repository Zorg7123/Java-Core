package Lesson02;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Размер массива не корректный!");
    }
}
