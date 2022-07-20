import dominio.*; 
import java.time.LocalDate; 

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso(); 
        curso1.setCargaHoraria(8); 
        curso1.setDescricao("descrição curso java"); 
        curso1.setTitulo("java"); 

        Curso curso2 = new Curso(); 
        curso2.setCargaHoraria(4); 
        curso2.setDescricao("HTML CSS E JS"); 
        curso2.setTitulo("JavaScript"); 

        Mentoria mentoria1 = new Mentoria(); 
        mentoria1.setTitulo("mentoria de java"); 
        mentoria1.setDescricao("descrição da mentoria Java"); 
        mentoria1.setData(LocalDate.now()); 

        Bootcamp bootcamp1 = new Bootcamp(); 
        bootcamp1.setNome("Santander Code Girls"); 
        bootcamp1.setDescricao("Java e Spring Framework");
        bootcamp1.getConteudos().add(curso1);  
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp(); 
        bootcamp2.setNome("JavaScript"); 
        bootcamp2.setDescricao("HTML CSS E JS"); 
        bootcamp2.getConteudos().add(curso2); 

        Dev devMariaGabriela = new Dev(); 
        devMariaGabriela.setNome("Maria Gabriela Rodrigues Policarpo"); 
        devMariaGabriela.inscreverBootcamp(bootcamp1);
        System.out.println("Maria Inscrita: " + devMariaGabriela.getConteudosInscritos()); 
        devMariaGabriela.progredir();
        devMariaGabriela.progredir(); 
        System.out.println("Maria depois de progredir: " + devMariaGabriela.getConteudosInscritos());
        System.out.println("O que Maria concluiu: " + devMariaGabriela.getConteudosConcluidos());
        System.out.println("XP após concluir: " + devMariaGabriela.calcularTotalXp()); 

        System.out.println("--------------"); 

        Dev devCamila = new Dev(); 
        devCamila.setNome("Camila Cavalcanti");
        devCamila.inscreverBootcamp(bootcamp2); 
        System.out.println("Camila: " + devCamila.getConteudosInscritos()); 
        devCamila.progredir();
        System.out.println("Camila depois de progredir: " + devCamila.getConteudosInscritos());
        System.out.println("O que Camila concluiu: " + devCamila.getConteudosConcluidos());
        System.out.println("XP após concluir: " + devCamila.calcularTotalXp());

    }
}
