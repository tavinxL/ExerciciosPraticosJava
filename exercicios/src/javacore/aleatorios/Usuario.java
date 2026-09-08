package javacore.aleatorios;

public class Usuario {
    private String email;
    private String senha;
    private int idade;
    private double saldoPontos;
    private boolean ativo;

    public Usuario(String email, String senha, int idade) {
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.saldoPontos = 0;
        this.ativo = true;
    }

    // Validação de email
    public boolean setEmail(String validarEmail) {
        if (validarEmail.contains("@") && validarEmail.length() > 5 && validarEmail.equals(email)) {
            //email = novoEmail; (Aqui não tem que receber um novo email, ele só tem que validar
            // se o email que ele colocou primeiro esta certo, colocar email = novoEmail, vai fazer ele]
            // receber um novo email, nao validar)
            System.out.println("Email validado com sucesso");
            return true;
        }
        System.out.println("Erro na validação do email");
        return false;
    }

    // Alteração de senha
    public boolean alterarSenha(String senhaAntiga, String senhaNova) {
        if (senhaAntiga.equals(senha) && senhaNova.length() >= 6 && !senhaNova.equals(senha)) {
            senha = senhaNova;
            System.out.println("Senha alterado com sucesso");
            return true;
        }
        System.out.println("Senha não alterada, erro na alteração");
        return false;
    }

    // Ganhar pontos (10% de bônus se usuário tem 18+)
    public void ganharPontos(double pontos) {
        if (idade >= 18) {
            saldoPontos += pontos + (pontos * 0.10);
            System.out.println("Pontos adicionados com bônus");
        } else {
            saldoPontos += pontos;
            System.out.println("Pontos adicionados sem bônus");
        }
    }

    // Gastar pontos
    public boolean gastarPontos(double pontos) {
        if (pontos <= saldoPontos) {
            saldoPontos -= pontos;
            return true;
        }
        return false;
    }

    // Desativar conta
    public void desativarConta(String senhaConfirmacao) {
        if (senhaConfirmacao.equals(senha)) {
            ativo = false;
            System.out.println("Conta desativada");
        } else {
            System.out.println("Erro ao desativar a conta");
        }
    }

    // Getters
    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public double getSaldoPontos() {
        return saldoPontos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    // Info do usuário
    public String getInfo() {
        return "Email: " + email + " | Idade: " + idade
                + " | Pontos: " + saldoPontos + " | Ativo: " + ativo;
    }

    static void main(String[] args) {
        Usuario usuario1 = new Usuario("zp0777@gmail.com", "0900", 18);


        System.out.println(usuario1.setEmail("zp0777@gmail.com"));
        System.out.println();

        System.out.println(usuario1.alterarSenha("0900", "202020"));
        System.out.println();

        usuario1.ganharPontos(20);
        System.out.println();

        System.out.println(usuario1.gastarPontos(10));
        System.out.println();

        System.out.println(usuario1.getEmail());
        System.out.println();

        System.out.println(usuario1.getIdade());
        System.out.println();

        System.out.println(usuario1.getSaldoPontos());
        System.out.println();

        System.out.println(usuario1.isAtivo());
        System.out.println();

        usuario1.desativarConta("202020");

        System.out.println(usuario1.isAtivo());

        System.out.println(usuario1.getInfo());
        System.out.println();


    }
}
