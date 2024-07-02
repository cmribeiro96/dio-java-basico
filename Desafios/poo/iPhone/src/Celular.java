public class Celular implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico{
    @Override
    public void tocar() {
        System.out.println("O iPhone está tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("A música foi pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("A música \"%s\" foi selecionada.%n", musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para: %s...%n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando corrreio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo a pagina: %s%n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina...");
    }
}
