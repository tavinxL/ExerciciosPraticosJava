package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioGastos () {
        System.out.println("Eu " + this.nome + " gastei todo meu " + this.salario);
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
