import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria("8hs");
        curso.setCalcularXp(100);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de Python");
        curso2.setCargaHoraria("8hs");
        curso2.setCalcularXp(100);

        Curso curso3 = new Curso();
        curso3.setTitulo("JavaScript");
        curso3.setDescricao("Curso de JavaScript");
        curso3.setCargaHoraria("8hs");
        curso3.setCalcularXp(100);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());
        mentoria.setXp(100);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Python");
        mentoria2.setDescricao("Mentoria de Python");
        mentoria2.setData(LocalDate.now());
        mentoria2.setXp(100);

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("JavaScript");
        mentoria3.setDescricao("Mentoria de JavaScript");
        mentoria3.setData(LocalDate.now());
        mentoria3.setXp(100);

        System.out.println(curso);
    }
}