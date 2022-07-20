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
        curso2.setDescricao("descrição curso js"); 
        curso2.setTitulo("js"); 

        Mentoria mentoria1 = new Mentoria(); 
        mentoria1.setTitulo("mentoria de java"); 
        mentoria1.setDescricao("descrição da mentoria Java"); 
        mentoria1.setData(LocalDate.now()); 

        System.out.println(curso1); 
        System.out.println(curso2); 
        System.out.println(mentoria1);
    }
}
