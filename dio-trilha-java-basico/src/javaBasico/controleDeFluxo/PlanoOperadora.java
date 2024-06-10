package javaBasico.controleDeFluxo;

public class PlanoOperadora {
    /*Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
O sistema terá 03 planos: BASIC, MIDIA , TURBO;
BASIC: 100 minutos de ligação;
MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
     */

    /* Estrutura com if/else
    public static void main(String[] args) {
        String plano = "M"; //M / T
        if(plano == "B") {
            System.out.println("100 minutos de ligação");
        }else if(plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
        }else if(plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5Gb Youtube");
        }
    }
     */
    public static void main(String[] args) {
        String plano = "M"; // M / T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
                break;//se faz necessário no use de case/switch para que a execução pare quando a condição for atendida.
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            //Se optarem por usar switch/case, estudem um pouco mais, sobre os conceitos de continue break e default
        }
    }
}
