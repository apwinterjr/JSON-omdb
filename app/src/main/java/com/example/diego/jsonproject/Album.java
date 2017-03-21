package com.example.diego.jsonproject;

import java.util.List;

/**
 * Created by Diego on 12/03/2017.
 */
public class Album {

    private String nomeBanda;
    private String nomeAlbum;
    private int anoAlbum;
    private List<Faixa> faixas;

    public Album() {
    }

    public Album(String nomeBanda, String nomeAlbum, int anoAlbum, List<Faixa> faixas) {
        this.nomeBanda = nomeBanda;
        this.nomeAlbum = nomeAlbum;
        this.anoAlbum = anoAlbum;
        this.faixas = faixas;
    }

    public String getNomeBanda() {
        return nomeBanda;
    }

    public void setNomeBanda(String nomeBanda) {
        this.nomeBanda = nomeBanda;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public int getAnoAlbum() {
        return anoAlbum;
    }

    public void setAnoAlbum(int anoAlbum) {
        this.anoAlbum = anoAlbum;
    }

    public List<Faixa> getFaixas() {
        return faixas;
    }

    public void setFaixas(List<Faixa> faixas) {
        this.faixas = faixas;
    }

    @Override
    public String toString() {
        return "Album: \n" +
                "nomeBanda=" + nomeBanda + "\n" +
                "nomeAlbum=" + nomeAlbum + "\n" +
                "anoAlbum=" + anoAlbum + "\n" +
                "faixas=" + faixas;
    }
}
