
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Murilo", "123", "murilo@example.com");
        usuario.autenticar();
        usuario.concederAcessos();

    }
}