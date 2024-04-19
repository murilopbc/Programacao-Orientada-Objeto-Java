public class Usuario {
    String nome;
    String email;
    String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // função void não retorna nada
    void autenticar() {
        System.out.printf("Usuário %s está autenticado\n", this.nome);

    }

    void concederAcessos() {
        System.out.printf("Usuário %s está com acessos regulares", this.nome);
    }

}
