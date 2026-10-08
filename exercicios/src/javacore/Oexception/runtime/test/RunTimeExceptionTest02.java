package javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento invalido");
        }
        return a/b;

    }
}