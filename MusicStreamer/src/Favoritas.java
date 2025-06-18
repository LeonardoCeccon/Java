public class Favoritas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é top/pika da balada" );
        }else{
            System.out.println(audio.getTitulo() + " também é nice do nice");
        }
    }
}
