package exercicios;

/*
* Dadas as seguintes informações sobre minhas séries favoritas,
* crie um conjunto e ordene este conjunto exibindo:
* (nome - genero - tempo de episódio)
*
* Serie 1 - Nome: got, genero: fantasia, tempoEpisodio: 60
* Serie 2 - Nome: dark, genero: drama, tempoEpisodio: 60
* Serie 3 - Nome: that '70 show, genero: comedia, tempoEpisodio: 25
* */

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got","fantasia", 60));
            add(new Serie("dark","drama", 60));
            add(new Serie("that '70 show","comedia", 60));
        }};
            for (Serie serie: minhasSeries)
                System.out.println(serie.getNome() +  "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());


        System.out.println("--\tOrdem de inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia", 60));
            add(new Serie("dark","drama", 60));
            add(new Serie("that '70 show","comedia", 60));
        }};
        for (Serie serie: minhasSeries1)
            System.out.println(serie.getNome() +  "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        System.out.println(minhasSeries2);








    }
}
class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    //construtor

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    //sobrescrevendo o toString
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio='" + tempoEpisodio + '\'' +
                '}';
    }

    //sobrescrevendo equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }
}
