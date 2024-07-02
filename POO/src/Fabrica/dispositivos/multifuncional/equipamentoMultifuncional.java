package Fabrica.dispositivos.multifuncional;

import Fabrica.dispositivos.copiadora.Copiadora;
import Fabrica.dispositivos.digitalizadora.Digitalizadora;
import Fabrica.dispositivos.impressora.Impressora;

public class equipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar(){
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void imprimir(){
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIOINAL");
    }
}
