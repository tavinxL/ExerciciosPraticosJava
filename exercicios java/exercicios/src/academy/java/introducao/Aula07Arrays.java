package academy.java.introducao;

public class Aula07Arrays {
    static void main(String[] args) {

        int[][] dias = new int[3][3];

        dias[0][0] = 20;
        dias[0][1] = 40;
        dias[0][2] = 30;

        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 3;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------");

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

    }
}
