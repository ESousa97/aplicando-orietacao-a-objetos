package Aula01.Desafio_pessoais.praticando7;

public class MediaAluno {
        public static void main(String[] args) {
        Aluno aluno = new Aluno();

        double media = aluno.notas();
        System.out.printf("A média anual do aluno é: %.2f%n", media);
    }
}
