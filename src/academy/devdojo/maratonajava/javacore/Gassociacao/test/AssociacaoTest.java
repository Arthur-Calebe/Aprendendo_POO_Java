package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;


public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Artes");
        Aluno aluno = new Aluno("Arthur Calebe", 18);
        Aluno aluno1 = new Aluno("Cauê", 22);
        Professor professor = new Professor("Paulo", "Algebra");
        Aluno[] alunosSeminario = {aluno, aluno1};
        Seminario seminario = new Seminario("Engenharia voltada para software", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
