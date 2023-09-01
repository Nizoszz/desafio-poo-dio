package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataTermino = dataInicio.plusDays(45);
    private Set<Dev> devsInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return nome.equals(bootcamp.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    public void setNome(String string) {
        nome = string;
    }

    public void setDescricao(String string) {
        descricao = string;
    }

    public void setData(LocalDate now) {
    }

}
