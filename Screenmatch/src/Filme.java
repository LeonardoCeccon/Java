public class Filme extends Titulo implements Classificavel{
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    private String diretor;

    @Override
    public int getClassificacao() {
        return 0;
    }
}

