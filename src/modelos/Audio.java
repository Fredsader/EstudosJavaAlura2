package modelos;

public class Audio {
    private String titulo;
    private boolean tocando;
    private int duracao;
    private int reproducoes;
    private String artista;
    private int curtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }


    public void reproduzir(){
        tocando = true;
        reproducoes++;
    }

    public void curtir(){
        curtidas++;
    }

    public void exibeFicha(){
        if (tocando){
            System.out.println("Tocando agora: ");
        }
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duração em minutos: " + getDuracao());
        System.out.println("Número de reproduções: " + getReproducoes());
        System.out.println("Número de curtidas: " + getCurtidas());

        // Verificar se a instância atual é uma instância de Musica
        if (this instanceof Musica) {
            Musica musica = (Musica) this; // Faz um casting para Musica
            System.out.println("Gênero: " + musica.getGenero());
            System.out.println("Letra: " + musica.getLetra());
        } else if (this instanceof Podcast) {
            Podcast podcast = (Podcast) this;
            System.out.println("Convidados: " + podcast.getConvidados() );
            System.out.println("Tópico: " + podcast.getTopico());
            System.out.println("Data: " + podcast.getData());
            System.out.println("Descrição: " + podcast.getDescricao());
            System.out.println("Edição: " + podcast.getEdicao());
        }
    }


    public void adicionarFila(){
        System.out.println(titulo + "Adicionado à fila");
    }

    public void avancarAudio(){
        System.out.println("Tocando próximo da fila...");
    }
}
