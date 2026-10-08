package javacore.aleatorios;

public class Seminarios {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminarios(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminarios(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminarios(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public static class Aluno {
        private String nome;
        private String idade;
        private Seminarios seminario;

        public Aluno(String nome, String idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getIdade() {
            return idade;
        }

        public void setIdade(String idade) {
            this.idade = idade;
        }

        public Seminarios getSeminario() {
            return seminario;
        }

        public void setSeminario(Seminarios seminario) {
            this.seminario = seminario;
        }
    }


    public static class Professor {
        private String nome;
        private String especialidade;
        private Seminarios[] seminarios;

        public Professor(String nome) {
            this.nome = nome;
        }

        public Professor(String nome, String especialidade) {
            this.nome = nome;
            this.especialidade = especialidade;
        }

        public Professor(String nome, String especialidade, Seminarios[] seminarios) {
            this.nome = nome;
            this.especialidade = especialidade;
            this.seminarios = seminarios;
        }

        public void imprime() {
            System.out.println("========");
            System.out.println("Professor: "+ this.nome);
            if (this.seminarios == null) return;
            System.out.println("## Seminarios cadastrados ##");
            for (Seminarios seminarios : this.seminarios) {
                System.out.println(seminarios.getTitulo());
                System.out.println(seminarios.getLocal().endereco);
                System.out.println("## Alunos ##");
                for (Aluno aluno : seminarios.getAlunos()) {
                    System.out.println("Aluno : "+aluno.getNome() + " idade: " + aluno.getIdade());

                }

            }



        }

        public Seminarios[] getSeminarios() {
            return seminarios;
        }

        public void setSeminarios(Seminarios[] seminarios) {
            this.seminarios = seminarios;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEspecialidade() {
            return especialidade;
        }

        public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
        }
    }


    public static class Local {
        private String endereco;

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public Local(String endereco) {
            this.endereco = endereco;
        }
    }


    static void main(String[] args) {
        Local local = new Local("Av pardal, 202");
        Aluno aluno = new Aluno("Otavio", "18");
        Professor professor = new Professor("Jose", "Pirata");
        Aluno[] alunosParaSeminarios = {aluno};


        Seminarios seminario = new Seminarios("Onde achar one piece", alunosParaSeminarios, local);

        Seminarios[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);


        professor.imprime();
    }


}
