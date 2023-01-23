import java.util.Objects;
import java.util.Scanner;

final class Usuario extends Pessoa {

    //  ATRIBUTOS

    // id seria controlado via aplicação ou via banco de dados?

    private String nomeUsuario;
    private String senha;
    private String email;
    private String cpf;
    private static int  quantidadeUsuarioCriados;

    //  CONSTRUTORES
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void nomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario; // "this." referencia algo fora do escopo do metódo, algo global, da instância.
    }

    public String getSenha() {
        return senha;
    }

    public void senha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void email(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void cpf(String cpf) {
        this.cpf = cpf;
    }

    public Usuario() {
        atualizarQuantidadeUsuario();
    }

    public Usuario(String nome, String sobrenome, String sexo, String dataNascimento, String nomeUsuario, String senha, String email, String cpf) {
        super(nome, sobrenome, sexo, dataNascimento);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        atualizarQuantidadeUsuario();
    }

    // METODOS E SOBRECARGA DE METODOS

    /*
    cadastrarUsuario();
    fazerLogin();
    fazerLogout();
    alterarUsuario();
    alterarSenha();
    alterarEmail();
     */

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
    private void atualizarQuantidadeUsuario() {
        quantidadeUsuarioCriados++;
        //System.out.printf("Cadastrado Usuário %s com sucesso!\n", quantidadeUsuarioCriados);
    }

    public int getQuantidadeUsuarioCriados(){
        return quantidadeUsuarioCriados;
    }

    public String validarLogin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o usuário: ");
        String loginUsuario = scanner.nextLine();

        System.out.println("Informe a senha: ");
        String senhaInformada = scanner.nextLine();

        if (Objects.equals(loginUsuario, nomeUsuario) && Objects.equals(senhaInformada,senha)){
            return  "Usuário autenticado com sucesso!";

        }else{
            return "Usuário ou Senha inválido!";
        }
    }

    public String alterarUsuario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o NOVO nome usuário: ");
        String novoNomeUsuario = scanner.nextLine();

        nomeUsuario = novoNomeUsuario;

        return "Nome de Usuário alterado com sucesso!";
    }

}
