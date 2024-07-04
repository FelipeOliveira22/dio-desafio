import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Python");
        curso1.setDescricao("Descrição do curso de Python");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de C#");
        curso2.setDescricao("Descrição do curso de C#");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira");
        mentoria.setDescricao("Descrição da mentoria de carreira");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Full Stack Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Full Stack Developer");
        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria);

        Dev devAlice = new Dev();
        devAlice.setNome("Alice");
        devAlice.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alice:" + devAlice.getConteudosInscritos());
        devAlice.progredir();
        devAlice.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alice:" + devAlice.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alice:" + devAlice.getConteudosConcluidos());
        System.out.println("XP:" + devAlice.calcularTotalXp());

        System.out.println("-------");

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruno:" + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruno:" + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Bruno:" + devBruno.getConteudosConcluidos());
        System.out.println("XP:" + devBruno.calcularTotalXp());
    }
}
