package Fabrica.dispositivos.copiadora;

import Fabrica.dispositivos.digitalizadora.Digitalizadora;

public class Scanner implements Digitalizadora {
    public void digitalizar(){
        System.out.println("DIGITALIZANDO");
    }
}
