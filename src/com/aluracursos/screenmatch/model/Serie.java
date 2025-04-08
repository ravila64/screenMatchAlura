package com.aluracursos.screenmatch.model;

public class Serie extends Titulo {
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;
    // gettes - setters

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpidisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpidisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}

