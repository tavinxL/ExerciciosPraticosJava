package javacore.aleatorios;

public class Sort {
    public void sorted(int... a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {

                // Se o número atual for maior que o próximo, eles trocam de lugar
                if (a[j] > a[j + 1]) {
                    // Variável temporária para não perder o valor durante a troca
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }


        }


    }

    static void main(String[] args) {
        Sort sort = new Sort();

        sort.sorted(2,6, 8, 9, 0, 3, 6, 7);
    }
}

