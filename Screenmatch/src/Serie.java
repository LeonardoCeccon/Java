public class Serie extends Titulo{
    private int temporadas;
    private int epPorTemporada;

    private int minPorEp;

    public int getAtiva(){
        return ativa;
    }

    public void setAtiva(int ativa) {
        this.ativa = ativa;
    }

    private int ativa;

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public int getMinPorEp() {
        return minPorEp;
    }

    public void setMinPorEp(int minPorEp) {
        this.minPorEp = minPorEp;
    }

    public Serie(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getDuracaoEmMin() {
        return temporadas * epPorTemporada * minPorEp;
    }
}
