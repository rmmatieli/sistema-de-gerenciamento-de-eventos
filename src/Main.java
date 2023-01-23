/*
Nesse projeto será avaliado o aprendizado do seguintes itens do módulo atual:

* Abstração.
* Classes.
* Objetos.
* Construtores.
* Atributos e métodos de objetos ( de instâncias).
* Atributos e métodos de de classes (estáticos).
* Modificadores de acesso.
* Encapsulamento.
* Herança.
* Polimorfismo.
 */

import java.math.BigDecimal;

public class Main { // NOME DE CLASSE PascalCase
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("João","Silva","Masculino","21/04/1998","joao.silva","senha","joao.silva@gmail.com","12345678912");

        System.out.println(usuario1);
        System.out.println("Idade atual: " + usuario1.calcularIdade());
        // Chamando Metodo para validar login
        System.out.println(usuario1.validarLogin());
        //Chamando Metodo para alterar usuário
        System.out.println(usuario1.alterarUsuario());
        System.out.println("Usuario atualizado: \n" + usuario1);

        int qtdeUsuario = usuario1.getQuantidadeUsuarioCriados();
        System.out.println("Usuários Cadastrados: " + qtdeUsuario);

        System.out.println("----------------------------------------------------------");

        Evento evento1 = new Evento()
                .descricaoEvento("Filme de ficção cientifica espetacular...")
                .valorIngresso(BigDecimal.valueOf(15.00))
                .setHorario("21:00")
                .data("30/01/2023")
                .localizacao("Cinemark Vitória")
                .tituloEvento("Avatar")
                .build();

        System.out.println(evento1);

        int qtdeEvento = evento1.getQuantidadeEventoCriados();
        System.out.println("Eventos Cadastrados: " + qtdeEvento);

        System.out.println(evento1.alterarInformacoesEvento());

        System.out.println("Evento atualizado: \n" + evento1);
    }
}