package candidatura;
//import java.util.concurrent.ThreadLocalRandom; //Case 2
import java.util.Random; //Case 3

public class ProcessoSeletivo {
    public static void main(String[] args) {
//        Case 1
//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);
//
//        System.out.println("Processo Seletivo");

        //selecaoCandidatos(); //Case 2

        //imprimirSelecionados(); //Case 3

        //Case 4
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }


    }



//    Case 1
//    static void analisarCandidato(double salarioPretendido){
//        double salarioBase = 2000.0;
//        if(salarioBase > salarioPretendido){
//            System.out.println("LIGAR PARA O CANDIDATO");
//        } else if (salarioBase == salarioPretendido) {
//            System.out.println("LIGAR PAR AO CANDIDATO COM CONTRA PROPOSTA");
//        } else {
//            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
//        }
//
//    };

/*
//Case 2:
    static void selecaoCandidatos(){
        // Array com a lista de candidatos (Case 2)

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido );
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
*/


/*      Case 3:
        static void imprimirSelecionados(){
            String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

            System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");

            for (int indice=0; indice < candidatos.length; indice++){
                System.out.println("O candidato de n° " + (indice+1) + " é o " + candidatos[indice]);
            }

            System.out.println("Forma abreviada de interação for each");

            for(String candidato: candidatos){
                System.out.println("O candidato selecionado foi " + candidato);
            }
        }
*/

    //Case 4:
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do{
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while(continuarTentando && tentativasRealizadas<3);
        if(atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        }else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }

    //método auxiliar Case 4
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }


}
