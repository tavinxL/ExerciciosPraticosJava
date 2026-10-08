package academy.java.introducao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aula01 {
    static void main(String[] args) {
        List<String> Fileiras = new ArrayList<>();


        for (char i = 'A'; i != 'J'; i++) {
            for (int j = 1; j <= 10; j++) {
                Fileiras.add("" + i + j);
                //System.out.println(""+i+j);
                // System.out.printf("%c%d\n", i, j);


            }

        }

        String compra = "B1";
        for (int i = 0; i < Fileiras.size(); i++) {
            System.out.println(Fileiras.get(i));
            if (compra.equalsIgnoreCase(Fileiras.get(i))) {
                break;

            }

        }

    }
}

