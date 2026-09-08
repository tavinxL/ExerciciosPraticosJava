package javacore.Dcontrutores.Test;

import javacore.Dcontrutores.dominio.Pc;

public class PcTest {
    static void main(String[] args) {
        Pc pc = new Pc("Asus b450m", "algo Storm", "2x8", "Ryzen 5500G", "RTX 2060");

        System.out.println(pc.getInfo());


    }
}
