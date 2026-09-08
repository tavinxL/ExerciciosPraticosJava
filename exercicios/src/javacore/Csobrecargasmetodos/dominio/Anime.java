package javacore.Csobrecargasmetodos.dominio;

public class Anime {
    private String tipo;
    private int episodio;

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
