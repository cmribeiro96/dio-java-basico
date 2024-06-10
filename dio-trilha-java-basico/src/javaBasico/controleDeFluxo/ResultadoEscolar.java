package javaBasico.controleDeFluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if(nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");

        //Operadores Ternários
        //Cenário 1:
        int notaExemplo1 = 7;
        String resultado1 = notaExemplo1 >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado1);

        //Cenário 2:
        int notaExemplo2 = 6;
        String resultado2 = notaExemplo2 >=7 ? "Aprovado" : notaExemplo2 >=5 && notaExemplo2 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }
    }
}
