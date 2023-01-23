import java.math.BigDecimal;
import java.util.Scanner;

public class Evento {

    // ATRIBUTOS

    private String tituloEvento;
    private String descricaoEvento;
    private String localizacao;
    private String data;
    private String horario;
    private BigDecimal valorIngresso;
    private static int  quantidadeEventoCriados;

    public String getTituloEvento() {
        return tituloEvento;
    }

    public Evento tituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
        return this;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public Evento descricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
        return this;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public Evento localizacao(String localizacao) {
        this.localizacao = localizacao;
        return this;
    }

    public String getData() {
        return data;
    }

    public Evento data(String data) {
        this.data = data;
        return this;
    }

    public String horario() {
        return horario;
    }

    public Evento setHorario(String horario) {
        this.horario = horario;
        return this;
    }

    public BigDecimal getValorIngresso() {
        return valorIngresso;
    }

    public Evento valorIngresso(BigDecimal valorIngresso) {
        this.valorIngresso = valorIngresso;
        return this;
    }

    public Evento() {
        atualizarEventoUsuario();
    }

    public Evento(String tituloEvento, String descricaoEvento, String localizacao, String data, String horario, BigDecimal valorIngresso) {
        this.tituloEvento = tituloEvento;
        this.descricaoEvento = descricaoEvento;
        this.localizacao = localizacao;
        this.data = data;
        this.horario = horario;
        this.valorIngresso = valorIngresso;
    }

    public Evento build(){
        return new Evento(tituloEvento,descricaoEvento,localizacao,data,horario,valorIngresso);
    }

    // METODOS


    @Override
    public String toString() {
        return "Evento{" +
                "tituloEvento='" + tituloEvento + '\'' +
                ", descricaoEvento='" + descricaoEvento + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                ", valorIngresso=" + valorIngresso +
                '}';
    }

    private void atualizarEventoUsuario() {
        quantidadeEventoCriados++;
        //System.out.printf("Cadastrado Usuário %s com sucesso!\n", quantidadeUsuarioCriados);
    }

    public int getQuantidadeEventoCriados(){
        return quantidadeEventoCriados;
    }

    public String alterarInformacoesEvento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Informe qual o tipo de informação do evento deseja alterar:
                1. Titulo
                2. Descricao""");
        int opcaoEscolhida = scanner.nextInt();
        scanner.nextLine();

        boolean validaAlteracao = false;

        switch (opcaoEscolhida) {
            case 1 -> {
                System.out.println("Informe o novo Titulo do Evento: ");
                String novoTitulo = scanner.nextLine();
                tituloEvento = novoTitulo;
                validaAlteracao = true;
            }
            case 2 -> {
                System.out.println("Informe a nova Descricao do Evento: ");

                String novaDescricao = scanner.nextLine();
                descricaoEvento = novaDescricao;
                validaAlteracao = true;
            }
        }

        if (validaAlteracao == true) {
            return "Alteração realizada com sucesso!";
        }else{
            return "Opção inválida!";
        }
    }
}
