package javaBasico.tiposEvariaveis;

public class TiposVariaveis {
    /*
    Declaração de variáveis
    A estrutura padrão para se declarar uma variável sempre é:

    <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

    Exemplos:
    int idade; Tipo "int", nome "idade", com nenhum valor atribuído.
    int anoFabricacao = 2021; tipo "int", nome "anoFabricacao", com valor 2021.
    double salarioMinimo = 2.500; tipo "double", nome "salarioMinimo", valor 2.500.

    Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos.
    Observe no exemplo abaixo:

    public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		//Note que o tipo long precisa terminar com a letra L após o número.
		float pi = 3.14F; //sempre que a variável for do tipo float, tem que encerrar com um F.
		double salario = 1275.33;
	}
}

    2.500 não é equivalente a 2500
    2.500 seria o equivalente a 2,5

    Para declarar milhar e casa decimal numa variável do tipo double, seria conforme abaixo:

    double salarioMinimo = 2500.33

    // TiposEVariaveis.java

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = numeroNormal;

    */

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        double salarioMinimo = 2.500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //note que a IDE sugeriu um casting aqui

        //casting é justamente uma adequação de um valor numérico que possa variar
        //o casting impõe um escopo, uma limitação para o valor da variável.
        //inicialmente uma variável pode ter um valor mas ao final da aplicação passa a ter outro.
        //Desde que o número tenha um

        /*
         * esta linha é considerada como declaração de variável iniciamos a existência
         * variavel numero com valor 5 regra: tipo + nome + valor
         */
        int numero = 5;

        /*
         * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
         * não é mais necessário, pois a variável já foi declarada anteriormente
         */
        numero = 10;

        System.out.print(numero);

        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variavel poderá obter outro valor;
         * logo a linha 25 vai apresentar um erro de compilação
         * isso é considerado uma CONSTANTE na linguagem Java
         */

        //Exemplo de constante:
        final double VALOR_DE_PI = 3.14; // valores constantes devem ser declarados em caixa alta!

        //VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação se for final!
    }
}
