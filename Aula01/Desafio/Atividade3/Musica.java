package Aula01.Desafio.Atividade3;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;

    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        if (totalDeAvaliacoes == 0) return 0.0;
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
