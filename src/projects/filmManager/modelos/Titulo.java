package projects.filmManager.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("🎬 Nome: " + nome);
        System.out.println("📅 Ano de lançamento: " + anoDeLancamento);
        System.out.println("📦 Incluído no plano: " + (incluidoNoPlano ? "Sim" : "Não"));
        System.out.println("⭐ Avaliação média: " + somaDasAvaliacoes);
        System.out.println("🧮 Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("⏱️ Duração: " + duracaoEmMinutos + " minutos");
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes += nota;
    }

    public double obterMedia(){
        return somaDasAvaliacoes /  totalDeAvaliacoes;
    }
}
