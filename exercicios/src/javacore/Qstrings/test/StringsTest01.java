package javacore.Qstrings.test;

public class StringsTest01 {
    static void main(String[] args) {
        String nome = "Otavio";
        String nome2 = "Otavio";
        System.out.println(nome.equals(nome2));
        String nome3 = new String("Otavio");
        System.out.println(nome2.equals(nome3.intern()));
    }
}
