package modelos;

public class Musica extends Audio{
    private String genero;
    private String letra;
    private String compositor;
    private String produtor;
    private int ano;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrarCreditos(){
        System.out.println("Composta por: " + compositor);
        System.out.println("Em: " + ano);
        System.out.println("Produzida por: " + produtor);
    }

}

