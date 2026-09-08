package academy.java.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];
        arrayInt[0][0] = 4;

        System.out.println(arrayInt[0][1]);


    }
}
