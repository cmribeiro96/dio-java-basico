public class MinhaClasse {

    public static void main(String[] args) {

        System.out.print("Olá! Sejam bem-vindos ao meu primeiro projeto em Java!");

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

        // Declaração válida de veriáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;

    }

}