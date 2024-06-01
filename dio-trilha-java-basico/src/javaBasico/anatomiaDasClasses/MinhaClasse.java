package javaBasico.anatomiaDasClasses;

public class MinhaClasse {

    public static void main(String[] args) {
        //System.out.print("Olá! Sejam bem-vindos ao meu primeiro código em Java!");
        int ano = 2021;
        ano = 2022;

        final String BR = "Brasil";
        /* quando a variável é maiúscula, assume-se que ela é do tipo final
         e não pode receber outros valores além do que foi declarado

        Exemplos de variáveis com letras maiúsculas (imutáveis) */

        double PI = 3.14;
        int ESTADOS_BRASILEIROS = 27;
        int ANO_2000 = 2000;

        /* Declação inválida de variáveis
        int numero&um = 1; //Os únicos símbolos permitidos são _ e $
        int 1numero = 1; //Uma variável não pode começar com númerico
        int numero um = 1; //Não pode ter espaço no nome da variável
        int long = 1; // long faz parte das palavras reservadas da linguagem */

        // Declaração válida de variáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;

        /* Declarar uma variável em Java segue sempre a seguinte estrutura:

        Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos);

        Exemplo:

        int idade = 23;

        double altura = 1.62;

        Dog spike; observe que aqui a variável spike não tem valor, é normal */

        String meuNome = "César";

        int anoFabricacao = 2024;

        boolean verdadeira = true;

        /* Declarar métodos em Java segue uma estrutura bem simples:

        Estrutura:

        TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

        Exemplos:

        int somar (int numeroUm, int numero2)
        String formatarCep (long cep)         */

        String primeiroNome = "César";
        String segundoNome = "Ribeiro";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        //somar uma string é outra forma de concatenar além de .concat()
    }

    //Exemplos de Convenção Java Beans

    /*
    Não recomendado

    double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
    String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
    String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não

    Recomendado

    double salarioMedio=1500.23;
    tring email ="aluno@escola.com";
    tring [] emails = {"aluno@escola.com","professor@escola.com"}
    tring meuNome = "JOSEPH"

    Exemplos sugeridos para nomenclatura de métodos:

    somar(int n1, int n2){}
    abrirConexao(){}
    concluirProcessamento() {}
    findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada
    calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade

    */


}