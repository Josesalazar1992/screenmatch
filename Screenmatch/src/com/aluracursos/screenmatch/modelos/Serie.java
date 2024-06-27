package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    int temporada;
    int episodioPorTemporada;
    int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos() {
        return temporada * episodioPorTemporada * minutosPorEpisodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
