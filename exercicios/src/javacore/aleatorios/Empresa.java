package javacore.aleatorios;

public class Empresa {
    private String nome;
    private Funcionario[] funcionarios;

    public Empresa(String nome, Funcionario[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (funcionarios == null) return;
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());

        }
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static class Funcionario {
        private String nome;
        private Empresa empresa;

        public void imprime() {
            if (empresa != null) {
                System.out.println(this.nome);
                System.out.println(empresa.getNome());
            }
        }

        public Funcionario(String nome) {
            this.nome = nome;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Empresa getEmpresa() {
            return empresa;
        }

        public void setEmpresa(Empresa empresa) {
            this.empresa = empresa;
        }
    }

    static void main(String[] args) {
        Empresa empresa = new Empresa("Junior locadora");
        Funcionario funcionario = new Funcionario("Otavio");
        Funcionario funcionario1 = new Funcionario("Amanda");
        Funcionario[] funcionarios = {funcionario,funcionario1};

        funcionario.setEmpresa(empresa);
        funcionario1.setEmpresa(empresa);
        empresa.setFuncionarios(funcionarios);


        funcionario1.imprime();

        System.out.println("------------------------");
        funcionario.imprime();
        System.out.println("------------------------");

        empresa.imprime();
        System.out.println("------------------------");
    }


}
