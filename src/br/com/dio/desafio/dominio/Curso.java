package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private String cargaHoraria;
    private int calcularXp;

    // public Curso(String titulo, String descricao, String cargaHoraria, Integer calcularXp) {
    //     this.titulo = titulo;
    //     this.descricao = descricao;
    //     this.cargaHoraria = cargaHoraria;
    //     this.calcularXp = calcularXp;
    // }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getCalcularXp() {
        return calcularXp;
    }

    public void setCalcularXp(Integer calcularXp) {
        this.calcularXp = calcularXp;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria
                + ", calcularXp=" + calcularXp + '}';
    }

}
