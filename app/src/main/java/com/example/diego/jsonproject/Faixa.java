package com.example.diego.jsonproject;


/**
 * Created by Diego on 12/03/2017.
 */
public class Faixa {
    private String titulo;
    private String duracao;
    private String vocal;

    public Faixa() {
    }

    public Faixa(String titulo, String duracao, String vocal) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.vocal = vocal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getVocal() {
        return vocal;
    }

    public void setVocal(String vocal) {
        this.vocal = vocal;
    }

    @Override
    public String toString() {
        return "Faixa:\n" +
                "titulo=" + titulo + "\n" +
                "duracao=" + duracao + "\n" +
                "vocal=" + vocal + "\n";
    }
}
