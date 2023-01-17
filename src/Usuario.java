public class Usuario {

    //  ATRIBUTOS

    // id seria controlado via aplicação ou via banco de dados?

    private String nomeUsuario;
    private String senha;
    private String email;
    private String cpf;

    //  CONSTRUTORES
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario; // "this." referencia algo fora do escopo do metódo, algo global, da instância.
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // METODOS

    // SOBRECARGA DE METODOS

    /*

    cadastrarUsuario();
    fazerLogin();
    fazerLogout();
    alterarUsuario();
    alterarSenha();
    alterarEmail();

     */
}
