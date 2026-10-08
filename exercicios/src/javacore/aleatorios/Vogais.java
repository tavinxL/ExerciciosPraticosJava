package javacore.aleatorios;

public class Vogais {
    public void analiseVogais(String palavra) {
        int count = 0;
        String vogais = "aeiou";
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < vogais.length(); j++) {
            String letras = String.valueOf(palavra.charAt(i));
            String vogal = String.valueOf(vogais.charAt(j));
            if (letras.equalsIgnoreCase(vogal)) {
                count += 1;
            }

            }
        }
        System.out.printf("%s = %d vogal(is)", palavra, count);
    }

    static void main(String[] args) {
        Vogais vogais = new Vogais();
        vogais.analiseVogais("banana");

    }
}
