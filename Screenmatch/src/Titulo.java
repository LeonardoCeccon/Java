public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDeAv;
    private int totalDeAvaliacao;
    private int duracaoEmMin;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getSomaDeAv() {
        return somaDeAv;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void setTotalDeAvaliacao(int totalDeAvaliacao) {
        this.totalDeAvaliacao = totalDeAvaliacao;
    }

    public int getDuracaoEmMin() {
        return duracaoEmMin;
    }

    public void setDuracaoEmMin(int duracaoEmMin) {
        this.duracaoEmMin = duracaoEmMin;
    }

    void exibeFicha(){
        System.out.println(this.nome);
        System.out.println(this.anoDeLancamento);
    }

    public void avalia(double nota){
        somaDeAv += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia(){
        return somaDeAv/totalDeAvaliacao;
    }
}

