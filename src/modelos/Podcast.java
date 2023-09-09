package modelos;

public class Podcast extends Audio {
    private String convidados;
    private String topico;
    private int data;
    private int edicao;
    private String descricao;
    private String comentarios;

    public String getConvidados() {
        return convidados;
    }

    public void setConvidados(String convidados) {
        this.convidados = convidados;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void comentar(){
        comentarios += comentarios;
    }

    public void verComentarios(){
        System.out.println("Comentários: " + comentarios);
    }

}
