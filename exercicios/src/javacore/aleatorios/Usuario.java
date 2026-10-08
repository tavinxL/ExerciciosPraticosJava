package javacore.aleatorios;

public class Usuario {
    private String nome;
    private String email;
    private int idade;
    private String senha;
    private boolean ativo;


    public Usuario(String nome, String email, int idade, String senha) {
        this.nome = nome;
        if (email.contains("@") && email.length() > 5) {
            this.email = email;
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
            return;
        }
        if (idade > 0) {
            this.idade = idade;
            System.out.println("Idade válida");
        } else {
            System.out.println("Idade inválida");
            return;
        }
        if (senha.length() < 7) {
            System.out.println("Senha inváida, precisa conter 7 caracteres");
            return;
        } else {
            this.senha = senha;
            System.out.println("Senha válida");
        }
        this.ativo = true;


    }

    public boolean autenticar(String senhaDigitada) {
        if (senhaDigitada.equals(senha)) {
            System.out.println("Senha autenticada com sucesso");
            return true;
        }
        System.out.println("Senha não autenticada");
        return false;
    }

    public void aniversario() {
        System.out.println("Parabens, você acaba de fazer " + ++idade + " anos");
    }

    public void desativar() {
        System.out.println("Desativando conta...");
        ativo = false;
    }

    public void alterarSenha(String senhaAtual, String novaSenha) {
        if (!senhaAtual.equals(senha) || novaSenha.equals(senhaAtual) || novaSenha.length() < 7) {
            System.out.println("Senha nova inválida");
            return;
        }
        senha = novaSenha;
        System.out.println("Senha alterada com sucesso");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
        System.out.println("Ativo: " + ativo);
    }

    static void main(String[] args) {
        Usuario u1 = new Usuario("Otavio", "otavio@email.com", 25, "senha123");
        System.out.println();

        u1.exibir();

        System.out.println("\n--- Autenticando com senha correta ---");
        boolean ok = u1.autenticar("senha123");
        System.out.println("Autenticado? " + ok);

        System.out.println("\n--- Fazendo aniversário ---");
        u1.aniversario();
        u1.exibir();

        System.out.println("\n--- Desativando usuário ---");
        u1.desativar();
        u1.exibir();

        System.out.println("\n--- Trocando senha sem informar a atual ---");
        u1.alterarSenha("senha123", "novasenha123");


    }

}

