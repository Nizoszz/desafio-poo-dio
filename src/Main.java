import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de Python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Python");
        mentoria2.setDescricao("Mentoria de Python");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java developer");
        bootcamp.setData(LocalDate.now());
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Python Developer");
        bootcamp2.setDescricao("Descrição do bootcamp Python developer");
        bootcamp2.setData(LocalDate.now());
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria2);

        Dev devJoseph = new Dev();
        devJoseph.setNome("Joseph");
        devJoseph.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos inscritos" + devJoseph.getConteudosInscritos());
        devJoseph.progredir();
        System.out.println("\nConteudos inscritos" + devJoseph.getConteudosInscritos());
        System.out.println("\nConteudos concluidos" + devJoseph.getConteudosConcluidos());
        System.out.println("XP: " + devJoseph.calcularXp());

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp2);
        System.out.println("\nConteudos inscritos" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("\nConteudos inscritos" + devMaria.getConteudosInscritos());
        System.out.println("\nConteudos concluidos" + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularXp());

    }
}