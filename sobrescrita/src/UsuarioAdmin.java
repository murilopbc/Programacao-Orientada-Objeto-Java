public class UsuarioAdmin extends Usuario {
    public UsuarioAdmin(String nome, String email, String senha) {
        super(nome, email, senha);
    }
    @Override
    void concederAcessos(){
        super.concederAcessos();
        System.out.printf("Usuário %s está com acessos administrativos\n", this.nome);
    }
}
