import controller.ProfessorController;
import model.Pessoa;
import model.Professor;

import java.util.Scanner;

public class MaIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProfessorController professorController = new ProfessorController();
        Professor p = new Professor();

        System.out.println("Digite o nome do Professor:");
        p.setNome(sc.next());
        System.out.println("Digite a idade do Professor:");
        p.setIdade(sc.nextInt());
        System.out.println("Digite a especializaçao do professor");
        p.setEspecialização(sc.next());

        professorController.cadastrarProfessor(p);




    }
}
