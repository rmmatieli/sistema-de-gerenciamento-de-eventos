import java.time.*;
import java.time.format.DateTimeFormatter;

abstract class Pessoa { //abstract

    // ATRIBUTOS

    private String nome;
    private String sobrenome;
    //private int idade; criar uma variavel ou calcular a partir da data de nascimento?
    //private int cpf; Pode haver pessoa fisica ou juridica
    private String sexo;
    private String dataNascimento;

    public String getNome() {
        return nome;
    }

    public Pessoa nome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Pessoa sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public String getSexo() {
        return sexo;
    }

    public Pessoa sexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Pessoa dataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    // CONSTRUTOR / ENCAPSULAMENTO
    public Pessoa() {

    }

    public Pessoa(String nome, String sobrenome, String sexo, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    /*
    public Pessoa build(){
        return new Pessoa(nome, sobrenome, sexo, dataNascimento);
    }
     */

    // METODOS

    /*
    formataData();
    calcularIdade();
     */

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public LocalDate formataData(String data){
        DateTimeFormatter modeloData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, modeloData);
    }
    public int calcularIdade() {
        int idade;
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a data de nascimento: ");
        String dataNascimento = scanner.nextLine();
         */

        // Formatando tipo String em LocalDate
        LocalDate dataNascimentoFormatada = formataData(dataNascimento);

        LocalDate dataAtual;
        dataAtual = LocalDate.now();

        int mesAtual = dataAtual.getMonthValue();
        int mesNascimento = dataNascimentoFormatada.getMonthValue();

        if (mesAtual >= mesNascimento){
            idade = dataAtual.getYear() - dataNascimentoFormatada.getYear();
        }else {
            idade = dataAtual.getYear() - dataNascimentoFormatada.getYear() - 1;
        }

        return idade;
    }

}
