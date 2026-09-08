package javacore.aleatorios;

public class Pessoa {
    public String nome;
    public int idade;

    public String apresentar() {
        return "Olá, meu nome é " + nome + " e tenho " + idade + " anos";
    }

    public boolean maiorDeIdade() {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Otavio";
        pessoa1.idade = 18;

        pessoa2.nome = "Ruan";
        pessoa2.idade = 17;

        String apresentacao = pessoa1.apresentar();
        boolean verificaridade = pessoa1.maiorDeIdade();
        System.out.println("Pessoa 1");
        System.out.println(apresentacao);
        System.out.println(verificaridade);

        System.out.println("------------------");

        apresentacao = pessoa2.apresentar();
        verificaridade = pessoa2.maiorDeIdade();
        System.out.println("Pessoa 2");
        System.out.println(apresentacao);
        System.out.println(verificaridade);




    }
}
