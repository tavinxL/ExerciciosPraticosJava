package javacore.aleatorios;

public class Carro {
    public String marca;
    public String modelo;
    public int velocidadeAtual;

    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
    }

    public void frear(int decremento) {
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public int getVelocidade() {
       return velocidadeAtual;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Chevrolet";
        carro.modelo = "Tracker";
        carro.velocidadeAtual = 0;

        carro.acelerar(30);
        System.out.println(carro.getVelocidade());

        carro.acelerar(60);
        System.out.println(carro.getVelocidade());

        carro.frear(20);
        System.out.println(carro.getVelocidade());
    }
}
