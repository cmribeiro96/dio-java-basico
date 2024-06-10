package javaBasico.controleDeFluxo;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                //break; interrompe o for completamente
                continue; //continua executando excluindo somente o numero 3

            System.out.println(numero);

        }
        //Qual a saída no console ?

    }
}
