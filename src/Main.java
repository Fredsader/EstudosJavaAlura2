import modelos.Musica;
import modelos.Podcast;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("There is a light that never goes out");
        musica1.setArtista("The Smiths");
        musica1.setDuracao(4);
        musica1.setAno(1986);
        musica1.setGenero("Early Indie");
        musica1.setCompositor("Johnny Marr & Morrissey");
        musica1.setProdutor("WM UK");

        musica1.curtir();
        musica1.reproduzir();
        musica1.exibeFicha();
        musica1.mostrarCreditos();


        Podcast podpah = new Podcast();


        }
    }
