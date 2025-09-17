import br.com.alura.spotify.modelos.Musica;
import br.com.alura.spotify.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.curtirAudio();
        System.out.println(musica1.getCurtidas());

        Podcast podcast1 = new Podcast();

        podcast1.setHost("Igor3k");
        podcast1.setTitulo("Aprendendo java com Guilherme Matsumura");
        podcast1.setDescricao("Falando sobre java enquanto Guilherme aprende a codar");

        for (int i = 0; i < 10; i++) {
            podcast1.reproduzirAudio();
            podcast1.curtirAudio();
        }

        System.out.println(podcast1.getFicha());
        }
}