
public class Main {
    public static void main(String[] args) {
        UsuarioAdmin usuario = new UsuarioAdmin("Murilo", "123", "murilo@example.com");
        usuario.autenticar();
        usuario.concederAcessos();

    }
}