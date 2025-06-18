
public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("fuck you");
        musica1.setArtista("blackbear");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        Podcast pod1 = new Podcast();
        pod1.setTitulo("Aula de POO");
        pod1.setHost("Prof loira q eu n lembro o nome");

        for (int i = 0; i < 5000; i++) {
            pod1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            pod1.curte();
        }

        Favoritas fav1 = new Favoritas();
        fav1.inclui(pod1);
        fav1.inclui(musica1);
    }
}