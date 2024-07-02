package Fabrica.dispositivos;

import Fabrica.dispositivos.copiadora.Copiadora;
import Fabrica.dispositivos.copiadora.Scanner;
import Fabrica.dispositivos.digitalizadora.Digitalizadora;
import Fabrica.dispositivos.impressora.Deskjet;
import Fabrica.dispositivos.impressora.Impressora;
import Fabrica.dispositivos.multifuncional.equipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        equipamentoMultifuncional em = new equipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        Scanner scanner = new Scanner();

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
