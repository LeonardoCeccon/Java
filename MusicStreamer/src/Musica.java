public class Musica extends Audio{
    private String albumm;
    private String artista;
    private String genero;

    public String getAlbumm() {
        return albumm;
    }

    public void setAlbumm(String albumm) {
        this.albumm = albumm;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 2000){
            return 10;
        }else{
            return 7;
        }
    }
}
