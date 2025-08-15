public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String musicaAtual;
    private String paginaAtual;
    private String numeroChamando;
    private boolean tocando = false;
    private boolean chamadaEmAndamento = false;

    public void tocar(){
        if (musicaAtual == null) {
            System.out.println("[MUSICA] Nenhuma musica selecionada.");
            return;
        }
        tocando = true;
        System.out.println("[MUSICA] Tocando: " + musicaAtual);
    }

    public void pausar(){
        if (!tocando) {
            System.out.println("[MUSICA] Ja esta pausado.");
        }
        tocando = false;
        System.out.println("[MUSICA] Pausado: " + musicaAtual);
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("[MUSICA] Selecionada: " + musicaAtual);
    }

    public void ligar(String numero) {
        if (chamadaEmAndamento) {
            System.out.println("[TELEFONE] Ja existe uma chamada em andamento para: " + numeroChamando);
            return;
        }
        this.numeroChamando = numero;
        this.chamadaEmAndamento = true;
        System.out.println("[TELEFONE] Ligando para " + numero + "...");
    }

    public void atender() {
        if (chamadaEmAndamento) {
            System.out.println("[TELEFONE] Chamada ja em andamento com: " + numeroChamando);
        } else {
            this.chamadaEmAndamento = true;
            this.numeroChamando = "Numero desconhecido";
            System.out.println("[TELEFONE] Atendeu a chamada.");
        }
    }

    public void iniciarCorreioVoz() {
        System.out.println("[TELEFONE] Acessando o Correio de Voz...");
    }

    public void encerrarChamada() {
        if (!chamadaEmAndamento) {
            System.out.println("[TELEFONE] Nao ha chamada para ser encerrada.");
            return;
        }
        System.out.println("[TELEFONE] Encerrando chamada com " + numeroChamando);
        chamadaEmAndamento = false;
        numeroChamando = null;
    }

    public void exibirPagina(String link) {
        this.paginaAtual = link;
        System.out.println("[NAVEGADOR] Exibindo: " + paginaAtual);
    }

    public void adicionarNovaAba() {
        System.out.println("[NAVEGADOR] Nova aba adicionada.");
    }

    public void atualizarPagina() {
        if (paginaAtual == null) {
            System.out.println("[NAVEGADOR] Nenhuma pagina para atualizar.");
            return;
        }
        System.out.println("[NAVEGADOR] Atualizando: " + paginaAtual);
    }
}