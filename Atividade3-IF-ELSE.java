// Atividade 3. (IF and ELSE)
// Verificacao de login: Crie um programa Java que pede ao usuario para inserir seu nome de usuario e senha. Se o nome de usuario for "usuario" e a senha for "senha123", o programa deve imprimir "Login bem-sucedido". Caso contrario, deve imprimir "Nome de usuario ou senha incorretos".

import java.util.Scanner;

public class LoginDeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuario = "usuario";
        String senha = "senha123";

        System.out.println("Digite seu usuario: ");
        String DigitUsuario = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String DigitSenha = scanner.nextLine();

        if (usuario.equals(DigitUsuario) && senha.equals(DigitSenha)) {
            System.out.println("Login bem-sucedido");
        } else {
            System.out.println("Nome de usuario ou senha incorretos");
        }
    }
}
