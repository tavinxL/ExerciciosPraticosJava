package javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
