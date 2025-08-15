public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Grandes coisas - Fernandinho");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("(4002-8922)");
        iphone.iniciarCorreioVoz();
        iphone.encerrarChamada();

        iphone.exibirPagina("https://github.com/dinarteefilho");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}