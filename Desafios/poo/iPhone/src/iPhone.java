public class iPhone {
    public static void main(String[] args) {

        Celular iPhone = new Celular();

        System.out.println("Usando reprodutor de músicas: ");
        iPhone.selecionarMusica("Minha Musica");
        iPhone.tocar();
        iPhone.pausar();

        System.out.println();

        System.out.println("Usando função de telefone: ");
        iPhone.ligar("(00)3232-3232");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println();

        System.out.println("Usando navegador de internet: ");
        iPhone.exibirPagina("http://www.meusite.com.br");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        System.out.println("FIM DA EXECUÇÃO DO PROGRAMA");

    }
}
